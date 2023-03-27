/*
 * ARRAY EXAMPLES:-->
 * 
 * 
 * 1. write a program to store marks of students who had appeared for mathmatics examination conducted
   by the central board of mathmatics where 15 students had appeared for examination  and also  
   display the marks of each students.
		
--> 
 */
/*
import java.util.Scanner;
public class Array_examples {
	public static void main(String[] args) {
		System.out.println(" Enter the count of students: ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		for (int i=0;i<n;i++) {
			System.out.println(" Enter the marks of students:" +(i+1));
			arr[i]=sc.nextInt();
			
		}
		System.out.println("*********************************************");
		for (int i=0;i<n;i++) {
			System.out.println("The marks of student number:" +(i+1)+arr[i]);
		}
	}
}
*/
/*
 * 2D array:---
2.Shradha is the owner of an educational trust which is named as shradha vidya niketan.It is
  the educational trust which is rated 5 stars for kind of infrastructure that it contains and 
  also for the performances by each class of students.
			class 1: 5students; 100% result
			class 2: 5students; 100% result
			class 3: 5students; 100% result
--->
*/

import java.util.Scanner;
public class Array_examples {
	public static void main(String[] args) {
		System.out.println(" Enter the count of class: ");
		Scanner sc= new Scanner(System.in);
		int cls=sc.nextInt();
		System.out.println(" Enter the count of each class: ");
		int stu=sc.nextInt();
		int arr[][]=new int[cls][stu];
		for (int i=0;i<cls;i++) {
			System.out.println("inside the class"+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("enter the marks of student"+(j+1));
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("***************************************");
		for(int i=0;i<cls;i++) {
			System.out.println("The marks of student "+(i+1));	
		
		for(int j=0;j<stu;j++) {
			System.out.println("The marks of student "+(j+1)+("is:")+arr[i][j]);
		}
	}
}
	
}

/////////////////////////////////////////////////////////////////////////////////////////////