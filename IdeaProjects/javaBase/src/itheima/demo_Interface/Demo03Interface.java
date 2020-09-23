package itheima.demo_Interface;

/**
 * 接口中的静态方法需要  和类静态方法一样    使用接口直接点 进行调用
 */
public class Demo03Interface {
    public static void main(String[] args) {
        //创建实现类对象
        MyInterfaceStaticImpl myInterfaceStatic=new MyInterfaceStaticImpl();

        //错误写法
        //myInterfaceStatic.methodStatic();
        MyInterfaceStatic.methodStatic();
    }
}
