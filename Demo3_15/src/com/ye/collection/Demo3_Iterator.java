package com.ye.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
 
 /*   �����޸��쳣
 * 
 */

public class Demo3_Iterator {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("dds");
		list.add("dd");
		list.add("ww");
		list.add("ww");
		list.add("ycf");
		list.add("love");
	//demo1(list);
	// demo2(list);//���ɱ����ڵ���ʱ���ӻ����Ԫ��
	             // Ӧ����ListIterator ���еķ���
		demo3(list);
	}

	private static void demo3(List list) {
		ListIterator lit =list.listIterator();
		while(lit.hasNext()){
			String str =(String)lit.next();
			if("ycf".equals(str)){
				lit.add("���");
			}
			for(int i=0;i<list.size();i++)
				System.out.println(list.get(i));
		}
	}

	private static void demo2(List list) {
		Iterator  it =list.iterator();//��ȡ������
		 while(it.hasNext()){
			 String str =(String)it.next();
			 if("ycf".equals(str)){
				 list.add("���");
			 }
			 for(int i=0;i<list.size();i++)
					System.out.println(list.get(i));
		 }
	}

	private static void demo1(List list) {
		for(int i=0;i<list.size();i++){
				String  s = (String)(list.get(i));
					if("ycf".equals(list.get(i)))
						list.set(i, "���");
//				list.add(i, "����");//������ͬʱ����Ԫ�� ���ִ��� 
				}
			for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}

}
