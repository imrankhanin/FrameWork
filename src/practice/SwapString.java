package practice;

public class SwapString
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s1 = "Imran";
		System.out.println("s1="+s1);
		System.out.println("s1.length()="+s1.length());
		String s2 = "Khan";
		System.out.println("s2="+s2);
		System.out.println("s2.length()="+s2.length());
		s1=s1.concat(s2);
		System.out.println("s1.concat(s2)="+s1);
		System.out.println("s1.length()="+s1.length());
		s2=s1.substring(0, s1.length()-s2.length());
		System.out.println("s2="+s2);
		System.out.println("s1.length()-s2.length()="+(s1.length()-s2.length()));
		s1=s1.substring(s2.length());
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		
		String s3="";
		System.out.println("s3="+s3);
		System.out.println("s3.length()="+s3.length());
		
		String s4="a";
		System.out.println("s4="+s4);
		System.out.println("s4.length()="+s4.length());
		
		String s5="imrankhan?";
		System.out.println("s5="+s5);
		
		/*int index=s5.indexOf(s5);
		System.out.println("s5.indexOf(s5)="+index);*/
		
		System.out.println("s5.indexOf(\"k\")"+s5.indexOf("k"));
		System.out.println("s5.charAt(5)"+s5.charAt(5));
		
		String s6=s5.substring(5);
		System.out.println("s5.substring(5)="+s6);
		
		String s7="hello";
		String s8="bob";
		
		String s9="hellobob";
		
		String s10=s9.substring(0, 5);
		System.out.println(s10);
	}

}
