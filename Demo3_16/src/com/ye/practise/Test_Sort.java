package com.ye.practise;
/*
 * ��һ�������д洢���������ظ����ַ���,����һ������,��������(�ֵ�˳��),���һ�����ȥ���ظ�
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
