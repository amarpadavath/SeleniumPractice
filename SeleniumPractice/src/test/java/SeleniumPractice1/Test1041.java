package SeleniumPractice1;

public class Test1041 {
	
	public static void main(String args[])
	{
		String s = "i love coding";
		//coding love i
		
		String y ="";
		
		int x = s.length();
		
		System.out.println(x);
		
		for(int i=x-1;i>x;i--)
		{
			char ch = s.charAt(i);
			
			System.out.print(ch);
			
			 
		}
	}

}
