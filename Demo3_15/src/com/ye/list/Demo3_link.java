package com.ye.list;

import java.util.LinkedList;

/** A:LinkedList�����
* B:LinkedList�����й���
	* public void addFirst(E e)��addLast(E e)
	* public E getFirst()��getLast()
	* public E removeFirst()��public E removeLast()
	* public E get(int index);*/

public class Demo3_link {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");
		System.out.println(list);
		//list.addFirst("A");
		//list.addLast("B");
		//System.out.println(list);
	}

}
