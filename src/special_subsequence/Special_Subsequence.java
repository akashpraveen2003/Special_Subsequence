package special_subsequence;

import java.util.Scanner;

/*
    You have given a string A having Uppercase English letters.
	You have to find how many times subsequence "AG" is there in the given string.
 */
public class Special_Subsequence {

	private static int count_Special_Subsequence(String string) {
		// TODO Auto-generated method stub
		int a_count=0;
		int pair_count=0;
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)=='A')
			{
				a_count++;
			}
			else if(string.charAt(i)=='G')
			{
				pair_count+=a_count;
			}
		}
		return pair_count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		System.out.println(count_Special_Subsequence(string));
		
	}

	

}

/*
	Input
	A = "ABCGAG"

	Output
	3
	
	Input
	A = "GAB"

	Output
	0
*/