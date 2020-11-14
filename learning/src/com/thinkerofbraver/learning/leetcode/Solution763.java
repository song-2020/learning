/**
 * 
 */
package com.thinkerofbraver.learning.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 字符串 S 由小写字母组成。我们要把这个字符串划分为尽可能多的片段，
 * 同一个字母只会出现在其中的一个片段。返回一个表示每个字符串片段的长度的列表。
 * 示例
 * 输入：S = "ababcbacadefegdehijhklij"
输出：[9,7,8]
解释：
划分结果为 "ababcbaca", "defegde", "hijhklij"。
每个字母最多出现在一个片段中。
像 "ababcbacadefegde", "hijhklij" 的划分是错误的，因为划分的片段数较少。
 * @author 憧憬
 *2020.10.22
 */
public class Solution763 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="ababcbacadefegdehijhklij";
		System.out.println(new Solution().partitionLabels(S));
		
	}

}

//思路
/*
 * 先统计每个字母最后出现的位置，
 * 用HashMap记录，然后从头开始遍历字符串，每遇到一个字母，
 * 当前字母所在的区间最远会延伸到这个字母最后出现的位置即bound，
 * 继续遍历会不断刷新bound，如果遍历指针到达bound，表明该区间结束，
 * 开始计算下一个区间。官解中将本题的解题点看作是双指针 + 贪心，
 * 上文提到的bound也可以看做是一个超前的指针。
 */
class Solution {
    public List<Integer> partitionLabels(String S) {
            int[] pos = new int[26];
            int len = S.length();
            for (int i = 0; i < len; i++) {
                pos[S.charAt(i) - 'a'] = i;
            }
            List<Integer> res = new ArrayList<>();
            int pre = -1, i = 0, bound = 0;
            while (i < len) {
                if (i <= bound) {
                    bound = Math.max(bound, pos[S.charAt(i) - 'a']);
                }
                if (i == bound) {
                    res.add(i - pre);
                    pre = i;
                    bound++;
                }
                i++;
            }
            return res;

    	/*
    	//暂存已经记录的字符
    	char [] cs=new char[S.length()];
    	cs[0]=S.charAt(0);
    	int k=1;
    	
    	for(int i=0;i<S.length();i++) {
    		System.out.println(cs+"--"+S.charAt(i));
    		if(judge(cs, S.charAt(i))!=false) {
    			cs[k]=S.charAt(i);
    			k++;
    			System.out.println(k);
    		}
    		for(int j=i;j<S.length();j++) {
    			if(S.charAt(i)==S.charAt(j)) {
    				
    			}else {
    				
    			}
    		}
    	}
    	System.out.println(cs);
        return null;
        */
    }
    
    //判断暂存的记录中是否存在访问到的字符
    public Boolean judge(char [] cs,char c) {
    	for(int i=0;i<cs.length;i++) {
    		if(cs[i]==c) {
    			return false;
    		}
    }
		return true;
    }
}
