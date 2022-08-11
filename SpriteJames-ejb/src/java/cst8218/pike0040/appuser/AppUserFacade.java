package cst8218.pike0040.appuser;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * 
 * @author James Pike
 */

//this doesn't seem to work

@DeclareRoles({"Admin","RestGroup","JsfGroup"})
@RolesAllowed({"Admin"})
@javax.ejb.Stateless
@javax.ws.rs.Path("cst8218.pike0040.appuser.appuser")

public class AppUserFacade extends AbstractFacade<AppUser> {
    @PersistenceContext(unitName = "JamesPike-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AppUserFacade() {
        super(AppUser.class);
    }
}
