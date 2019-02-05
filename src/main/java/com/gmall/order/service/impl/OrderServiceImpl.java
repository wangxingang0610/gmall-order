package com.gmall.order.service.impl;

import java.util.List;

import com.gmall.bean.UserAddress;
import com.gmall.order.service.OrderService;
import com.gmall.service.UserService;

public class OrderServiceImpl implements OrderService {

	UserService userService;
	
	public List<UserAddress> initOrder(String userId) {
		
		//1、查询用户的收货地ַ
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		for (UserAddress userAddress : addressList) {
			System.out.println(userAddress.getUserAddress());
		}
		return addressList;
	}

}
