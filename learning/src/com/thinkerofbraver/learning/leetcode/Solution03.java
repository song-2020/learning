package com.thinkerofbraver.learning.leetcode;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * @author song
 *2020.9.29
 */
public class Solution03 {
	
	public static void main(String[] args) {
		int num=new Solution03().lengthOfLongestSubstring("abcd");
		System.out.println(num);
	}
	
	public int lengthOfLongestSubstring(String s) {
		StringBuilder sb=new StringBuilder();
		System.out.println(sb);
		sb.append(s.charAt(0));
		for(int i=1;i<s.length();i++) {
			for(int j=0;j<sb.length();j++) {
				if(s.charAt(i+1)==sb.charAt(j)) {
					break;
				}else {
					sb.append(s.charAt(i));
				}
				
			}
		}
		return sb.length();
    }
}
