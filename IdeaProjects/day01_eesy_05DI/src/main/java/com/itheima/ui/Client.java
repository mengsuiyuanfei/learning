package com.itheima.ui;


import com.itheima.service.IAccountService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        //1.获取核心容器对象
//        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
//        IAccountService as=(IAccountService)ac.getBean("accountService");
//        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
//        IAccountService as=(IAccountService)ac.getBean("accountService2");
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as=(IAccountService)ac.getBean("accountService3");

        as.saveAccount();

    }
}
