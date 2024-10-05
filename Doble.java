package sameer.in.com;

import java.util.Scanner;

public class Doble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int limit=20;
		double sum=0;
		double arr[]=new double[limit];
		Scanner scan= new Scanner(System.in);
		 
			
		for(int i=0;i<limit;i++) {
			 arr[i]=scan.nextDouble();
			 sum=sum+arr[i];
			 
		}
		double average=sum/limit;
		System.out.println(average);
			 
			
		}

}


