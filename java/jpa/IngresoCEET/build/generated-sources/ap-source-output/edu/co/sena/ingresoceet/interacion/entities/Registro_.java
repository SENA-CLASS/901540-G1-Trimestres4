package edu.co.sena.ingresoceet.interacion.entities;

import edu.co.sena.ingresoceet.interacion.entities.Cuenta;
import edu.co.sena.ingresoceet.interacion.entities.Propietario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-01T10:27:19")
@StaticMetamodel(Registro.class)
public class Registro_ { 

    public static volatile SingularAttribute<Registro, Date> fechaIngreso;
    public static volatile SingularAttribute<Registro, String> descripcionIngreso;
    public static volatile SingularAttribute<Registro, String> cargoIngreso;
    public static volatile SingularAttribute<Registro, Cuenta> cuenta;
    public static volatile SingularAttribute<Registro, Date> fehcaSalida;
    public static volatile SingularAttribute<Registro, Integer> idRegistro;
    public static volatile CollectionAttribute<Registro, Propietario> propietarioCollection;

}