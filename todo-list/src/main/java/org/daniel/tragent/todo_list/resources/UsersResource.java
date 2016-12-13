package org.daniel.tragent.todo_list.resources;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import java.net.URI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.daniel.tragent.todo_list.models.Users;
import org.daniel.tragent.todo_list.services.UserService;

@Path("/users")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)
public class UsersResource {
	
	UserService userService = new UserService();
	
	@GET
	public List<Users> getUsers(@Context UriInfo uriInfo){
		List<Users> users = userService.getAllUsers();
		// URI uri = uriInfo.getAbsolutePathBuilder().build();
		return users;
	}
}
