package Anagram;
import java.util.*;
public class RemovingelementfromLastofArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		a[9] = Integer.MIN_VALUE;
		for(int i=0;i<a.length;++i)
		{
			System.out.println(a[i]);
		}
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		System.out.println(hm.hashCode());
	}

}
