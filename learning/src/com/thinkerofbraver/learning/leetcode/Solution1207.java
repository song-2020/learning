package com.thinkerofbraver.learning.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。
如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。
示例 1：
输入：arr = [1,2,2,1,1,3]
输出：true
解释：在该数组中，1 出现了 3 次，2 出现了 2 次，3 只出现了 1 次。没有两个数的出现次数相同。

示例 2：
输入：arr = [1,2]
输出：false

示例 3：
输入：arr = [-3,0,1,-3,1,1,1,-3,10,0]
输出：true
 * @author 憧憬
 *2020.10.28
 */
public class Solution1207 {
	
	static int x;
	public static void main(String[] args) {
		int y;
		System.out.println(x);
		//System.out.println(y);
		int[] arr= {-3,0,1,-3,1,1,1,-3,10,0};
		long start=System.currentTimeMillis();
		System.out.println(new Solution1207().uniqueOccurrences(arr));
		long end=System.currentTimeMillis();
		System.out.printf("%10d",end-start);
		
	}
	
	public boolean uniqueOccurrences(int[] arr) {
	    	
	    	//记录已经重复的数字
			List<Integer> list=new ArrayList<Integer>();
			
			int k;
			Map<Integer, Integer> map=new HashMap<Integer, Integer>();
			for(int i=0;i<arr.length;i++) {
				
			}
			
			
			for(int i=0;i<arr.length;i++) {
				if(!list.contains(arr[i])) {
					list.add(arr[i]);
					k=0;
					k++;
					for(int j=i+1;j<arr.length;j++) {
						if(arr[i]==arr[j]) {
							k++;
						}
					}
					map.put(arr[i], k);
				}
			}
			
			//记录各数字出现的次数
			List<Integer> temp=new ArrayList<Integer>();
			
			for (Integer integer : list) {
				if(temp.contains(map.get(integer))) {
					return false;
				}
				temp.add(map.get(integer));
				
			}
			return true;
	    	
	    }
}
