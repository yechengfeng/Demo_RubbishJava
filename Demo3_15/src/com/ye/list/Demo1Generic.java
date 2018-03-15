package com.ye.list;

import java.util.ArrayList;
import java.util.Iterator;

import com.ye.clazz.Student;

public class Demo1Generic {

	public static void main(String[] args) {
		ArrayList list  = new ArrayList();
		list.add(true);
		list.add(new Student("’≈∞≤",45,7894));
		list.add(3);
		list.add("nihao");
		list.add("truedf");
		//System.out.println(list);
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
