package com.subra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;



@Component
public class MSingleton {
	
	/* no
	@Autowired 
	private MProtoType mp;
*/	
	// private MProtoType mp; NO
	
	public String showMessage(){
		//String sd = mp.getCurrentTime(); NO
		//String protoMsg = lookUpPrototypeBean().getCurrentTime();
		//do 2 step to debug
		MProtoType mp = lookUpPrototypeBean(); String protoMsg = mp.getCurrentTime();
		System.out.println( "MProtoType obj-hex " + mp.hashCode() + " protoMsg =" + protoMsg);
		return protoMsg;
	}

	
	
	@Lookup
	public MProtoType lookUpPrototypeBean(){
		return null;
	}
	
}
