package com.gmall.order.service;

import java.util.List;

import com.gmall.bean.UserAddress;

public interface OrderService {
	// 初始化订单
	public List<UserAddress> initOrder(String userId);
}
