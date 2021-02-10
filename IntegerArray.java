package test;
import java.util.Scanner;

public class IntegerArray {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size");
		int[] arr=new int[scan.nextInt()];
		System.out.println("Enter the age");
		int ChildCount=0;
		int AdultCount=0;
		int SeniorCount=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<18)
			{
				ChildCount++;
			}
			else if(arr[i]>=18 && arr[i]<=54)
			{
				AdultCount++;
			}
			else 
			{
				SeniorCount++;
			}
		}
		System.out.println("Children "+ChildCount);
		System.out.println("Adult "+AdultCount);
		System.out.println("Senior Citizen "+SeniorCount);
	}

}