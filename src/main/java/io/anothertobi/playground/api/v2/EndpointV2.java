package io.anothertobi.playground.api.v2;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON + ";charset=UTF-8")
@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
public class EndpointV2 {

  @GET
  @Path("alive")
  public Boolean alive() {
    return true;
  }

  @GET
  @Path("version")
  public String version() {
    return "v2";
  }

}
