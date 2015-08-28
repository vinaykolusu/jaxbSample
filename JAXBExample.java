package com.vinaykolusu.projects.jaxbsample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class JAXBExample {

	final static Logger logger = Logger.getLogger(JAXBExample.class);
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		JAXBExample jaxbObj = new JAXBExample();
		try {
			jaxbObj.getMarshalledXML("vinay kolusu");
			
			jaxbObj.getUnMarshalledXML();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	private void getUnMarshalledXML() throws JAXBException {
		// TODO Auto-generated method stub
		logger.info("Entry :: getUnMarshalledXML");
		File file = new File("restResponse130.xml");
		
		@SuppressWarnings("restriction")
		JAXBContext contextObj = JAXBContext.newInstance(Employee.class);
		
		Unmarshaller jaxbUnmarshaller = contextObj.createUnmarshaller();
		
		
		
		Employee emp = (Employee) jaxbUnmarshaller.unmarshal(file);
		
		logger.info(emp.geteAddress().size());
		logger.info(emp.geteName());
		logger.info(emp.geteId());
		
		
		logger.info("Exit :: getUnMarshalledXML");
		return;
	}

	private void getMarshalledXML(String string) throws JAXBException, FileNotFoundException {
		// TODO Auto-generated method stub
		logger.info("Entry :: getMarshalledXML");
		
		List<EmployeeAddress> eAddress = new ArrayList<EmployeeAddress>();
		
		EmployeeContactWork eContactWork = new EmployeeContactWork("+12125534612");
		EmployeeContactHome eContactHome = new EmployeeContactHome("+15712947373");
		
		EmployeeContact eContact = new EmployeeContact(eContactWork,eContactHome);
		
		EmployeeAddress eHomeAddress = new EmployeeAddress();
		
		eHomeAddress.seteAddressLine1("Corbin Ave");
		eHomeAddress.seteAddressLine2("Apt abc");
		eHomeAddress.seteCity("Jersey City");
		eHomeAddress.seteState("NJ");
		eHomeAddress.seteZipCode("07306");
		
		
		EmployeeAddress eWorkAddress = new EmployeeAddress();
		
		eWorkAddress.seteAddressLine1("Corbin Ave");
		eWorkAddress.seteAddressLine2("Apt abc");
		eWorkAddress.seteCity("Jersey City");
		eWorkAddress.seteState("NJ");
		eWorkAddress.seteZipCode("07306");
		
		eAddress.add(eWorkAddress);
		eAddress.add(eHomeAddress);
		
		Employee employee = new Employee("Vinay Kolusu","007","C.E.O","9999999",eAddress,eContact);
		
		JAXBContext contextObj = JAXBContext.newInstance(Employee.class);
		
		Marshaller marshallerObj = contextObj.createMarshaller();
		
		marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		marshallerObj.marshal(employee,new FileOutputStream("Employee.xml"));
		
		
		
		logger.info("Exit :: getMarshalledXML");
	}

	private void runMe(String strParam) {
		// TODO Auto-generated method stub
	logger.info("Entry :: getMarshalledXML");
	
		
	}
	
	

}
