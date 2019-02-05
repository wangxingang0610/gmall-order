package com.gmall.order.controller;

import org.springframework.stereotype.Controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gmall.service.UserService;

@Controller
public class OrderController {

	@Reference
	UserService userService;
	
	
//	public List<UserAddress> getAddress(@Parameter("userId") String userId){
//		
//		return userService.getUserAddressList(userId);
//	}
}
