package resource;

import service.AlticciSequenceService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/alticci")
public class AlticciSequenceResource {

    @Inject
    AlticciSequenceService alticciSequenceService;

    @GET
    @Path("{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public Long getSequenceResultByIndex(@PathParam("id") Long id) {
        return alticciSequenceService.getResultByIndex(id);
    }
}
