import java.util.*;

/**
Name: Khoa Le
Student #: 200338408
Class: ENSE 374-093
Purpose: To Create a single linked list
Date: Mon. Oct. 26/ 15 
**/

public class ListElement {
	
	private ListElement next;
	private int data; 
	
	//default constructor 
	public ListElement(){
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
	public void addElement(ListElement le){
		ListElement temp = null; 
			
		if (this.next == null){
			this.data = le.data;
			this.next = new ListElement();
			return;
		}
		ListElement list = this;
		while (list.next != null){ 
			list = list.next;			
		}
		list.data = le.data;
		list.next = new ListElement();
		return;
	}
	
	//element getter 
	public ListElement getElement (int index){
		ListElement list = this;
		while (list.next != null){			
			if (list.data == index)
				return list;
			list = list.next;
		}
		return this;
	}
	
	//function to remove element 
	public ListElement deleteElement(int index){
		ListElement prev = this;
		ListElement list = this;

		if (list.data == index){
			this.data = this.next.data;
			this.next = this.next.next;
			return this;
		}
		list = list.next;
		
		while (list.next != null){			
			if (list.data == index){
				prev.next = list.next;
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
		ListElement list = this;
		while (list.next != null){
			System.out.print("["+list.data+"]");
			list = list.next;
		}
		return;
	}
	
};
