package com.itheima.ui;


import com.itheima.service.ICustomerService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @Description:
 * @Author:fanyafei
 * @Version:1.0
 * @Date:2019/4/3011:39.
 * @see:
 **/
public class Client {
	//ClassPathXmlApplicationContext:它是只能加载类路径下的配置文件
	//FileSystemXmlApplicationContext:它是可以加载磁盘任意位置的配置文件


	//Bean创建的两种规则
	//	BeanFactory:
	//				提供的是一种延迟加载思想来创建bean对象，bean对象什么时候用什么时候创建
	//	ApplicationContext:
	//				提供的是一种立即夹子思想来创建bean对象，只要一解析完成配置文件，就立马创建bean对象

	//Bean的三种创建方式：
	//	第一种方式：调用默认无参构造函数创建
	//				默认情况下，如果勒种没有默认无参构造函数，会报异常
	//
	//
	//
	@SuppressWarnings("all")

	public static void main(String[] args) {
		//1.获取容器
		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");

		//2.根据bean的id获取对象
		ICustomerService cs= (ICustomerService) ac.getBean("iCustomerService");

		//ICustomerDao cdao= (ICustomerDao) ac.getBean("iCustomerDao");

		cs.saveCunstomer();
	}


//		@SuppressWarnings("all")
//	public static void main(String[] args) {
//			Resource resource=new ClassPathResource("bean.xml");
//		//1.获取容器
//			BeanFactory factory=new XmlBeanFactory(resource);
//
//		//2.根据bean的id获取对象
//		ICustomerService cs= (ICustomerService) factory.getBean("iCustomerService");
//
//		//ICustomerDao cdao= (ICustomerDao) ac.getBean("iCustomerDao");
//
//		cs.saveCunstomer();
//	}
}
