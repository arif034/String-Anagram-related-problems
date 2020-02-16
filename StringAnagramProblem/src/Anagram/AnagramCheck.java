package Anagram;
import java.util.*;
public class AnagramCheck
{
	public static void main(String[] args)
	{
		int anagramCheck =0;
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int len1 = s1.length();
		int len2 = s2.length();
		
		if(len1 == len2)
		{
			char []ch1 = new char[len1];
			char []ch2 = new char[len2];
			for(int i=0;i<len1;++i)
			{
				ch1[i] = s1.charAt(i);
			}
			for(int i=0;i<len1;++i)
			{
				ch2[i] = s2.charAt(i);
			}
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for(int i=0;i < len1;++i)
			{
				if(ch1[i] == ch2[i])
				{
					temp = 0;
				}
				else
				{
					temp = 1;
				}
			}
			if(temp == 0)
			{
				anagramCheck =1;
			}
			else
			{
				anagramCheck =0;
			}
		}
		else
		{
			anagramCheck =0;
		}
		if(anagramCheck ==0)
			System.out.println("Not Anagram!");
		else
			System.out.println("Anagram!");
	}
}