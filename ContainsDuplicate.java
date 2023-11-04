package leetcode;
import java.util.*;
public class ContainsDuplicate {
	public static void main(String[] args) {
		int[] nums= {1,1,1,3,3,4,3,2,4,2};
		ContainsDuplicate instance = new ContainsDuplicate();
		System.out.println(instance.containsDuplicate(nums)); 
		
	}
	public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i: nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
                if(map.get(i)>1){
                return true;
                }
            }else{
                map.put(i,1);
            }
        }
        return false;
				
     // Arrays.sort(nums);
		//         for(int i=0;i<nums.length-1;i++){
		//             int j=i+1;
		           
		//             if(nums[i]==nums[j]){
		//             return true;
		//             }
		//         }
		//         return false;
    }
	
}

