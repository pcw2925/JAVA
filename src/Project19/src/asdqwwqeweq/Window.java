package asdqwwqeweq;

import asdqwwqeweq.Button.OnClickListener;

public class Window {
	Button button1 =new Button();
	Button button2= new Button();
	
	
	OnClickListener listener=new Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�");
		}
	};
	
	 Window() {
		 button1.setOnClickListener( listener );
		 button2.setOnClickListener(new Button.OnClickListener() {
			 @Override
			 public void onClick() {
				 System.out.println("������ ���߳�");
			 }
		 });
	 }
}
