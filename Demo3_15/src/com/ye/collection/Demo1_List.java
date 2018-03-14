package com.ye.collection; 
/*void add(int index,E element)
* E remove(int index)
* E get(int index)
* E set(int index,E element)*/

import java.util.ArrayList;
import java.util.List;

public class Demo1_List {

	public static void main(String[] args) {
		demo1();
		
	}

	private static void demo1() {
		List list = new ArrayList();
		list.add("a");
		list.add("dd");
		list.add("b");
		list.add("c");
		list.add(3, 4);
		list.remove(3);
		System.out.println(list);
		System.out.println(list.get(3));
		list.set(3, null);
		System.out.println(list.toString());
		System.out.println(list.remove("c"));
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.set(i, 'a'));
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
