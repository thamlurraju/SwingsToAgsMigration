package com.websystique.springmvc.model;

public class User {

	private long id;

	private String username;

	//private boolean gender;

	private String password;

	//private String date;

	private long mobile;

	private String email;

	private String area;

	private String state;

	private String country;

	/*public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
*/
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	/*public void setGender(boolean gender) {
		
		this.gender = gender;
	}
*/
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public User() {
		id = 0;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(long id) {
		this.id = id;
	}

	/*public boolean isGender() {

		return gender;
	}*/
	
	public User(long id, String username,  String password,  long mobile, String email,
			String area, String state, String country) {
		this.id = id;
		this.username = username;
		//this.gender = gender;
		this.password = password;
		//this.date = date;
		this.mobile = mobile;
		this.email = email;
		this.area = area;
		this.state = state;
		this.country = country;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof User))
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ",  password=" + password + ", mobile=" + mobile + ", email=" + email + ",area=" + area + ",state=" + state + ",country="
				+ country + "]";
	}

}
