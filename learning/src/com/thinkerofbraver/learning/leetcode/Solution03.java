package com.thinkerofbraver.learning.leetcode;

/**
 * ����һ���ַ����������ҳ����в������ظ��ַ��� ��Ӵ� �ĳ��ȡ�
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
