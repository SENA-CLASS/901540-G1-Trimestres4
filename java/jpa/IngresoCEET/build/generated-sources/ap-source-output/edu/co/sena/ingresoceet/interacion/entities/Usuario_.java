package edu.co.sena.ingresoceet.interacion.entities;

import edu.co.sena.ingresoceet.interacion.entities.Cuenta;
import edu.co.sena.ingresoceet.interacion.entities.UsuarioPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-01T10:27:19")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> estado;
    public static volatile SingularAttribute<Usuario, String> pass;
    public static volatile SingularAttribute<Usuario, Cuenta> cuenta;
    public static volatile SingularAttribute<Usuario, UsuarioPK> usuarioPK;
    public static volatile SingularAttribute<Usuario, String> rol;

}