package edu.co.sena.ingresoceet.interacion.entities;

import edu.co.sena.ingresoceet.interacion.entities.Cuenta;
import edu.co.sena.ingresoceet.interacion.entities.Equipo;
import edu.co.sena.ingresoceet.interacion.entities.PropietarioPK;
import edu.co.sena.ingresoceet.interacion.entities.Registro;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-01T10:27:19")
@StaticMetamodel(Propietario.class)
public class Propietario_ { 

    public static volatile SingularAttribute<Propietario, PropietarioPK> propietarioPK;
    public static volatile CollectionAttribute<Propietario, Registro> registroCollection;
    public static volatile SingularAttribute<Propietario, Equipo> equipo;
    public static volatile SingularAttribute<Propietario, Cuenta> cuenta;

}