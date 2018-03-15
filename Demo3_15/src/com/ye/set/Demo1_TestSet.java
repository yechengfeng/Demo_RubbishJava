package com.ye.set;

import java.util.HashSet;

import com.ye.clazz.Student;

public class Demo1_TestSet {
	/*如果不重写hashCode方法，会调用父类的hashCode方法，
	 * 父类的哈希方法调用后哈希值 都不一样，则不会调用equals方法，则会全部存储。
	 * 重写hashCode方法，哈希值 一样在调用equals方法，提高了效率。避免了每次调用equals方法
	 */

	public static void main(String[] args) {
		//demo1();
		HashSet<Student> ds =new HashSet<>();
		ds.add(new Student("詹三",8,4345));
		ds.add(new Student("李四",454,545));
		ds.add(new Student("王五",7,645));
		ds.add(new Student("赵六",6,43454));
		ds.add(new Student("赵六",6,43454));
		ds.add(new Student("地方",5,4543));
		ds.add(new Student("的",4,5453));
		ds.add(new Student("的",4,5453));
		 System.out.println(ds);
		/*System.out.println(ds.size());
		String s="dfe";
		for (int i = 0; i < 10; i++) {
			System.out.println(s.hashCode());*/
		//}*/		
	}

	private static void demo1() {
		HashSet<String> hs =new HashSet<>();
		hs.add("2");
		hs.add("3");
		hs.add("4");
		hs.add("df");
		hs.add("dfe");
		hs.add("fg");
		hs.add("qw");
		hs.add("5d");
		System.out.println(hs);
		for (String string : hs) {
			System.out.println(string);
		}
	}

}
