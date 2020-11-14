/**
 * 
 */
package com.thinkerofbraver.learning.leetcode;

import java.util.Arrays;

/**
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。

对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。

你可以返回任何满足上述条件的数组作为答案。
输入：[4,2,5,7]
输出：[4,5,2,7]
解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
 * @author 憧憬
 *2020.11.12
 */
public class Solution922 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A= {4,2,5,7};
		
		System.out.println(Arrays.toString(new Solution922().sortArrayByParityII(A)));
	}
	
	public int[] sortArrayByParityII(int[] A) {
		
		int len=A.length;
		int[] a=new int[len/2];
		int j=0;
		int[] b=new int[len/2];
		int k=0;
		for(int i=0;i<A.length;i++) {
			if(A[i]%2==0) {
				a[j]=A[i];
				j++;
			}else{
				b[k]=A[i];
				k++;
			}
		}
		
		for(int i=0;i<len;i=i+2) {
			A[i]=a[i/2];
			A[i+1]=b[i/2];
		}
		
		
		return A;

    }

}
