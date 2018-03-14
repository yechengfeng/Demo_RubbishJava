package com.ye.collection;

import java.util.ArrayList;
import java.util.List;

import com.ye.clazz.Student;

public class Demo2_List {

	public static void main(String[] args) {
		 //通过size()和get()方法结合使用遍历。
		List list = new ArrayList();
		list.add(new Student("张三",13,18841231));
		list.add(new Student("李四",15,18841232));
		list.add(new Student("王五",23,18841233));
		list.add(new Student("赵柳",12,18841234));
		for (int i = 0; i < list.size(); i++) {
			Student s = (Student)list.get(i);
			System.out.println(list.get(i));
			System.out.println(s.getName() + "," + s.getAge());
		}
	}

}
