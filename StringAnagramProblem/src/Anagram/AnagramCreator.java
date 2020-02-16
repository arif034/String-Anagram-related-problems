package Anagram;
import java.util.*;
public class AnagramCreator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder sb = anagramCreator(s);
		System.out.println(sb);
	}
	public static StringBuilder anagramCreator(String s)
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
