package com.prowings.inheritance_jointable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SBI_BANK")
public class SBI_Bank extends Bank{
	
	
	@Column(name="BRANCHNAME")
	String Branchname;
	
	@Column(name="IFSCCODE")
	String IFSCcode;
	
	public String getBranchname() {
		return Branchname;
	}
	public void setBranchname(String branchname) {
		Branchname = branchname;
	}
	public String getIFSCcode() {
		return IFSCcode;
	}
	public void setIFSCcode(String iFSCcode) {
		IFSCcode = iFSCcode;
	}
	@Override
	public String toString() {
		return "HDFC_Bank [Branchname=" + Branchname + ", IFSCcode=" + IFSCcode + ", Bankid=" + Bankid + ", banktype="
				+ banktype + "]";
	}
	
	
	

}
