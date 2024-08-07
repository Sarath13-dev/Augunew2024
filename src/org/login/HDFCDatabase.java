package org.login;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
//POJO Class
public class HDFCDatabase {
	
	Map<String, Integer> m;
	
	//Data Members 
	private String cusId;
	
	private int password;
	
	private int balance;

	//setter method
	public void setCusId(String cusId) {
		if(cusId.equals("123Ravi")) {
			this.cusId="Ravi CusId";
		}
		else if(cusId.equals("123Babu")) {
			this.cusId="Babu CusId";
		}
		else if(cusId.equals("123Anand")) {
			this.cusId="Anand CusId";
		}
		else {
			this.cusId="InValid Account";
		}
	}
	
	public void setPassword(int password) {
		if(password == 123 && cusId.equals("Ravi CusId")) {
			this.password=1;
		}
		else if(password == 111 && cusId.equals("Babu CusId")) {
			this.password=2;
		}
		else if(password == 222 && cusId.equals("Anand CusId")) {
			this.password=3;
		}
		else {
			this.password=0;
		}
	}
	
	public void setBalance() {
		if(password == 1) {
			Integer integer = m.get("Ravi Account");
			this.balance = integer;
		}
		else if(password == 2) {
			Integer integer = m.get("Babu Account");
			this.balance=integer;
		}
		else if(password == 3 ) {
			Integer integer = m.get("Anand Account");
			this.balance=integer;
		}
		else {
			this.balance=0;
		}
		
	}
	
	//Getter method
	public String getCusId() {
		return null;
	}

	public int getPassword() {
		return 0;
	}
	
	public int getBalance() {
		return balance;
	}
	
	 
	public  void readDataFromTextFile() throws IOException {
		m = new LinkedHashMap();
		File f = new File("C:\\Users\\LENOVO\\newEclipseWorkspe\\HDFCBanking\\Databasw\\HDFCDatabasefile.txt");
		List<String> allData = FileUtils.readLines(f);
		//allData - [123Ravi,123,10000, 123Babu,111,20000, 123Anand,222,30000]
		String string = allData.get(0);//string - 123Ravi,123,10000
		String[] s1 = string.split(",");//s1 = {"123Ravi", "123", "10000"};
		String value = s1[2];
		//Convert String into Integer
		int parseInt = Integer.parseInt(value);
		m.put("Ravi Account", parseInt);
		
		String string2 = allData.get(1);
		String[] s2 = string2.split(",");
		int parseInt2 = Integer.parseInt(s2[2]);
		m.put("Babu Account", parseInt2);
		
		
		String string3 = allData.get(2);
		String[] s3 = string3.split(",");
		m.put("Anand Account",Integer.parseInt(s3[2]));
		
	}
	
	
	
	
}
