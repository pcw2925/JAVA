package asdads;

public class Outter {
	String field ="Qutter-field";
	void method() {
		System.out.println("»ó¼ö²¿Ãß");
	}
	
	class Nested {
		String field ="Nested-field";
		void method() {
			System.out.println("1cm");
		}
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
