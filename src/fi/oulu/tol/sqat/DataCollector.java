package fi.oulu.tol.sqat;

import java.util.ArrayList;


public class DataCollector {
	private CountryList countries;
	
	public void creationForm() {
		//form that asks user info. not implemented
		
	}
	
	public int validateName(String name ){
		//return 0 if name is valid
		boolean valid = name.matches("[A-Za-z]+");
		if (valid == true) {
		return 0;
		}
		else {
			return 1;
		}
	}
	
	public int validateUname(String uname ){
		//return 0 if name is valid
		int _count=0;
		boolean valid = uname.matches("[A-Za-z_]+");
		for(int i = 0, n = uname.length() ; i < n ; i++) { 
		    if(uname.charAt(i)=='_') {
		    	_count=_count+1;
		    			    } 
		}				
		if (valid == true && uname.length()<= 15 && _count <2) {
		return 0;
		}
		else {
			return 1;
		}
	}
	
	public int validatePassword(String pwd) {
		//return 0 if valid
		if (pwd.length()>=8) {
		return 0;
		}
		else {
			return 1;
		}
	}
	public int validateCountry(String c) {
		//return 0 if valid
		
		for (String s : countries.getCountries()) {
            if(s.matches(c)){
                return 0;
            }
        }
		return 1;
	}
	
	public int validateBday(String bday) {
		//age check not done
		boolean valid = bday.matches("\\d{2}/\\d{2}/\\d{4}");
		if (valid) {
		return 0;
		}
		else {
			return 1;
		}
	}
	public int validatePhone(String p) {
		//assumes number that is 9 to 15 digits
		boolean valid = p.matches("\\d{9,15}");
		if (valid) {
		return 0;
		}
		else {
			return 1;
		}
	}	
	
	
	
	
}
