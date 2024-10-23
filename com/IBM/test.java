package com.IBM;

import java.io.*;
class test
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=br.readLine())!=null)
		{
			String[] arr=s.split(" ");
			String result=arr[arr.length-2];
			System.out.print(result);
		}
	}
}