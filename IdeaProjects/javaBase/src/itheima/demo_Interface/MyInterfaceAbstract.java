package itheima.demo_Interface;

/**
 * 在任何版本的java中，接口都能定义抽象方法。
 * 格式：
 * public abstract 返回值类型  方法名称(参数列表)
 *
 * 注意事项：
 * 1.接口当中的抽象方法，修饰符必须是两个苦丁的关键字：public abstract
 * 2.这两个关键字修饰符可以选择性省略()
 */
public interface MyInterfaceAbstract {

    //一下全是接口中的方法定义
    public abstract void methodAbs();

    public  void methodAbs1();

    abstract void methodAbs2();

    void methodAbs3();
}
