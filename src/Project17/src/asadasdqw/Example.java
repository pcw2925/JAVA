package asadasdqw;

public class Example 
{
	public static void main(String[] args)
	{
		ImplementationC impl = new ImplementationC();
		
		ImplementationC ia = impl;
		ia.methodA();
		System.out.println();
		
		ImplementationC ib = impl;
		ib.methodB();
		System.out.println();
		
		ImplementationC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.mehtodC();
		
	}
}