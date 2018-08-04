package number;

import java.util.*;

public class Reversenum
{

	public static void main(String[] args)
	{
		String S;
	// TODO Auto-generated method stub
       int length,i;
      String reverse="";
       Scanner s = new Scanner(System.in);
       S =s.nextLine();
       s.close();
	for(i=S.length()-1;i>=0;i--)
    	   reverse=reverse+S.charAt(i);
       System.out.println(reverse);
     }
}
