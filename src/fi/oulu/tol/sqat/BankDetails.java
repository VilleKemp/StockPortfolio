package fi.oulu.tol.sqat;

public class BankDetails {
	private String address;
	private String city;
	private String pcode;
	private String country;
	private String password;
	
	private String cholder;
	private String ctype;
	private String cnumber;
	private String edate;

	public BankDetails(String address, String city, String pcode, String country,String password, String cholder, String ctype, String cnumber, String edate) {
		this.address = address;
		this.city = city;
		this.pcode = pcode;
		this.country = country;
		this.password = password;
		
		this.cholder = cholder;
		this.ctype = ctype;
		this.cnumber = cnumber;
		this.edate = edate;

	}
	//getters
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getPcode() {
		return pcode;
	}

	public String getCountry() {
		return country;
	}
	public String getPassword() {
		return password;
	}
	public String getCholder() {
		return cholder;
	}
	public String getCtype() {
		return ctype;
	}
	public String getCnumber() {
		return cnumber;
	}
	public String getEdate() {
		return edate;
	}
	//setters
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCity(String lname) {
		this.city = lname;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	public void setPassword(String psw) {
		this.password = psw;
	}
	public void setCholder(String psw) {
		this.cholder = psw;
	}
	public void setCtype(String psw) {
		this.ctype = psw;
	}
	public void setCnumber(String psw) {
		this.cnumber = psw;
	}
	public void setEdate(String psw) {
		this.edate = psw;
	}
}