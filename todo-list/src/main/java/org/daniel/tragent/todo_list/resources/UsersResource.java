package org.daniel.tragent.todo_list.resources;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import java.net.URI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.daniel.tragent.todo_list.models.Users;
import org.daniel.tragent.todo_list.services.UserService;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsersResource {
	
	UserService userService = new UserService();
	
	@GET
	public List<Users> getUsers(){
		List<Users> users = userService.getAllUsers();
		return users;
	}
	
	@GET
	@Path("/{userId}")
	public Users getUser(@PathParam("userId") long id){
		return userService.getUser(id);
	}
	
	@POST
	public Response addUsers(@Context UriInfo uriInfo, Users user){
		Users newUser = userService.addUser(user);
		String userId = String.valueOf(newUser.getId());
		URI uri = uriInfo.getAbsolutePathBuilder().path(userId).build();
		return Response.created(uri)
					   .entity(newUser)
					   .build();
	}
	
	@PUT
	@Path("/{userId}")
	public Users updateUser(@PathParam("userId") long id, Users user){
		user.setId(id);
		return userService.updateUser(user);
	}
	
	@DELETE
	@Path("/{userId}")
	public void removeUser(@PathParam("userId")long id){
		userService.removeUser(id);
	}
}
