package com.prowings.inheritance_jointable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="BANK")
@Inheritance(strategy = InheritanceType.JOINED)
public class Bank {
	
	@Id
	@Column(name="BANKID")
	int Bankid;
	
	@Column(name="BANKTYPE")
	String banktype;
	
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(int bankid, String banktype) {
		Bankid = bankid;
		this.banktype = banktype;
	}
	public int getBankid() {
		return Bankid;
	}
	public void setBankid(int bankid) {
		Bankid = bankid;
	}
	public String getBanktype() {
		return banktype;
	}
	public void setBanktype(String banktype) {
		this.banktype = banktype;
	}
	@Override
	public String toString() {
		return "Bank [Bankid=" + Bankid + ", banktype=" + banktype + "]";
	}
	
	

}
