import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/message")
public class MessageRestService {
    @GET
    @Path("/{param}")
    public Response getResponse(@PathParam("param") String msg){
        String res = msg==null || msg.length()==0 ? "Random - Random" : msg+ " - Random";
        return Response.status(200).entity(res).build();
    }
}
