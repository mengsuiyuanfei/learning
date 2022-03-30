import java.util.HashMap;
import java.util.Map;

/**
 * abs:绝对值
 * ceil:向上取整
 * floor:向下取整
 * round:四舍五入
 */

public class Demo03_Math {
    public static void main(String[] args) {
        String [] numStr ={"3","5","6","8","11"};
        int target=16;
        int [] result=sumTwo(numStr,target);
        for(int a:result){
            System.out.println(a);
        }
    }




    public static int[] sumTwo(String[] nums,int target){
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i < nums.length;i++){
            int result=target-Integer.valueOf(nums[i]);
            if(map.containsKey(String.valueOf(result))){
                return new int[]{map.get(String.valueOf(result)),i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("不存在！");
    }

















    public static int[] twoSum(String[] nums,int target){
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i< nums.length;i++){
            int result=target-Integer.valueOf(nums[i]);
            if(map.containsKey(String.valueOf(result))){
                return new int[]{map.get(String.valueOf(result)),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("无结果！");
    }
}
