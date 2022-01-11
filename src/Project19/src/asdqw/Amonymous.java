package asdqw;

public class Amonymous {
	Person field =new Person() {
		void work() {
			System.out.println("자위를합니다");
			}
		@Override
		void wake() {
			System.out.println("6시에 일어납니다");
			work();
		}
	};
	void method1() {
		Person localVar =new Person() {
			void walk() {
				System.out.println("정상수 불알을 터칩니다");
				
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		localVar.wake();
		
	}
	void method2(Person person) {
		person.wake();
	}
}
