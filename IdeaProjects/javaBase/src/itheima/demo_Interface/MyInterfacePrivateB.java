package itheima.demo_Interface;

public interface MyInterfacePrivateB {
    public static void methodStatic1(){
        System.out.println("默认方法1");
        methodStaticCommon();
    }
    public static void methodStatic2(){
        System.out.println("默认方法2");
        methodStaticCommon();
    }
    private static void methodStaticCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
