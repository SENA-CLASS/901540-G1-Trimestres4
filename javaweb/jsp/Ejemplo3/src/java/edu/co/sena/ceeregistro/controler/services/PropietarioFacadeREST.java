/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ceeregistro.controler.services;

import edu.co.sena.ceeregistro.model.entities.Propietario;
import edu.co.sena.ceeregistro.model.entities.PropietarioPK;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author hernando
 */
@Stateless
@Path("edu.co.sena.ceeregistro.model.entities.propietario")
public class PropietarioFacadeREST extends AbstractFacade<Propietario> {

    @PersistenceContext(unitName = "Ejemplo3PU")
    private EntityManager em;

    private PropietarioPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;equipoSerial=equipoSerialValue;cuentaTipoDocumentotipodocumento=cuentaTipoDocumentotipodocumentoValue;cuentanumeroDocumento=cuentanumeroDocumentoValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        edu.co.sena.ceeregistro.model.entities.PropietarioPK key = new edu.co.sena.ceeregistro.model.entities.PropietarioPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> equipoSerial = map.get("equipoSerial");
        if (equipoSerial != null && !equipoSerial.isEmpty()) {
            key.setEquipoSerial(equipoSerial.get(0));
        }
        java.util.List<String> cuentaTipoDocumentotipodocumento = map.get("cuentaTipoDocumentotipodocumento");
        if (cuentaTipoDocumentotipodocumento != null && !cuentaTipoDocumentotipodocumento.isEmpty()) {
            key.setCuentaTipoDocumentotipodocumento(cuentaTipoDocumentotipodocumento.get(0));
        }
        java.util.List<String> cuentanumeroDocumento = map.get("cuentanumeroDocumento");
        if (cuentanumeroDocumento != null && !cuentanumeroDocumento.isEmpty()) {
            key.setCuentanumeroDocumento(cuentanumeroDocumento.get(0));
        }
        return key;
    }

    public PropietarioFacadeREST() {
        super(Propietario.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Propietario entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") PathSegment id, Propietario entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        edu.co.sena.ceeregistro.model.entities.PropietarioPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Propietario find(@PathParam("id") PathSegment id) {
        edu.co.sena.ceeregistro.model.entities.PropietarioPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Propietario> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Propietario> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
