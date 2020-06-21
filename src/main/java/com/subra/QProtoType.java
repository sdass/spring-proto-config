package com.subra;

import java.time.Instant;
import java.time.LocalDateTime;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //need to prepare as a @Bean preferred. Or like this factory from @config file package scan
//@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS) does not work
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class QProtoType {

	//private String dateMsg =  LocalDateTime.now().toString() ;
	private Long instantLong =  Instant.now().getEpochSecond() ;
	
	public Long getCurrentTimeLong(){
		return instantLong;
	}	
	
}
