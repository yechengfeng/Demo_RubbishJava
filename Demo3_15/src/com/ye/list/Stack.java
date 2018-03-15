package com.ye.list;

import java.util.LinkedList;

public class Stack {
	private LinkedList list =new LinkedList();
	public void In(Object c){
		list.addLast(c);
	}
	public void Out(){
		System.out.println(list.removeLast());
	}
	public boolean isEmpty(){
		return list.isEmpty();
	}
}
