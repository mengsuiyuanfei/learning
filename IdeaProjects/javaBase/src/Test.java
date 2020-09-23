import java.util.*;

public class Test {
    public static void main(String[] args) {
        System.out.println(+5 + 5);
        byte b1 = 1;
        byte b2 = 2;
        byte b3 = 1 + 2;
        int b4 = b2 + b3;

        int weekday = 7;
        switch (weekday) {
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                break;
            case 3:
                System.out.println("周三");
                break;
            case 4:
                System.out.println("周四");
                break;
            case 5:
                System.out.println("周五");
                break;
            case 6:
                System.out.println("周六");
                break;
            case 7:
                System.out.println("周天");
                break;
            default:
                System.out.println("输入错误");
                break;

        }

        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);


        //数组的三种定义方式：
        int[] arr = {1, 32, 3, 3, 3, 33, 3};

        int[] arr1 = new int[10];
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 5};
        int[] arr4 = arr;

        change(arr);
        System.out.println(arr[0]);


        float f = 1.00f;
        System.out.println(f);
        Reverse(arr);
        for (int i1 = 0; i1 < 7; i1++) {
            System.out.println(arr[i1]);
        }

//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b= sc.nextInt();
//
//
//        System.out.println(a+b);


        //使用匿名对象

        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        System.out.println(list1);

        Random random=new Random();
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i1 = 0; i1 < 6; i1++) {
            int a =random.nextInt(33)+1;
            arrayList.add(a);
        }
        for (int j = 0; j < 6; j++) {
            System.out.println(arrayList.get(j));
        }

        char[] chars = "hello".toCharArray();
        System.out.println(chars);

        String sortstr="fsddbjkjdfgkjdfgdfjgkdfjnmxncm";
        char[] sortchar= sortstr.toCharArray();
        Arrays.sort(sortchar);
        System.out.println(Arrays.toString(sortchar));;


    }

    public static void Reverse(int[] arr) {
        for (int min = 0, max = arr.length - 1; min <= max; min++, max--) {
            int tmp = arr[min];
            arr[min] = arr[max];
            arr[max] = tmp;
        }
    }

    public static void change(int[] arr) {
        arr[0] = 10000;
    }
    public static  void printList(ArrayList<Integer> arrayList){

    }
}
