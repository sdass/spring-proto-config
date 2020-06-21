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
	//2 prototype bean autowired on a singleton
	public String showMessage(){
		//NO String sd = mp.getCurrentTime();
		//String protoMsg = lookUpPrototypeBean().getCurrentTime();
		//do 2 step to debug
		MProtoType mp = lookUpNPrototypeBean(); String protoMsg = mp.getCurrentTime();
		System.out.println( "MProtoType obj-hex " + mp.hashCode() + " protoMsg =" + protoMsg);
		
		QProtoType qp = lookUpQPrototypeBean(); long protoLong = qp.getCurrentTimeLong();
		System.out.println( "QProtoType obj-hex " + qp.hashCode() + " protoLong =" + protoLong);	
		
		return protoMsg + " : " + protoLong;
	}	
	
	@Lookup
	public MProtoType lookUpNPrototypeBean(){
		return null;
	}
	
	@Lookup
	public QProtoType lookUpQPrototypeBean(){
		return null;
	}
	
}
