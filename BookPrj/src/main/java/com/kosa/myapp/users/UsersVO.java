package com.kosa.myapp.users;

import java.sql.Timestamp;

public class UsersVO {
	private int userId;
	private String userName;
	private String userNumber;
	private String userEmail;
	private Timestamp userDate;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Timestamp getUserDate() {
		return userDate;
	}
	public void setUserDate(Timestamp userDate) {
		this.userDate = userDate;
	}
	@Override
	public String toString() {
		return "UsersVO [userId=" + userId + ", userName=" + userName + ", userNumber=" + userNumber + ", userEmail="
				+ userEmail + ", userDate=" + userDate + "]";
	}

	
	
	
}
