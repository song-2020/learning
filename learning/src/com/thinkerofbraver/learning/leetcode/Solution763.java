/**
 * 
 */
package com.thinkerofbraver.learning.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * �ַ��� S ��Сд��ĸ��ɡ�����Ҫ������ַ�������Ϊ�����ܶ��Ƭ�Σ�
 * ͬһ����ĸֻ����������е�һ��Ƭ�Ρ�����һ����ʾÿ���ַ���Ƭ�εĳ��ȵ��б�
 * ʾ��
 * ���룺S = "ababcbacadefegdehijhklij"
�����[9,7,8]
���ͣ�
���ֽ��Ϊ "ababcbaca", "defegde", "hijhklij"��
ÿ����ĸ��������һ��Ƭ���С�
�� "ababcbacadefegde", "hijhklij" �Ļ����Ǵ���ģ���Ϊ���ֵ�Ƭ�������١�
 * @author ��
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

//˼·
/*
 * ��ͳ��ÿ����ĸ�����ֵ�λ�ã�
 * ��HashMap��¼��Ȼ���ͷ��ʼ�����ַ�����ÿ����һ����ĸ��
 * ��ǰ��ĸ���ڵ�������Զ�����쵽�����ĸ�����ֵ�λ�ü�bound��
 * ���������᲻��ˢ��bound���������ָ�뵽��bound�����������������
 * ��ʼ������һ�����䡣�ٽ��н�����Ľ���㿴����˫ָ�� + ̰�ģ�
 * �����ᵽ��boundҲ���Կ�����һ����ǰ��ָ�롣
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
    	//�ݴ��Ѿ���¼���ַ�
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
    
    //�ж��ݴ�ļ�¼���Ƿ���ڷ��ʵ����ַ�
    public Boolean judge(char [] cs,char c) {
    	for(int i=0;i<cs.length;i++) {
    		if(cs[i]==c) {
    			return false;
    		}
    }
		return true;
    }
}
