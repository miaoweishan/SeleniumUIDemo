package UIDemo;
/*
 * 数据去重
 */

import java.util.ArrayList;
import java.util.List;

public class StringContaisTest {
	
	public static void main(String[] args) {
		
		String[] a = {"a","dc","a","56","ab","a","56","ba","NBA","b"};
		
		List<String> strList = new ArrayList<String>();
		
		for(int i=0;i<a.length;i++) {
			if(!strList.contains(a[i])) {
				strList.add(a[i]);
			}
		}
		
		for(String cc:strList) {
			System.out.println(cc);
		}
	}
}
