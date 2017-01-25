package com.edu.displaytag.data;

import java.util.ArrayList;
import java.util.List;

import com.edu.displaytag.model.User;

public class UserData {
	public static List<User> getUserList() {
		List<User> users = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			int value = i + 1;
			User user = new User(value, "User " + value, "user" + value + "@gmail.com", value, "firstName_" + value,
					"lastName_" + value);
			users.add(user);
		}
		return users;
	}
}
