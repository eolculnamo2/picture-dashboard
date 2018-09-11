package com.pictures.validations;

import java.util.ArrayList;
import java.util.List;

public class UserAuthenticationValidations {
	public List<String> checkLogin(String username, String password) {
		//Change ArrayList to JSONObject
		List<String> errors = new ArrayList<String>();
		
		if(username.trim() == "") {
			errors.add("Username required.");
		}
		
		if(password.trim() == "") {
			errors.add("Password required.");
		}
		//errors.get(i) to identify item by index
		
		return errors;
	}
}
