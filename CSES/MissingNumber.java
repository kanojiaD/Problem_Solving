/*
You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.

Input :The first input line contains an integer n.

The second line contains n−1 numbers. Each number is distinct and between 1 and n (inclusive).

Output: Print the missing number.

Constraints:
2≤n≤2⋅105

Example

Input:
5
2 3 1 5

Output:
4
*/
import java.util.*;
//please change the class name 'MissingNumber' as 'Main', when you are submitting the code on CSES.
class MissingNumber{
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n= scan.nextInt();
		int cnt=n;
		long sum=0l;
		while(cnt>1)
		{
			sum+=scan.nextInt();
			cnt--;
		}
		System.out.println((long)n*(n+1)/2-sum);
	}
}