package edu.co.sena.ingresoceet.interacion.entities;

import edu.co.sena.ingresoceet.interacion.entities.Propietario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-01T10:27:19")
@StaticMetamodel(Equipo.class)
public class Equipo_ { 

    public static volatile SingularAttribute<Equipo, String> descripcion;
    public static volatile SingularAttribute<Equipo, String> marca;
    public static volatile SingularAttribute<Equipo, String> estado;
    public static volatile SingularAttribute<Equipo, String> serial;
    public static volatile CollectionAttribute<Equipo, Propietario> propietarioCollection;

}