package com.itheima.service.impl;

import com.itheima.service.IAccountService;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {
    public AccountServiceImpl(){
        System.out.println("对象创建了");
    }
    public void saveAccount(){
        System.out.println("Service中的saveAccount方法执行了。。。");

    }
    public void init(){
        System.out.println("对象初始化了");

    }
    public void destory(){
        System.out.println("对象销毁了");

    }
}

/**
 * private IAccountDao accountDao=new AccountDaoImpl();//有独立的自主控制权，想要谁要谁
 * IAccountDao accountDao= (IAccountDao)BeanFactory.getBean("accountDao");//工厂能得到哪个bean对应，是根据配置所对应全限定类名来实现的
 *
 * 从这两行代码中体会控制反转（IoC）
 *
 * IoC：（Inverse of Control）控制反转：把创建对象的权利交给框架是框架的重要特征，并非面向对象编程的专用术语。它包括依赖注入（Dependency Injection，简称DI）和依赖查找（Dependency Lookup）
 *作用就是降低计算机程序的耦合（解除我们代码中的依赖关系）
 */
