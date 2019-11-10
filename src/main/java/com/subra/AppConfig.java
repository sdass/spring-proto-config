package com.subra;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Configuration
@ComponentScan("com.subra")
public class AppConfig {

    public static void main(String[] args) throws InterruptedException {
    	System.out.println("----------1------");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        MSingleton sbean = context.getBean(MSingleton.class);
        System.out.println("----------2------" + sbean.hashCode());
     sbean.showMessage();
     Thread.sleep(2000);

     sbean = context.getBean(MSingleton.class);
     System.out.println("----------3------"  + sbean.hashCode());
     sbean.showMessage();
     
    }
    
    /* Other way
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //exact must
    public MProtoType getProtoTypeBean(){
    	return new MProtoType();
    }
    */

}
