package com.edu.displaytag.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import com.edu.displaytag.model.User;

public class UserData {
	public static List<User> getUserList() {
		List<User> users = new ArrayList<>();
		// dummy data using java 8
		IntStream.rangeClosed(1, 100).forEach(i -> users
				.add(new User(i, "User " + i, "user" + i + "@gmail.com", i, "firstName_" + i, "lastName_" + i))

		);
		// for (int i = 0; i < 100; i++) {
		// int value = i + 1;
		// User user = new User(value, "User " + value, "user" + value +
		// "@gmail.com", value, "firstName_" + value,
		// "lastName_" + value);
		// users.add(user);
		// }
		return users;
	}
}
