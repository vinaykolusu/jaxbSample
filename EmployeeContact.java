package com.vinaykolusu.projects.jaxbsample;

public class EmployeeContact {
	
	private EmployeeContactWork eContactNumberWork;
	
	public EmployeeContact(EmployeeContactWork eContactNumberWork,
			EmployeeContactHome eContactNumberHome) {
		super();
		this.eContactNumberWork = eContactNumberWork;
		this.eContactNumberHome = eContactNumberHome;
	}
	public EmployeeContactWork geteContactNumberWork() {
		return eContactNumberWork;
	}
	public void seteContactNumberWork(EmployeeContactWork eContactNumberWork) {
		this.eContactNumberWork = eContactNumberWork;
	}
	public EmployeeContactHome geteContactNumberHome() {
		return eContactNumberHome;
	}
	public void seteContactNumberHome(EmployeeContactHome eContactNumberHome) {
		this.eContactNumberHome = eContactNumberHome;
	}
	private EmployeeContactHome eContactNumberHome;
	
	public EmployeeContact() {
	
		// TODO Auto-generated constructor stub
	}

}
