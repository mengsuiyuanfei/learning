package itheima.demo_Interface;

/**
 * 接口就是多个类的公共规范。
 * 借口是一种引用数据类型，最重要的内容就是其中的：抽象方法
 * 如何定义一个接口的格式：
 * public interface 接口名称{
 *     //接口的内容
 * }
 *
 *  备注：换成关键字interface之后，编译生成的字节编码仍然是:.java --> .class。
 *
 *  如果是java7   name结构中可以包含的内容有：
 *  1.常量
 *  2.抽象方法
 *
 *  如果是java8  还可以额外有
 *  3.默认方法
 *  4，静态方法
 *
 *  如果是java9  还可以额外有：
 *  5.私有方法
 *
 * 接口使用步骤：
 * 1.接口不能直接使用，必须有一个“实现类”来实现接口。
 * 格式：
 * public class 实现类名称  implements 接口名称{
 *     //...
 * }
 *
 * 2.接口的实现类必须覆盖重写（实现）接口中所有的抽象方法。
 * 实现：去掉abstract关键字，加上方法大括号。
 *
 *3.创建实现类的对象，进行使用。
 *
 * 注意事项：
 * 如果实现类没有覆盖重写抽象类中的所有的抽象方法，那么这个实现类自己就必须是一个抽象类
 */

public class Demo01Interface {
    public static void main(String[] args) {
        MyInterfaceAbstractImpl impl=new MyInterfaceAbstractImpl();
        impl.methodAbs();
        impl.methodAbs1();
    }

}
