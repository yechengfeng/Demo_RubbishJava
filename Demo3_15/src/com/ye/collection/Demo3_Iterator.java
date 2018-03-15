package com.ye.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
 
 /*   并发修改异常
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
	// demo2(list);//依旧报错，在迭代时增加或减少元素
	             // 应该用ListIterator 特有的方法
		demo3(list);
	}

	private static void demo3(List list) {
		ListIterator lit =list.listIterator();
		while(lit.hasNext()){
			String str =(String)lit.next();
			if("ycf".equals(str)){
				lit.add("你好");
			}
			for(int i=0;i<list.size();i++)
				System.out.println(list.get(i));
		}
	}

	private static void demo2(List list) {
		Iterator  it =list.iterator();//获取迭代器
		 while(it.hasNext()){
			 String str =(String)it.next();
			 if("ycf".equals(str)){
				 list.add("你好");
			 }
			 for(int i=0;i<list.size();i++)
					System.out.println(list.get(i));
		 }
	}

	private static void demo1(List list) {
		for(int i=0;i<list.size();i++){
				String  s = (String)(list.get(i));
					if("ycf".equals(list.get(i)))
						list.set(i, "你好");
//				list.add(i, "报错");//遍历的同时增加元素 出现错误 
				}
			for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}

}
