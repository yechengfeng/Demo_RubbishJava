package com.ye.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1_Remove {
	/** ����ArrayListȥ���������ַ������ظ�ֵ(�ַ�����������ͬ)
			 * ˼·�������¼��Ϸ�ʽ
	 * 
	 */
       public static void main(String[] args) {
		ArrayList list =new ArrayList();
		list.add(("a"));
		list.add(("a"));
		list.add(("a"));
		list.add(("b"));
		list.add(("b"));
		list.add(("b"));
		list.add(("c"));
		list.add(("c"));
		list.add(("c"));
		list.add(("d"));
		list.add(("e"));
		ArrayList list1 =list;
		
	   ArrayList newList =  getSingle(list);   
	   System.out.println(newList.toString());
	   System.out.println(".............");
		ArrayList newList1 =  removeTheSame(list);   
		System.out.println(newList1.toString());
	   
	    /*  ˵����д��toString������*/
	      
	}

	private static ArrayList getSingle(ArrayList list) {
		 ArrayList newList =new ArrayList();
		for (int j = 0; j < list.size(); j++) {
			 
			if(newList.contains(list.get(j))){
				continue;
			}
			else 
				 newList.add(list.get(j));
				
		}
		
	            return   newList;
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
