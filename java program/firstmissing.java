package qspiderTest;
import java.util.*;
public class firstmissing {

	public static void main(String[] args) {
		int [] a= {1,2,0};
		System.out.println(firstMissingPositive(a));
		System.out.println("1");
	}
	   public static int firstMissingPositive(int[] nums) {
	        Arrays.sort(nums);
	        for(int i=1;i<nums[nums.length-1];i++){
	            for(int j=0;j<nums.length;j++){
	                if(nums[j]<=0){
	                  i--;
	                  break;
	                }
	                if(nums[j]!=i)
	                    return i;
	            }
	        }
	        return 0;
	    }

}
