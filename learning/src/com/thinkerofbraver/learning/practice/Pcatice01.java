package com.thinkerofbraver.learning.practice;

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 * @author song
 * time:
 *
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Pcatice01 {
	
	public static void main(String[] args) {
		ListNode head=new ListNode(0);
		ListNode node01=new ListNode(1);
		head.next=node01;
		ListNode node02=new ListNode(2);
		node01.next=node02;
		ListNode node03=new ListNode(3);
		node02.next=node03;
		ListNode node04=new ListNode(4);
		node03.next=node04;
		ListNode node05=new ListNode(5);
		node04.next=node05;
		
		int num=10000000;
		ListNode[] listNodes = new ListNode[num];
		listNodes[0]=new ListNode(6);
		node05.next=listNodes[0];
		for(int i=1;i<num;i++) {
			listNodes[i]=new ListNode(i+6);
			listNodes[i-1].next=listNodes[i];
			
		}
		ListNode tempListNode=head;
		while(tempListNode!=null) {
			//System.out.println(tempListNode.val);
			tempListNode=tempListNode.next;
		}
		//System.out.println();
		//System.out.println(listNodes[99].val);
		//int val=new Pcatice01().ReverseList(head).val;
		ListNode newNode=null;
		long start=System.currentTimeMillis();
		ListNode node=new Pcatice01().ReverseList(head);
		long end=System.currentTimeMillis();
		System.out.println("运行时间:"+(end-start));
		System.out.println("测试点1:"+node.val);
		/*
		while(node!=null) {
			System.out.println(node.val);
			node=node.next;
		}
		*/
		//System.out.println(val);
		
	}
	
	//优化的办法
	public ListNode ReverseList(ListNode head) {
		
        if (head == null || head.next==null) return head;

        ListNode pre = null;
        ListNode post = head;
        while(head!=null)
        {
        //注意此处的顺序，刚好对角线上变量对应
            post = head.next;
            head.next = pre;
            pre = head;
            head = post;
        }

        return pre;
    }
	
    public ListNode ReverseList01(ListNode head) {
        
    	/*
        ListNode temp01=head;
        ListNode temp02=temp01.next;
        while(temp02.next!=null){
            temp01.next=null;
            ListNode temp=temp02.next;
            temp02.next=temp01;
            temp01=temp02;
            temp02=temp;

        }
        temp02.next=temp01;
        head=temp02;
        */
    	
    	if(head==null) {
    		return null;
    	}else {
    		ListNode temp=head;
        	ListNode temp02=head;
        	int count=0;
        	
        	while(temp.next!=null) {
        		temp=temp.next;
        		count++;
        	}
        	count++;
        	//System.out.println(count);
        	
        	ListNode[] listNodes=new ListNode[count];
        	for(int i=0;i<count;i++) {
        		listNodes[i]=temp02;
        		temp02=temp02.next;
        		//System.out.println("测试点2:"+listNodes[i].val);
        	}
        	
        	//System.out.println("测试点3:"+listNodes[count-1].val);

        	int temp03=count;
        	while(temp03>1) {
        		//System.out.println("测试点4:"+listNodes[temp03-1].val);
        		listNodes[temp03-1].next=listNodes[temp03-2];
        		temp03--;
        	}
        	listNodes[0].next=null;
        	head=listNodes[count-1];
        	

            return head;
    	}
    	
    	
    }
}
