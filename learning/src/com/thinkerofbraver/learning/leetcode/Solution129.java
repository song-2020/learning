package com.thinkerofbraver.learning.leetcode;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * 求根到叶子节点数字之和 https://leetcode-cn.com/problems/sum-root-to-leaf-numbers/
 * @author 憧憬
 *2020.10.29
 */

public class Solution129 {

	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode treeNode=new Solution129().new TreeNode(1);
		treeNode.left=new Solution129().new TreeNode(2);
		treeNode.right=new Solution129().new TreeNode(3);
		treeNode.left.left=new Solution129().new TreeNode(4);
		treeNode.left.right=new Solution129().new TreeNode(5);
		
		//System.out.println(new Solution129().sumNumbers(treeNode));
		new Solution129().sumNumbers(treeNode);

	}
	
	String string="";
	public int sumNumbers(TreeNode root) {
		
		
		if(root!=null) {
			
			
			System.out.println(root.val);
			sumNumbers(root.left);
			//System.out.println(root.val);
			sumNumbers(root.right);
			string=string+root.val;
			//System.out.println(root.val);
			
		}
		System.out.println(string);
		return 0;

    }

}

