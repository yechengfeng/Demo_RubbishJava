package com.ye.practise;
/*
 * 在一个集合中存储了无序并且重复的字符串,定义一个方法,让其有序(字典顺序),而且还不能去除重复
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Test_Sort {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("de");
		list.add("de");
		list.add("adfe");
		list.add("adfe");
		list.add("dffe");
		list.add("dffe");
		list.add("ee");
		list.add("ee");
		list.add("fe");
		list.add("bfe");
		list.add("kfe");
	//	Collections.sort(list);
		   sort(list);
		System.out.println(list);
	}
static	public void sort(ArrayList<String> list){
		TreeSet<String> st =new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int num =o1.compareTo(o2);
				return num==0? 1:num;
			
			}
		});
		st.addAll(list);
		list.clear();
		list.addAll(st);
	}

}
