package com.demo.test;

import com.demo.beans.SinglyLinkedList;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.addNode(12);
		list.addNode(15);
		list.addNode(10);
		list.addNode(17);
		list.addNode(16);
		list.addByPosition(100, 2);
		list.displaydata();
	} 	 

	
}
