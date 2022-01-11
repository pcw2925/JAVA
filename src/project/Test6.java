package project;

public class Test6 {
	public static void main(String[]args) {
		int x =3;
		int y =5;
		System.out.println("X:"+x+",y:"+y);
		
		int temp =x;
		x =y;
		y =temp;
		System.out.println("X:"+x+",Y:"+y);
	}

}
