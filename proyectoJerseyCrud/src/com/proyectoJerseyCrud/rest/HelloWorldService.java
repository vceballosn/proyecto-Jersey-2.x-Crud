package com.proyectoJerseyCrud.rest;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType; 
import javax.ws.rs.Produces;







@Path("/services")
public class HelloWorldService {
 
	@GET
	@Path("/hello/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}
 
	
	
	@GET
    @Produces(MediaType.TEXT_HTML)     
    @Path("/add")
	// http://localhost:8080/proyectoJerseyCrud/rest/services/add?firstname=vladimir&email=vladimir.ceballos@gmail.com&lastname=ceballos
   public Response addUser(
       @QueryParam("firstname") String firstname,
       @QueryParam("email") String email,
       @QueryParam("lastname") String lastname) {

       return Response.status(200)
           .entity(" You have Registered Successfully!!!<br><br>First Name: "+firstname+"<br> Last Name: " + lastname+"<br> Email: "+email)
           .build();
    }
}