package com.thinkerofbraver.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.thinkerofbraver.learning.tools.PrintMark;

public class Test {
	
	
	public static void main(String[] args) {
		
		PrintMark pMark=new PrintMark("*");
		
		//测试String
		String string ="string";
		System.out.println(string.charAt(0));
		System.out.println(string.hashCode());
		
		String[] strings = string.split("");
		System.out.println("split result:"+strings[1]);
		strings[1]="";
		System.out.println("result:"+Arrays.toString(strings));
		
		string="newString";
		System.out.println(string.hashCode());
		System.out.println(string);
		//对比
		Integer i = 1;
		System.out.println(i.hashCode());
		i=2;
		System.out.println(i.hashCode());
		
		//取余
		pMark.print(20, "取余");
		System.out.println(321/100);
		
		//数字转字符串
		pMark.print(20, "数字转字符串");
		String string01=Integer.toString(321);
		System.out.println(string01);
		
		//contains(s)
		pMark.print(20, "contains(s)");
		String string2=null;
		String string3="sx";
		String string4="km";
		System.out.println(string2.contains(string3));
		System.out.println(string2.contains(string4));
		
	}
	
	
	
}
class Solution01 {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                
            }
        }
		return null;
    }
}

class Solution02 {
	
	public static void main(String[] args) {
		int [] nums = new int[] {2, 11, 7, 15};
		int target = 9;
		long start = System.currentTimeMillis();
		//System.out.println(start);
		System.out.println(Arrays.toString(new Solution02().twoSum(nums, target)));
		long end = System.currentTimeMillis();
		//System.out.println(end);
		//System.out.println(end-start);
		
	}
	
    public int[] twoSum(int[] nums, int target) {
        boolean mark = false;
        for(int i=0;i<nums.length ;i++){
        	System.out.println(i);
            for(int j=i+1;j<nums.length ;j++){
            	System.out.println(j);
                if(nums[i]+nums[j]==target){
                    int [] result= new int[2];
                    result[0]=i;
                    result[1]=j;
                    //mark = true;
                    return result;
                }
            }
        }
        return null;
    }
}

class Solution0202 {
	
	public static void main(String[] args) {
		int [] nums = new int[] {2, 7, 11, 15};
		int target = 9;
		System.out.println(Arrays.toString(new Solution0202().twoSum(nums, target)));
		
	}
	
    public int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];
        
        // 建立k-v ，一一对应的哈希表
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(hash.containsKey(nums[i])){
                indexs[0] = hash.get(nums[i]);
                indexs[1] = i;
                return indexs;
            }
            // 将数据存入 key为补数 ，value为下标
            hash.put(target-nums[i],i);
        }


        // // 双重循环 循环极限为(n^2-n)/2 
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = nums.length - 1; j > i; j --){
        //         if(nums[i]+nums[j] == target){
        //            indexs[0] = i;
        //            indexs[1] = j; 
        //            return indexs;
        //         }
        //     }
        // }
        
        return indexs;
    }
}