package org.exoplatform.addons;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.exoplatform.container.PortalContainer;
import org.exoplatform.dao.jpa.FavouriteActivityDAOImpl;
import org.exoplatform.entity.FavouriteActivityEntity;
import org.exoplatform.services.rest.resource.ResourceContainer;
import org.exoplatform.social.core.jpa.storage.dao.ActivityDAO;
import org.exoplatform.social.core.jpa.storage.entity.ActivityEntity;

@Path("/user/")
public class MyRESTService implements ResourceContainer {

    @Path("/name/{name}/")
    @GET
    public Response getName(@PathParam("name") String name) throws Exception {
        return Response.ok("Hello " + name + " !").build();
    }

    @Path("/create/favactivity/")
    @GET
    public Response create() throws Exception {
        PortalContainer container = PortalContainer.getInstance();
        ActivityDAO activityDAO = (ActivityDAO) container.getComponentInstancesOfType(ActivityDAO.class);
        ActivityEntity activityEntity = activityDAO.find(1l);
        FavouriteActivityDAOImpl favactentityimpl = new FavouriteActivityDAOImpl();
        FavouriteActivityEntity favActEntity = new FavouriteActivityEntity();
        favActEntity.setActivityEntity(activityEntity);
        favActEntity.setActivityTitle(activityEntity.getTitle());
        favactentityimpl.create(favActEntity);
        return Response.ok("New FAvourite Activity Created ").build();
    }

}
