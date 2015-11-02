import java.util.*;

/**
Name: Khoa Le
Student #: 200338408
Class: ENSE 374-093
Purpose: To Create a doubly linked list
Date: Mon. Oct. 26/ 15 
**/

public class doubleListElement {
	
	private doubleListElement next;
	private doubleListElement previous; 
	private int data; 
	
	//default constructor 
	public doubleListElement(){
		this.data=0;
		this.next=null;
		this.previous=null;
	}
	
	
	//setters and getters 
	public void setData(int data){
		this.data=data; 
	}
    public int getData(){
		return this.data; 
    }

	//function to add element 	
	public void addElement(doubleListElement le){
		if (this.next == null){
			this.data = le.data;
			this.next = new doubleListElement();
			this.next.previous = this;
			this.previous = null;
			return;
		}
		doubleListElement list = this.next;
		doubleListElement prev = this; 
		
		while (list.next != null){
			prev = list;
			list = list.next;			
		}
		list.data = le.data;
		doubleListElement temp = new  doubleListElement();
		list.next = temp ;
		temp.previous = list;
		list.previous = prev;
		return;
	}
	
	//element getter 
	public doubleListElement getElement (int index){
		doubleListElement list = this;
		while (list.next != null){			
			if (list.data == index)
				return list;
			list = list.next;
		}
		return this;
	}
	
	//function to remove element 
	public doubleListElement deleteElement(int index){
		doubleListElement prev = this;
		doubleListElement list = this;

		if (list.data == index){
			this.data = this.next.data;
			this.next = this.next.next;
			return this;
		}
		
		list = list.next;
		
		while (list.next != null){			
			if (list.data == index){
				prev.next = list.next;
				list.previous = prev;
				return list;
			}
			list = list.next;
			prev = prev.next;
		}
		return this;
	}
	
	//prints from the head 
	public void printLinkedListHead(){
		if (this.next == null){
			return;
		}
		doubleListElement list = this;
		while (list.next != null){
			System.out.print("["+list.data+"]");
			list = list.next;
		}
		return;
	}
	
	//prints from the tail 
	public void printLinkedListTail(){
		
		if (this.next == null){
			return;
		}
		doubleListElement list = this;
		
		while (list.next != null){
			list = list.next;
		}
		list = list.previous;

		while (list.previous != null){
			System.out.print("["+list.data+"]");
			list = list.previous;
		}
		System.out.print("["+list.data+"]");
		list = list.previous;
		return;
	}
	
};
