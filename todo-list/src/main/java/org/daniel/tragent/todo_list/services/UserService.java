package org.daniel.tragent.todo_list.services;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.daniel.tragent.todo_list.database.DatabaseClass;
import org.daniel.tragent.todo_list.models.Users;

public class UserService {
	
	private Map<Long, Users> users = DatabaseClass.getUsers();
	
	public UserService(){
		users.put(1L, new Users(1, "Daniel", "Carlson", "admin"));
	}
	
	public List<Users> getAllUsers() {
		return new ArrayList<Users>(users.values());
	}
	
	public Users getUser(long id){
		return users.get(id);
	}
	
	public Users addUser(Users user){
		user.setId(users.size() + 1);
		users.put(user.getId(), user);
		return user;
	}
	
	public Users updateUser(Users user){
		if(user.getId() <= 0){
			return null;
		}
		users.put(user.getId(), user);
		return user;
	}
	
	public Users removeUser(long id){
		return users.remove(id);
	}
}
