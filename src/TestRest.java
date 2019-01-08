import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

// The Java class will be hosted at the URI path "/testrest"
@Path("/testrest")
public class TestRest {
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/html")
    public String getClichedMessage() {
        // Return some cliched textual content
        return "<h1>Test Rest</h1> Configuration and first start";
    }
}