package com.ye.list;

import java.util.ArrayList;
import java.util.Iterator;

import com.ye.clazz.Student;

public class Demo4_RemoveTheSame {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("����",13,794336));
		list.add(new Student("����",13,794336));
		list.add(new Student("����",13,794336));
		list.add(new Student("����",13,794336));
		list.add(new Student("����",13,794336));
		list.add(new Student("����",13,794336));
		list.add(new Student("����",13,794336));
		list.add(new Student("����",13,794336));
		list.add(new Student("����",13,794336));
		ArrayList newLIst = Demo1_Remove.removeTheSame(list);
		ArrayList newList = removeTheSame(list);
		/*ֱ�ӵ���removeTheSame���������У���Ϊ�����е�contain()����
		 * �ײ���������equals������object��equals����û����д֮ǰ�Ƚϵ�
		 * �ǵ�ֵַ��������Ҫ�� ѧ��������дequals����
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
		
		
	
