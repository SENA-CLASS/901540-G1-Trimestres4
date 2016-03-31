package edu.co.sena.ceetregistro.presentacion.managerbeans;

import edu.co.sena.ceetregistro.integracion.entitites.Cargo;
import edu.co.sena.ceetregistro.presentacion.managerbeans.util.JsfUtil;
import edu.co.sena.ceetregistro.presentacion.managerbeans.util.JsfUtil.PersistAction;
import edu.co.sena.ceetregistro.negocio.ejbs.CargoFacade;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Named("cargoController")
@SessionScoped
public class CargoController implements Serializable {

    @EJB
    private edu.co.sena.ceetregistro.negocio.ejbs.CargoFacade ejbFacade;
    private List<Cargo> items = null;
    private Cargo selected;

    private String idCargoBuscar;

    private String nuevoCargo;

    public CargoController() {
    }

    public Cargo getSelected() {
        return selected;
    }

    public void setSelected(Cargo selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private CargoFacade getFacade() {
        return ejbFacade;
    }

    public Cargo prepareCreate() {
        selected = new Cargo();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("CargoCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("CargoUpdated"));
    }

    public void searchIdCargo() {
        if (idCargoBuscar != null) {
            try {
                items = getFacade().findByLikeIdCargo(idCargoBuscar);

                idCargoBuscar = null;
                JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("CargoUpdated"));

            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }

        } else {
            JsfUtil.addErrorMessage(null, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccuredCargoPk"));
        }
    }

    public void cleanSearch() {
        items = null;
    }

    public void updatepk() {
        if (selected != null) {
            try {
                getFacade().updatepk(selected.getIdCargo(), nuevoCargo);
                items = null;
                nuevoCargo = null;
                JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("CargoUpdated"));

            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }

        } else {
            JsfUtil.addErrorMessage(null, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccuredCargoPk"));
        }
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("CargoDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<Cargo> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected);
                } else {
                    getFacade().remove(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public Cargo getCargo(java.lang.String id) {
        return getFacade().find(id);
    }

    public List<Cargo> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Cargo> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    public String getNuevoCargo() {
        return nuevoCargo;
    }

    public void setNuevoCargo(String nuevoCargo) {
        this.nuevoCargo = nuevoCargo;
    }

    public String getIdCargoBuscar() {
        return idCargoBuscar;
    }

    public void setIdCargoBuscar(String idCargoBuscar) {
        this.idCargoBuscar = idCargoBuscar;
    }

    @FacesConverter(forClass = Cargo.class)
    public static class CargoControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            CargoController controller = (CargoController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "cargoController");
            return controller.getCargo(getKey(value));
        }

        java.lang.String getKey(String value) {
            java.lang.String key;
            key = value;
            return key;
        }

        String getStringKey(java.lang.String value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Cargo) {
                Cargo o = (Cargo) object;
                return getStringKey(o.getIdCargo());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Cargo.class.getName()});
                return null;
            }
        }

    }

}
