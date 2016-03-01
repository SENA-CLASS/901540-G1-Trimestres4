/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ingresoceet.interacion.entities;

import edu.co.sena.ingresoceet.interacion.util.EntityManagerHelper;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hernando
 */
public class PropietarioTest {

    public PropietarioTest() {
    }

    EntityManager em;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        em = EntityManagerHelper.getEntityManager();
    }

    @After
    public void tearDown() {
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();
    }

    @Test
    public void testInsertEquipoConPropietario() {
        Propietario p = new Propietario();

        p.setEquipo(em.find(Equipo.class, "1234567"));
        Cuenta c = em.find(Cuenta.class, new CuentaPK("CC", "80013833"));
        System.out.println(c.getPrimerNombre());
        p.setCuenta(c);
        p.setPropietarioPK(new PropietarioPK(p.getEquipo().getSerial(),
                p.getCuenta().getCuentaPK().getTipoDocumentotipodocumento(),
                p.getCuenta().getCuentaPK().getNumeroDocumento()));

        EntityManagerHelper.beginTransaction();
        em.merge(p);
        EntityManagerHelper.commit();

    }

    @Test
    public void testInsertnATIVE() {
        String serial = "12345675";
        String tipoDocumento = "CC";
        String numeroDocumento = "80013833";
        EntityManagerHelper.beginTransaction();
        Query query;
        query = em.createNativeQuery("INSERT INTO propietario\n"
                + "(equipo_serial,\n"
                + "Cuenta_Tipo_Documento_tipo_documento,\n"
                + "Cuenta_numero_Documento)\n"
                + "VALUES\n"
                + "( '"+serial+"',\n"
                + "'"+tipoDocumento+"',\n"
                + "'"+numeroDocumento+"');");
        
        int updateCount = query.executeUpdate();
        EntityManagerHelper.commit();
       

    }

}
