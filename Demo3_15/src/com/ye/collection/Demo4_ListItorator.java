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
		ԭ�� list.iterator()�ķ���ֵ����ʱ iterator;listItrator
		�����࣬ so why wrong������ ǿ������ת�����븸������ ָ���������,�����Ƕ��ǽӿ�!!!
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
