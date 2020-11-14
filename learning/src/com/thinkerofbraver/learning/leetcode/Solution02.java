package com.thinkerofbraver.learning.leetcode;

import com.thinkerofbraver.learning.tools.PrintMark;

class ListNode {
	
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

/**
 * 
 * @author song
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/add-two-numbers
2020.9.28
 *
 */
public class Solution02 {
	
	PrintMark printMark=new PrintMark("*");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(new Solution03().getNumber(getNodes(5)));
		
		//System.out.println(new Solution03().addTwoNumbers(
				//getNodes(3), getNodes(3)).next.val);
		ListNode node=new Solution02().addTwoNumbers(
				getNodes(4), getNodes(4));
		while(node!=null) {
			System.out.print(node.val);
			node=node.next;
		}
	}
	
	public static ListNode getNodes(int num) {
		ListNode[] listNodes = new ListNode[num];
		listNodes[0]=new ListNode(1);
		for(int i=1;i<num;i++) {
			listNodes[i]=new ListNode(i+1);
			listNodes[i-1].next=listNodes[i];
		}
		return listNodes[0];
	}
	
	//core
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		/*
		ListNode root = new ListNode(0);
        ListNode cursor = root;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int sumVal = l1Val + l2Val + carry;
            carry = sumVal / 10;
            
            ListNode sumNode = new ListNode(sumVal % 10);
            cursor.next = sumNode;
            cursor = sumNode;
            
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        
        return root.next;
        */
		
		
		Solution02 solution03=new Solution02();
		long num1=solution03.getNumber(l1);
		long num2=solution03.getNumber(l2);
		num1=9999999991l;
		num2=9l;
		long sum=num1+num2;
		//long sum=10000000000l;
		String string=Long.toString(sum);
		
		ListNode root = new ListNode(0);
        ListNode cursor = root;

		
		for(int i=string.length()-1;i>=0;i--) {
			ListNode sumNode = new ListNode(Integer.valueOf(String.valueOf(string.charAt(i))));
			cursor.next = sumNode;
            cursor = sumNode;
		}
		
		return root.next;
		

    }

    public long getNumber(ListNode node){
        long result=0l,temp=1l;
        while(node!=null) {
        	result+=node.val*temp;
        	temp*=10;
        	node=node.next;
        }
		return result;
    }

}





/*
 package com.thinkerofbraver.learning.leetcode;

import com.thinkerofbraver.learning.tools.PrintMark;

class ListNode {
	
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

/**
 * 
 * @author song
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/add-two-numbers
2020.9.28
 *
 */
/*
public class Solution03 {
	
	PrintMark printMark=new PrintMark("*");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(new Solution03().getNumber(getNodes(5)));
		
		System.out.println(new Solution03().addTwoNumbers(
				getNodes(3), getNodes(3)).next.val);
		
	}
	
	//core
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		Solution03 solution03=new Solution03();
		int num1=solution03.getNumber(l1);
		int num2=solution03.getNumber(l2);
		int sum=num1+num2;
		String string=Integer.toString(sum);
		System.out.println(string);
		System.out.println(string.charAt(string.length()-1));
		
		ListNode temp=new ListNode(string.length()-1);
		ListNode head=temp;
		temp=temp.next;
		temp=new ListNode(Integer.valueOf(String.valueOf(string.charAt(string.length()-1))));
		
		ListNode root = new ListNode(0);
        ListNode cursor = root;

		
		for(int i=string.length()-1;i>=0;i--) {
			ListNode sumNode = new ListNode(Integer.valueOf(String.valueOf(string.charAt(i))));
			cursor.next = sumNode;
            cursor = sumNode;
			
            /*
			temp=temp.next;
			temp=new ListNode(Integer.valueOf(String.valueOf(string.charAt(i))));
			printMark.print(String.valueOf(i));
			System.out.println(temp.val);
			
		}
		
             
		/*
		printMark.print("temp.val");
		System.out.println(temp.val);
		
		head=head;
		printMark.print("head");
		System.out.println(head.val);
		
		return root.next;

    }
	
	public static ListNode getNodes(int num) {
		ListNode[] listNodes = new ListNode[num];
		listNodes[0]=new ListNode(1);
		for(int i=1;i<num;i++) {
			listNodes[i]=new ListNode(i+1);
			listNodes[i-1].next=listNodes[i];
		}
		return listNodes[0];
	}
	
	

    public int getNumber(ListNode node){
        int result=0,temp=1;
        while(node!=null) {
        	result+=node.val*temp;
        	temp*=10;
        	node=node.next;
        }
		return result;
    }

}*/


