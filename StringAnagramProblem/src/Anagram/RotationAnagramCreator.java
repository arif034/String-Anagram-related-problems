package Anagram;
import java.util.*;
public class RotationAnagramCreator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder m = new StringBuilder(s);
		int n = sc.nextInt();
		RotationAnagramCreator rac = new RotationAnagramCreator();
		System.out.println(rac.rotationAnagramCreator(m,n));
	}
	public StringBuilder rotationAnagramCreator(StringBuilder s, int n)
	{
		
		for(int i=0;i<n;++i)
		{
			s = anagramCreator(s);
		}
		return s;
	}
	public static StringBuilder anagramCreator(StringBuilder s)
	{
		int len = s.length();
		StringBuilder sb = new StringBuilder("");
		char ch = s.charAt(len-1);
		sb.append(ch);
		for(int i=0;i<len-1;++i)
		{
			sb.append(s.charAt(i));
		}
		return sb;
	}
}