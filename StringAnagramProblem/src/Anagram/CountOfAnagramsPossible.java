package Anagram;
import java.util.*;
public class CountOfAnagramsPossible 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int res = countpossibility(s);
	System.out.println(res);
	}
	private static int countpossibility(String s)
	{
		int len = s.length();
		int res = 1;
		while(len>0)
		{
			res = res*len;
			--len;
		}
		--res;
		return res;
	}
}
