package fi.oulu.tol.sqat;

public class Person {
	private String fname;
	private String lname;
	private String uname;
	private String password;
	private String country;
	private String bday;
	private String phone;
	private String email;
	public Person(String fname, String lname, String uname, String password, String country, String bday, String phone, String email) {
		this.fname = fname;
		this.lname = lname;
		this.uname = uname;
		this.password = password;
		this.country = country;
		this.bday = bday;
		this.phone = phone;
		this.email = email;
	}
	//getters
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public String getUname() {
		return uname;
	}
	public String getPassword() {
		return password;
	}
	public String getCountry() {
		return country;
	}
	public String getBday() {
		return bday;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	//setters
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public void setPassword(String psw) {
		this.password = psw;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setBday(String bday) {
		this.bday = bday;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}