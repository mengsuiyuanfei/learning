package itheima.demo_Interface;
/*
* 接口当中也可以定义"成员变量"，但必须使用public  static final三个关键字进行修饰
* 从效果上看  其实就是接口的【常量】
* 格式：
* public static final 数据类型 变量名层 = 数据值。
* 备注：
* 一旦使用final关键字进行修饰，说明不可改变。
*
* 注意事项：
* 1.接口当中的常量，可以省略public static final ，注意，不写照样也是这样子
* 2.接口当中的常量，必须进行赋值，不能不赋值。
* 3.接口中常量的名称，使用完全大写的字母，下划线进行分割。（命名规则）
* */
public interface MyInterfaceConst {
}
