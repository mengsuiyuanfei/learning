package itheima.demo11;

/**
 * 如何使用抽象类：
 *  1.不能直接使用抽象类对象
 *  2.必须用一个子类继承抽象父类
 *  3.子类必须覆盖重写抽象类中所有的抽象方法
 *      覆盖重写（实现）：子类去掉抽象方法的abstract关键字，然后补上方法体大括号
 *
 */
public abstract class Animal {

    public abstract void eat();
}
