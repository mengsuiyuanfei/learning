package com.ithiema.service.impl;

import com.ithiema.service.IAccountService;

import java.util.Date;

public class AccountServiceImpl1 implements IAccountService {
    private String name;
    private Integer age;
    private Date birthday;

    //使用构造函数进行注入
    public AccountServiceImpl1(String name,Integer age,Date birthday){
        this.name=name;
        this.age=age;
        this.birthday=birthday;
    }

    public void saveAccount() {
        System.out.println("执行了Service中的saveAccount方法！"+name+","+age+","+birthday);
    }
}
