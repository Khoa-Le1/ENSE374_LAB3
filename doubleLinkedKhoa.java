import java.util.*;

/**
Name: Khoa Le
Student #: 200338408
Class: ENSE 374-093
Purpose: Main program to load the linked list 
Date: Mon.Oct.26/15
 **/
 
 class doubleLinkedKhoa{
	 public static void main(String [] args){
		doubleListElement le = new doubleListElement(); 
		doubleListElement list = new doubleListElement();
		
		le.setData(1);
		list.addElement(le);
		le.setData(2);
		list.addElement(le);
		le.setData(3);
		list.addElement(le);
		le.setData(4);
		list.addElement(le);
		
		list.deleteElement(2);
		list.printLinkedListHead(); 
		System.out.print("\n"+"Now printing from tail:"+"\n");
		list.printLinkedListTail();
	 }
 };
