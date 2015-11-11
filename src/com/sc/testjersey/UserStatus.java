package com.sc.testjersey;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("status")
public class UserStatus {
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String  returnTitle() {
		
		return "test jersey";
	}

}
