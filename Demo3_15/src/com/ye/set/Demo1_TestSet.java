package com.ye.set;

import java.util.HashSet;

import com.ye.clazz.Student;

public class Demo1_TestSet {
	/*�������дhashCode����������ø����hashCode������
	 * ����Ĺ�ϣ�������ú��ϣֵ ����һ�����򲻻����equals���������ȫ���洢��
	 * ��дhashCode��������ϣֵ һ���ڵ���equals�����������Ч�ʡ�������ÿ�ε���equals����
	 */

	public static void main(String[] args) {
		//demo1();
		HashSet<Student> ds =new HashSet<>();
		ds.add(new Student("ղ��",8,4345));
		ds.add(new Student("����",454,545));
		ds.add(new Student("����",7,645));
		ds.add(new Student("����",6,43454));
		ds.add(new Student("����",6,43454));
		ds.add(new Student("�ط�",5,4543));
		ds.add(new Student("��",4,5453));
		ds.add(new Student("��",4,5453));
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
