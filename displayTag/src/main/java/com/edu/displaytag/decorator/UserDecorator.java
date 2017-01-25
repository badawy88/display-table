package com.edu.displaytag.decorator;

import org.displaytag.decorator.TableDecorator;

import com.edu.displaytag.model.User;

/**
 * 
 * @author Abouads, Badawy
 *
 */
public class UserDecorator extends TableDecorator {
	/**
	 * 
	 * @return user id in the current row
	 */
	public long getUserId() {
		User user = (User) getCurrentRowObject();
		return user.getId();
	}

	/**
	 * 
	 * @return Username in the current row
	 */
	public String getUsername() {
		User user = (User) getCurrentRowObject();
		return user.getUserName();
	}

	/**
	 * 
	 * @return email in the current row
	 */
	public String getEmail() {
		User user = (User) getCurrentRowObject();
		return user.getEmail();
	}

	/**
	 * 
	 * @return user age in the current row
	 */
	public int getAge() {
		User user = (User) getCurrentRowObject();
		return user.getAge();
	}

	/**
	 * 
	 * @return first Name in the current row
	 */
	public String getFirstName() {
		User user = (User) getCurrentRowObject();
		return user.getFirstName();
	}

	/**
	 * 
	 * @return first Name in the current row
	 */
	public String getLastName() {
		User user = (User) getCurrentRowObject();
		return user.getLastName();
	}
}
