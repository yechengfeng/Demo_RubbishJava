import java.util.HashMap;
import java.util.Map;

public class Demo2_Map {
	/*��ӹ���
		* V put(K key,V value):���Ԫ�ء�
			* ������ǵ�һ�δ洢����ֱ�Ӵ洢Ԫ�أ�����null
			* ��������ǵ�һ�δ��ڣ�����ֵ����ǰ��ֵ�滻����������ǰ��ֵ
	* b:ɾ������
		* void clear():�Ƴ����еļ�ֵ��Ԫ��
		* V remove(Object key)�����ݼ�ɾ����ֵ��Ԫ�أ�����ֵ����
	* c:�жϹ���
		* boolean containsKey(Object key)���жϼ����Ƿ����ָ���ļ�
		* boolean containsValue(Object value):�жϼ����Ƿ����ָ����ֵ
		* boolean isEmpty()���жϼ����Ƿ�Ϊ��
	* d:��ȡ����
		* Set<Map.Entry<K,V>> entrySet():
		* V get(Object key):���ݼ���ȡֵ
		* Set<K> keySet():��ȡ���������м��ļ���
		* Collection<V> values():��ȡ����������ֵ�ļ���
	* e:���ȹ���
		* int size()�����ؼ����еļ�ֵ�Եĸ���*/


	public static void main(String[] args) {
			Map<String, Integer> map =new HashMap<>();
		    Integer s =	map.put("����", 14);
		    Integer s1=map.put("����", 14);
		    Integer s2=	map.put("����", 13);
		    Integer s3 =map.put("����", 14);
		    Integer s4=map.put("����", 149);
			map.put("����", 114);
			System.out.println(s);
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
			System.out.println();
			System.out.println(map);
	}

}
