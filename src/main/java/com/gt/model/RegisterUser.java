package com.gt.model;

public class RegisterUser {
    String id;
    String email;
    String displayName;
    String password;
    String confirmPassword;
    String captchaKey;
    String captchaValue;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
    
}
