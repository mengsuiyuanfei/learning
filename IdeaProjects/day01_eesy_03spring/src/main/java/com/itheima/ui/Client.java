package com.itheima.ui;

import com.itheima.dao.IAccountDao;
import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


/**
 * 获取spring的Ioc核心容器，并根据id获取对象
 *
 * ApplicationContext的三个实现类：
 *      ClassPathXmlApplicationContext:它可以加载类路径文件下的配置文件，要求配置文件必须在类路径下。不在的话加载不了。
 *      FileSystemXmlApplicationContext：它可以加载磁盘任意路径下配置文件(必须有访问权限)
 *      AnnotationConfigApplicationContext：它是用于读取注解创建容器的，是明天的内容。
 *
 * 核心容器的两个接口引发出的问题：
 * ApplicationContext:单例对象适用
 *      它在构建核心容器时，创建对象所采取的策略是采用立即加载的方式。也就是说，只要一读取完配置文件马上就创建配置文件中配置的对象。
 * BeanFactory：      多例对象适用
 *      它在构建核心容器时，创建对象采取的策略是采用延迟加载方式。也就是说，什么时候根据id获取对象了，什么时候才真正创建对象
 */
public class Client {
    public static void main(String[] args) {
        //1.获取核心容器对象
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        //ApplicationContext ac=new FileSystemXmlApplicationContext("绝对路径");
        //2.根据id获取bean对象,同事下面显示两种方法获取到对应的值
        IAccountService as=(IAccountService)ac.getBean("accountService");
        IAccountDao adao=ac.getBean("accountDao",IAccountDao.class);
        System.out.println(as);
        System.out.println(adao);
        //as.saveAccount();


    }
}

/**
 * 基本流程：
 *      在业务层调用持久层对象实现数据处理
 *      这次期间生成的类对象通过spring的控制反转来实现，有多重
 *
 */

