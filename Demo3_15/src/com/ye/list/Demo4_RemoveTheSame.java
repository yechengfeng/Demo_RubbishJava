package com.ye.list;

import java.util.ArrayList;
import java.util.Iterator;

import com.ye.clazz.Student;

public class Demo4_RemoveTheSame {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("张三",13,794336));
		list.add(new Student("李四",13,794336));
		list.add(new Student("张三",13,794336));
		list.add(new Student("李四",13,794336));
		list.add(new Student("王五",13,794336));
		list.add(new Student("王五",13,794336));
		list.add(new Student("王五",13,794336));
		list.add(new Student("王五",13,794336));
		list.add(new Student("赵六",13,794336));
		ArrayList newLIst = Demo1_Remove.removeTheSame(list);
		ArrayList newList = removeTheSame(list);
		/*直接调用removeTheSame方法不可行，因为方法中的contain()方法
		 * 底层依赖的是equals方法，object中equals方法没有重写之前比较的
		 * 是地址值，所以需要在 学生类中重写equals方法
		 * 
		 * 
		 * 
		 */
		System.out.println(newList.toString());
	}
	public static ArrayList removeTheSame(ArrayList list){
		Iterator it = list.iterator();
		 ArrayList newList = new ArrayList();
		 while(it.hasNext()){
			 Object s= it.next();
			 if(!newList.contains(s)){
				 newList.add(s);
			 }
			
		 } 
		 return newList;
	}
	}
		
		
	
