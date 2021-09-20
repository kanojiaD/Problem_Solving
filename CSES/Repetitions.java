/*
You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.

Input: The only input line contains a string of n characters.

Output: Print one integer: the length of the longest repetition.

Constraints
1≤n≤106
Example

Input:
ATTCGGGA

Output:
3
*/
import java.util.*;
//please change the class name 'Repititions' as 'Main', when you are submitting the code on CSES. 
class Repetitions{
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String str= scan.nextLine();
		int n= str.length();
		int maxSequence=0, currentSequenceNumber=1;
		for(int i=1; i<n; i++)
		{
			if(str.charAt(i)==str.charAt(i-1)) currentSequenceNumber++;
			else
			{
				maxSequence=Math.max(maxSequence, currentSequenceNumber);
				currentSequenceNumber=1;
			}
			
		}
		System.out.println(Math.max(maxSequence, currentSequenceNumber));
	}
}