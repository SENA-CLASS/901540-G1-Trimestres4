/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo3.integracion.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hernando
 */
@Entity
@Table(name = "habitante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Habitante.findAll", query = "SELECT h FROM Habitante h"),
    @NamedQuery(name = "Habitante.findByIdHabitante", query = "SELECT h FROM Habitante h WHERE h.idHabitante = :idHabitante"),
    @NamedQuery(name = "Habitante.findByNombreHabitante", query = "SELECT h FROM Habitante h WHERE h.nombreHabitante = :nombreHabitante")})
public class Habitante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idHabitante")
    private Integer idHabitante;
    @Size(max = 45)
    @Column(name = "nombre_habitante")
    private String nombreHabitante;
    @JoinColumn(name = "Casa_idCasa", referencedColumnName = "idCasa")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Casa casaidCasa;

    public Habitante() {
    }

    public Habitante(Integer idHabitante) {
        this.idHabitante = idHabitante;
    }

    public Integer getIdHabitante() {
        return idHabitante;
    }

    public void setIdHabitante(Integer idHabitante) {
        this.idHabitante = idHabitante;
    }

    public String getNombreHabitante() {
        return nombreHabitante;
    }

    public void setNombreHabitante(String nombreHabitante) {
        this.nombreHabitante = nombreHabitante;
    }

    public Casa getCasaidCasa() {
        return casaidCasa;
    }

    public void setCasaidCasa(Casa casaidCasa) {
        this.casaidCasa = casaidCasa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHabitante != null ? idHabitante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Habitante)) {
            return false;
        }
        Habitante other = (Habitante) object;
        if ((this.idHabitante == null && other.idHabitante != null) || (this.idHabitante != null && !this.idHabitante.equals(other.idHabitante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Habitante{" + "idHabitante=" + idHabitante + ", nombreHabitante=" + nombreHabitante + ", casaidCasa=" + casaidCasa + '}';
    }

    
    
}
