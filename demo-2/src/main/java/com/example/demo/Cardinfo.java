package com.example.demo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "cardinfo" database table.
 * 
 */
@Entity
@Table(name="\"cardinfo\"")
@NamedQuery(name="Cardinfo.findAll", query="SELECT c FROM Cardinfo c")
public class Cardinfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"cardid\"")
	private String cardid;

	@Column(name="\"customerid\"")
	private String customerid;

	@Column(name="\"employeeid\"")
	private int employeeid;

	public Cardinfo() {
	}

	public String getCardid() {
		return this.cardid;
	}

	public void setCardid(String cardid) {
		this.cardid = cardid;
	}

	public String getCustomerid() {
		return this.customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public int getEmployeeid() {
		return this.employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

}