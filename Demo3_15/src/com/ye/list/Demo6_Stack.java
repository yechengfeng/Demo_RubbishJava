package com.ye.list;

public class Demo6_Stack {

	public static void main(String[] args) {
		Stack  s =new Stack();
		s.In("2");
		s.In("23");
		s.In("24");
		s.In("25");
		while(!s.isEmpty()){
			s.Out();
		}
	}

}
