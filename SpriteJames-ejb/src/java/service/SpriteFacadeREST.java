package service;

import cst8218.pike0040.entity.Sprite;
import java.util.List;
import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
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
import javax.ws.rs.core.Response;


/**
 * This is a RESTful HTTP interface capable of CRUD operations on Sprite.
 * @author James Pike
 */
@DeclareRoles({"Admin","RestGroup","JsfGroup"})
@RolesAllowed({"Admin","RestGroup"})
@javax.ejb.Stateless
@Path("cst8218.pike0040.entity.sprite")
public class SpriteFacadeREST extends AbstractFacade<Sprite> {

    @PersistenceContext(unitName = "JamesPike-ejbPU")
    private EntityManager em;

    public SpriteFacadeREST() {
        super(Sprite.class);
    }

    /**
     * POST with an id to modify the existing sprite.
     * @param id the id from the url 
  
     */
    @POST
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response modify(@PathParam("id") Long id, Sprite entity) throws Exception {
        //check to see if the url field id or the id in the body request have been specified
        if( id == null || entity.getId() == null) {
            return Response.status(Response.Status.BAD_REQUEST).entity("id was not specified").build();
        }
        //check to see if the id in the url field and id in the body are mismatched
        else if(id.longValue() != entity.getId().longValue()) {
            return Response.status(Response.Status.BAD_REQUEST).entity("id mismatch").build();
        }
        else {
            //if the sprite with given id exists, update the existing sprite
            Sprite old = super.find(entity.getId());
            if(old == null || super.find(id) == null) {
                return Response.status(Response.Status.NOT_FOUND).entity("not found in database").build();
            }
            else {
                entity.updates(old); //update non-null values         
                super.edit(old);
            }
        }
        return Response.status(Response.Status.OK).entity(super.find(entity.getId())).build();
    }//end modify
    

    /**
     * POST on the root resource (sprite table) to create a new sprite or update the existing sprite.
    
     */
    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response modifyRoot(Sprite entity) throws Exception {
        if(entity.getId() == null) {
            //entity.checkNull(); //uncomment this to change null values to default values.
            super.create(entity);
            return Response.status(Response.Status.CREATED).entity(super.find(entity.getId())).build();
        }
        else {
            Sprite old = super.find(entity.getId());
            if(old == null) {
                return Response.status(Response.Status.NOT_FOUND).entity("not found in database").build();
            }
            else {
                entity.updates(old);
                super.edit(old);
            }
        }
        return Response.status(Response.Status.OK).entity(super.find(entity.getId())).build();
    }//end modifyRoot
      
    
    /**
     * PUT on root resource is not supported

     */
    @PUT
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response editRoot(Sprite entity) throws Exception {
        return Response.status(Response.Status.NOT_IMPLEMENTED).entity("PUT on root resource is not supported").build();
    }//end editRoot
    

    /**
     * PUT with an id to replace the sprite.
     * @param id the id from the url
 
     */
    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response edit(@PathParam("id") Long id, Sprite entity) throws Exception {
        if(id == null || entity.getId() == null) {
            return Response.status(Response.Status.BAD_REQUEST).entity("id was not specified").build();
        }
        else if(id.longValue() != entity.getId().longValue()) {
            return Response.status(Response.Status.BAD_REQUEST).entity("id mismatch").build();
        } 
        else {
            Sprite old = super.find(entity.getId());
            if(old == null || super.find(id) == null) {
               return Response.status(Response.Status.NOT_FOUND).entity("not found in database").build();
            }
            else {
               
                super.edit(entity); //if the new value is null it still store into the data
            }
        }   
       return Response.status(Response.Status.OK).entity(super.find(entity.getId())).build(); 
    }//end edit

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Long id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Sprite find(@PathParam("id") Long id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Sprite> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Sprite> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    /**
     * Determine how many sprites are in the database.
     * @return a number of sprite data 
     */
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
