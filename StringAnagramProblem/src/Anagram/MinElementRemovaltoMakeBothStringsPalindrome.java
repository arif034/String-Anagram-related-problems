package Anagram;
import java.util.*;
public class MinElementRemovaltoMakeBothStringsPalindrome
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
	}
	public static int minElementRemovaltoMakeBothStringsPalindrome(String s1, String s2)
	{
		int count = 0;
		int len1 = s1.length();
		int len2 = s2.length();
		char ch1[] = new char[len1];
		char ch2[] = new char[len2];
		for(int i=0;i<len1;++i)
		{
			ch1[i] = s1.charAt(i);
		}
		for(int i=0;i<len2;++i)
		{
			ch2[i] = s2.charAt(i);
		}
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		int i=0;
		int len;
		if(len1 > len2)
		{
			len = len2;
		}
		else
		{
			len = len1;
		}
		while(i<len)
		{
		}
		return count;
	}
}