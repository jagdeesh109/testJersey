package com.sc.testjersey;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("status")
public class UserStatus {
	public static final String CLICHED_MESSAGE = "Hello World!";
	public static final String CLICHED_USERNAME = "Jersey Test";
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String  returnTitle() {
		
		return "test jersey";
	}
	
	@GET @Path("uname")
	@Produces(MediaType.TEXT_HTML)
	public String userName() {
		
		return CLICHED_USERNAME;
	}
	
	

}
