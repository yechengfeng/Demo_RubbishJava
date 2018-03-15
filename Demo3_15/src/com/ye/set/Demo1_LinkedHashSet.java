package com.ye.set;

import java.util.LinkedHashSet;

public class Demo1_LinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> list =new LinkedHashSet();
		list.add("q");
		list.add("q");
		list.add("w");
		list.add("r");
		System.out.println(list);
		/*说明重写了 tostring  hashcode equals 方法 
		 *  set中唯一保证了 存取的顺序性的类 底层链表 实现
		 */
		

		
		
	}

}
