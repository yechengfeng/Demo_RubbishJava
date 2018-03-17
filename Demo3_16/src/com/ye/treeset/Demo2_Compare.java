package com.ye.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo2_Compare {

	public static void main(String[] args) {
		CompareStr  coms =new CompareStr();
	//	TreeSet<String>  ts =  new TreeSet<>(new CompareStr()); 
			TreeSet<String>  ts =  new TreeSet<>(); 
		ts.add("d");
		ts.add("sss");
		ts.add("sd");
		ts.add("dfef");
		ts.add("dfefe");
		System.out.println(ts);
		
	}
 static class CompareStr implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			int num =o1.length()-o2.length();
			return  num==0? o1.compareTo(o2):num;
		}

	
		
	}
}
