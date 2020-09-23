package com.ithiema.ui;

import com.ithiema.service.impl.AccountServiceImpl;
import com.ithiema.service.impl.AccountServiceImpl1;
import com.ithiema.service.impl.AccountServiceImpl2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {
    public static void main(String[] args) {
//        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
//        AccountServiceImpl as=(AccountServiceImpl) ac.getBean("accountService");
//        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
//        AccountServiceImpl2 as=(AccountServiceImpl2) ac.getBean("accountService2");
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        AccountServiceImpl1 as=(AccountServiceImpl1) ac.getBean("accountService1");
        as.saveAccount();
    }
}
