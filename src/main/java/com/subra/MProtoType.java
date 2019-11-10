package com.subra;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;;

@Component //need to prepare as a @Bean preferred. Or like this factory from @config file package scan
//@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS) does not work
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MProtoType {

	private String dateMsg =  LocalDateTime.now().toString() ;
	
	public String getCurrentTime(){
		return dateMsg;
	}
	
	
}
