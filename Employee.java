package com.vinaykolusu.projects.jaxbsample;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@SuppressWarnings("restriction")
@XmlRootElement
public class Employee {
	
	private String eName;
	private String eId;
	private String eSalary;
	private String eDesignation;
	private List<EmployeeAddress> eAddress;
	private EmployeeContact eContactNumber;
	
	
	public String geteName() {
		return eName;
	}
	
	@XmlElement
	public void seteName(String eName) {
		this.eName = eName;
	}
	
	public String geteId() {
		return eId;
	}
	
	@XmlElement
	public void seteId(String eId) {
		this.eId = eId;
	}
	public Employee(String eName, String eId, String eSalary,
			String eDesignation, List<EmployeeAddress> eAddress,
			EmployeeContact eContactNumber) {
		super();
		this.eName = eName;
		this.eId = eId;
		this.eSalary = eSalary;
		this.eDesignation = eDesignation;
		this.eAddress = eAddress;
		this.eContactNumber = eContactNumber;
	}
	
	
	public String geteSalary() {
		return eSalary;
	}
	
	@XmlElement
	public void seteSalary(String eSalary) {
		this.eSalary = eSalary;
	}
	
	
	public String geteDesignation() {
		return eDesignation;
	}
	
	@XmlElement
	public void seteDesignation(String eDesignation) {
		this.eDesignation = eDesignation;
	}
	
	public List<EmployeeAddress> geteAddress() {
		return eAddress;
	}
	
	@XmlElement
	public void seteAddress(List<EmployeeAddress> eAddress) {
		this.eAddress = eAddress;
	}
	
	public EmployeeContact geteContactNumber() {
		return eContactNumber;
	}
	
	
	@XmlElement
	public void seteContactNumber(EmployeeContact eContactNumber) {
		this.eContactNumber = eContactNumber;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
}
