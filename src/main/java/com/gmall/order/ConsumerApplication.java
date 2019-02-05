package com.gmall.order;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gmall.bean.UserAddress;
import com.gmall.service.UserService;

public class ConsumerApplication {
	public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        UserService userService = (UserService)context.getBean("userService"); 
        List<UserAddress> list = userService.getUserAddressList("1"); 
        System.out.println( list ); 
        
        System.in.read();
    }
}
