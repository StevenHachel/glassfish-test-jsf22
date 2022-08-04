package fish.payara.james.reproducer;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@RequestScoped
@Path("/jsf")
public class JSFVersion {

    @GET
    public String getVersion() {
        return FacesContext.class.getPackage().getImplementationVersion();
    }
}
