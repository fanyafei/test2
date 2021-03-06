package com.itheima.factory;

import com.itheima.service.ICustomerService;
import com.itheima.service.impl.ICustomerServiceImpl;

/**
 * @Description:模拟一个静态工厂类
 * @Author:fanyafei
 * @Version:1.0
 * @Date:2019/4/3016:18.
 * @see:
 **/
public class StaticFactory {
	public static ICustomerService getCustomerService(){
		return new ICustomerServiceImpl();
	}
}
