package com.ye.treeset;

import java.util.Iterator;
import java.util.TreeSet;
public class Demo1_TreeSet {

	public static void main(String[] args) {
		//demo1();
		TreeSet<Person> list = new TreeSet<>();
		list.add(new Person("詹三",13));
		list.add(new Person("张三",13));
		list.add(new Person("李四",13));
		list.add(new Person("乂的",13));
		list.add(new Person("圛地方",13));
		list.add(new Person("王五",13));
		list.add(new Person("赵六",13));
		list.add(new Person("黄燚",13));
		list.add(new Person("輣的",13));
		Iterator<Person> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		//System.out.println(list);
	}
	private static void demo1() {
		TreeSet<String> str =new TreeSet<>();
		str.add("d");
		str.add("b");
		str.add("d");
		str.add("a");
		str.add("a");
		str.add("a");
		str.add("1");
		str.add("1");
		str.add("1");
		str.add("d");
		System.out.println(str);//TreeSet 对对象进行排序 保证元素唯一
		/*
		 * 重写了compareTo方法
		 */
		/* public int compareTo(String anotherString) {
		        int len1 = value.length;
		        int len2 = anotherString.value.length;
		        int lim = Math.min(len1, len2);
		        char v1[] = value;
		        char v2[] = anotherString.value;

		        int k = 0;
		        while (k < lim) {
		            char c1 = v1[k];
		            char c2 = v2[k];
		            if (c1 != c2) {
		                return c1 - c2;
		            }
		            k++;
		        }
		        return len1 - len2;
		    }
*/
	}


}
