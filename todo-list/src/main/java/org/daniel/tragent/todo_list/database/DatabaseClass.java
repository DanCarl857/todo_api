package org.daniel.tragent.todo_list.database;

import java.util.Map;

import org.daniel.tragent.todo_list.models.Todos;
import org.daniel.tragent.todo_list.models.Users;

import java.util.HashMap;

public class DatabaseClass {
	
	private static Map<Long, Users> users = new HashMap<>();
	private static Map<Long, Todos> todos = new HashMap<>();
	
	public static Map<Long, Users> getUsers(){
		return users;
	}
	
	public static Map<Long, Todos> getTodos() {
		return todos;
	}
}
