package Anagram;
import java.util.*;
public class MinElementsremovalToMakeAnagram
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int res = minElementCount(s1,s2);
		System.out.println(res);
	}
	public static int minElementCount(String s1, String s2)
	{
		int count = 0;
		int len1 = s1.length();
		int len2 = s2.length();
		count = len2-len1;
		return count;
	}
}