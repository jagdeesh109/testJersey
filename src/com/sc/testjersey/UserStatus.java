package com.sc.testjersey;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("status")
public class UserStatus {
	public static final String CLICHED_MESSAGE = "Hello World!";
	public static final String CLICHED_USERNAME = "Jersey Test";
	public static final String CLICHED_USERSlIST = "raj Jersey Test";
	
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
	
	@GET @Path("userlist")
	@Produces("application/json")
	public String usersList() {
		
		List userlist = new ArrayList();
		userlist.add(0, "raj");
		userlist.add(1, "swaraj");
		userlist.add(2, "geeta");

		return userlist.toString();

	}
	
	

}
