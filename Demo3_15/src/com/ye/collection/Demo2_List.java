package com.ye.collection;

import java.util.ArrayList;
import java.util.List;

import com.ye.clazz.Student;

public class Demo2_List {

	public static void main(String[] args) {
		 //ͨ��size()��get()�������ʹ�ñ�����
		List list = new ArrayList();
		list.add(new Student("����",13,18841231));
		list.add(new Student("����",15,18841232));
		list.add(new Student("����",23,18841233));
		list.add(new Student("����",12,18841234));
		for (int i = 0; i < list.size(); i++) {
			Student s = (Student)list.get(i);
			System.out.println(list.get(i));
			System.out.println(s.getName() + "," + s.getAge());
		}
	}

}
