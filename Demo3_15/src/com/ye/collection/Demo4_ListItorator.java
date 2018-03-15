package com.ye.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo4_ListItorator {
	

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("dds");
		list.add("dd");
		list.add("ww");
		list.add("ww");
		list.add("ycf");
		list.add("love");
		ListIterator  lit =list.listIterator();
		//ListIterator  lit =(ListIterator) list.iterator();
		
	/*java.lang.ClassCastException
		原因： list.iterator()的返回值类型时 iterator;listItrator
		是子类， so why wrong？！！ 强制类型转换必须父类引用 指向子类对象,而他们都是接口!!!
		*/
//		
		while(lit.hasNext()){
			lit.next();
		}
			
		while(lit.hasPrevious()){
			System.out.print(lit.previous()+"   ");
		}
	}

}
