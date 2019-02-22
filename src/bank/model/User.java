package com.bank.model;

import java.io.Serializable;

public class User implements Serializable {
	private String firstname;
	private String lastname;
	private long aadharcardno;
	private long accountno;
	private String pancardno;
	private long phoneno;
	private String address;


	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public long getAadharcardno() {
		return aadharcardno;
	}

	public void setAadharcardno(long aadharcardno) {
		this.aadharcardno = aadharcardno;
	}

	public long getAccountno() {
		return accountno;
	}

	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}

	public String getPancardno() {
		return pancardno;
	}

	public void setPancardno(String pancardno) {
		this.pancardno = pancardno;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
