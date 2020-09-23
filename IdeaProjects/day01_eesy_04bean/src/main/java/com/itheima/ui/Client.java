package com.itheima.ui;


import com.itheima.service.IAccountService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        //1.获取核心容器对象
        ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        //ApplicationContext ac=new FileSystemXmlApplicationContext("绝对路径");
        //2.根据id获取bean对象,同事下面显示两种方法获取到对应的值
        IAccountService as=(IAccountService)ac.getBean("accountService");

        as.saveAccount();

        //手动关闭容器
        ac.close();

    }
}
