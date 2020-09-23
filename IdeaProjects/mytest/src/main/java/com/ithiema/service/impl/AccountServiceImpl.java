package com.ithiema.service.impl;

import com.ithiema.service.IAccountService;

import java.util.Date;

public class AccountServiceImpl implements IAccountService {
    private String name;
    private Integer age;
    private Date birthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void saveAccount() {
        System.out.println("执行了Service中的saveAccount方法！"+name+","+age+","+birthday);
    }
}
