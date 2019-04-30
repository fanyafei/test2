package com.itheima.service.impl;

import com.itheima.service.ICustomerService;

/**
 * @Description:客户的业务层实现类
 * @Author:fanyafei
 * @Version:1.0
 * @Date:2019/4/2914:23.
 * @see:
 **/
public class ICustomerServiceImpl implements ICustomerService {
	//private ICustomerDao customerDao=new ICustomerDaoImpl();
	//private ICustomerDao customerDao= BeanFactory.getCustomerDao();

	public ICustomerServiceImpl(){
		System.out.println("创建ICustomerServiceImpl Bean");
	}
	@Override
	public void saveCunstomer() {
		System.out.println("业务层调用持久层");

	}
}
