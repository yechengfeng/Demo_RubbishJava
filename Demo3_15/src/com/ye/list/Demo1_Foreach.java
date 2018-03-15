package com.ye.list;

import java.util.Arrays;
import java.util.LinkedList;

public class Demo1_Foreach {

	public static void main(String[] args) {
	
	}

	private static void demo1() {
		LinkedList<String> list =new LinkedList();
		LinkedList<String> list2 =new LinkedList();
		list.add("q");
		list.add("w");
		list.add("w");
		list.add("r");
		list.add("t");
		list.add("f");
		list.add("d");
		for (String string : list) {
			System.out.println(string);
		}
	}

}
