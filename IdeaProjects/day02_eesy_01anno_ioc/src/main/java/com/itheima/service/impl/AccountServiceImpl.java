package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.dao.impl.AccountDaoImpl;

import com.itheima.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 账户的业务层实现类
 * 曾经xml的配置
 *  <bean id="accountService" class="com.itheima.service.impl.AccountServiceImpl"></bean>
 *          scope=""  init-method=""  destory-method=""
 *          <property name="" value="" /ref=""></property>
 *
 *  用于创建对象的
 *      它们的作用就和在xml配置文件中编写一个bean标签实现的功能是一样的
 *      @Component       ：带此注解的类看为组件，当使用基于注解的配置和类路径扫描的时候，这些类就会被实例化。
 *          作用：用于把当前类对象存入spring容器中
 *          属性
 *              value：用于指定bean的id。当我们不写时，他默认值是当前类，且首字母改小写
 *      Controller：一般用在表现层
 *      Service：一般用于业务层
 *      Repository：一般用于持久层
 *      以上三个注解他们的作用和属性与Conponent是一摸一样的
 *      他们三个是spring框架为我们提供明确的三层使用的注解，是我们的三层对象更加清晰
 *
 *  用于注入数据的
 *      它们的作用就和在xml配置文件中的bean标签中写一个<property></property>标签的作用是一样的
 *      Autowired:
 *          作用：自动按照类型注入。只要容器中有唯一的一个bean对象类型和要注入的变量类型匹配，就可以注入成功
 *          出现位置：
 *              可以是变量上，也可以是方法上
 *              如果ioc容器中没有任何bean的类型和要注入的变量类型匹配，则报错。
 *              如果ioc容器中有多个类型匹配时
 *          细节：
 *              在使用注解注入时，set方法就不是必须的了
 *       Qualifier
 *          作用：在按照类型进行注入的基础之上再按照名称进行注入。它在给类成员注入时不能单独使用。但是在给方法参数注入时可以（稍后讲）
 *          属性：
 *          value：用于指定注入bean的id
 *       Resource:
 *          作用：直接按照bean的id进行注入。
 *          属性：
 *              name:用于指定bean的id.
 *          以上三种注入都只能注入其他bean类型的数据，而基本类型和String类型无法使用上述注解实现。
 *          另外，集合类型的注入只能使用XML来实现。
 *       Value:
 *          作用：用于注入基本类型和String类型的数据。
 *          属性：
 *              value：用于指定数据的值。它可以使用spring中的Spel（也就是spring中的el表达式）
 *                      SpEL的写法：${表达式}
 *  用于改变作用范围的
 *      它们的作用就和在bean标签中使用scope属性实现的功能是一样的
 *      Scope
 *          作用：用于指定bean的作用范围
 *          属性：
 *              value：指定范围的取值。常用取值：singleton prototype   分别对应单例和多例
 *  和生命周期相关
 *      它们的作用就和在bean标签中使用init-method和destory-method的作用是一样的
 */
@Service(value = "accountService")
//@Scope("prototype")
public class AccountServiceImpl implements IAccountService {
//    @Autowired
//    @Qualifier("accountDao1")
    @Resource(name = "accountDao2")
    private IAccountDao accountDao=null;
    public void saveAccount(){
        accountDao.saveAccount();
    }
}

/**
 *
 */
