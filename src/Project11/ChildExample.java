package Project11;

import Project9.Child;

public class ChildExample {
	public static void main(String[] args) {
		Child parent =new Child();
		parent.field1 ="data1";
		parent.method1();
		parent.method2();
		
//		parent.field2 ="data2";
//		parent.method3();
		
		Child child = (Child) parent;
		child.field2 ="yyy";
		child.method3();
	}
 }
