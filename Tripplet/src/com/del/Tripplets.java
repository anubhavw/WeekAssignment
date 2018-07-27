package com.del;

import java.util.Scanner;

public class Tripplets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			boolean value=UserMainCode.checkTripplets(arr);
			System.out.println(value);
		}
	}

	 static class UserMainCode
	{

		public static boolean checkTripplets(int[] arr) {
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i]==arr[i+1] && arr[i+1]==arr[i+2])
				{
					return true;
				}
					
			}
			return false;
		}
		
	}
}
