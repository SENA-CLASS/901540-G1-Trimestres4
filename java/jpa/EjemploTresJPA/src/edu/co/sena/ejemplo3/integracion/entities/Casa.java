/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo3.integracion.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author hernando
 */
@Entity
@Table(name = "casa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Casa.findAll", query = "SELECT c FROM Casa c"),
    @NamedQuery(name = "Casa.findByIdCasa", query = "SELECT c FROM Casa c WHERE c.idCasa = :idCasa"),
    @NamedQuery(name = "Casa.findByDireccionCasa", query = "SELECT c FROM Casa c WHERE c.direccionCasa = :direccionCasa")})
public class Casa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCasa")
    private Integer idCasa;
    //@Size(max = 45) //no esta funcionando con el eclipselink ni con jpa
    @Column(name = "direccion_casa", length = 45)
    private String direccionCasa;
    @OneToMany(cascade = {CascadeType.REMOVE, CascadeType.PERSIST}, mappedBy = "casaidCasa", fetch = FetchType.LAZY)
    private Collection<Habitante> habitanteCollection;

    public Casa() {
    }

    public Casa(Integer idCasa) {
        this.idCasa = idCasa;
    }

    public Integer getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(Integer idCasa) {
        this.idCasa = idCasa;
    }

    public String getDireccionCasa() {
        return direccionCasa;
    }

    public void setDireccionCasa(String direccionCasa) {
        this.direccionCasa = direccionCasa;
    }

    @XmlTransient
    public Collection<Habitante> getHabitanteCollection() {
        return habitanteCollection;
    }

    public void setHabitanteCollection(Collection<Habitante> habitanteCollection) {
        this.habitanteCollection = habitanteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCasa != null ? idCasa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Casa)) {
            return false;
        }
        Casa other = (Casa) object;
        if ((this.idCasa == null && other.idCasa != null) || (this.idCasa != null && !this.idCasa.equals(other.idCasa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Casa{" + "idCasa=" + idCasa + ", direccionCasa=" + direccionCasa + '}';
    }


    
}
