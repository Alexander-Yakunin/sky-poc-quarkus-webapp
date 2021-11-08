package de.sky.poc.quarkus;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    private CoolService coolService;

    @Inject
    public void setCoolService(CoolService coolService) {
        this.coolService = coolService;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return coolService.getGreetingMessage();
    }
}
