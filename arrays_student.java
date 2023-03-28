/*EX1:
 * 
 * 
 * write a program to find the key element in an array by making use of linear search algorithm

package Training_code;

import java.util.Scanner;


public class arrays_student {

	
	public static int linearSearch(int arr[],int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==key) {
				return(i+1);
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array element to be searched:");
		int key = sc.nextInt();
		int arr[]= {10,30,25,68,40,15,90,78,144,71,54,8};
		
  int res = linearSearch (arr,key);
  if(res>0) {
	  System.out.println(" element found in position :"+(res));
  }
  else {
	  System.out.println("element not found");
  }
}
}



                       /////////////////////////////////////////////
                      /////////////////////OUTPUT/////////////////////

O/P1:    Enter the array element to be searched:
         144
         element found in position :9
       
O/P2:    Enter the array element to be searched:
         77
         element not found

*/






/*EX:2
 * 
 * CLASS    STUDENTS
 *  0          3
 *  1          4
 *  2          5
 *  
 *  
 *  as we see in the above requirement we have a
 *  
 *  n even number of students because of which it will be deficult to collect the student count in 
 *  common for all classes hence we will make use of the concept of jacked array
 */

/*package Training_code;

import java.util.Scanner;


public class arrays_student {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Count of classes:");
		Scanner sc=new Scanner(System.in);
		int cls = sc.nextInt();
		int arr[][] = new int[cls][];
		for(int i=0; i<arr.length; i++) {
			System.out.println("enter the student count inside class:"+(i+1));
			arr[i] = new int[sc.nextInt()];
		}
	
		for(int i=0; i<arr[i].length; i++) {
			System.out.println("inside the class:"+(i+1));
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("enter the marks of student"+(j+1));
			arr[i][j] = sc.nextInt();
		}
		}
		System.out.println("***************************************");
		for(int i=0; i<arr.length; i++) { 
			System.out.println("inside the class:"+(i+1));
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("the marks of student"+(j+1)+"is:"+arr[i][j]);
				
			}
		}
	}
}
	

                //////////////////////////////////////////////////////////////////////////
                      ////////////////////////////OUTPUT/////////////////////////////
Enter the Count of classes:
3
enter the student count inside class:1
3
enter the student count inside class:2
4
enter the student count inside class:3
5
inside the class:1
enter the marks of student1
45
enter the marks of student2
67
enter the marks of student3
89
inside the class:2
enter the marks of student1
80
enter the marks of student2
65
enter the marks of student3
78
enter the marks of student4
56
inside the class:3
enter the marks of student1
78
enter the marks of student2
87
enter the marks of student3
34
enter the marks of student4
12
enter the marks of student5
98
*/



/*EX:3
 * Badri is owner of the of the movie house which manages multiple theaters. it was observed that badri had new venture of another movie house 
 * which also governs multiple theaters. in order to maintain the equality among both the movei houses badri decided  to have 3 theaters in each 
 * of the movie house with each theater containing 2 screens the profit in badri that badri encountered in the finacial year was closely up to 20 lakhs
 * from each theater depict the above scenario to store the capacity of each theater screens and display the funds that each theaters screen can provide
 * assuming the price of each ticket is 350 has a std price 
 * 
 *   movie house     theater    screens
 *       0             0           2
 *                     1           2
 *                     2           2
 *       1             0           2
 *                     1           2
 *                     2           2 
 */



import java.util.Scanner;


public class arrays_student {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Count of movie house:");
		Scanner sc=new Scanner(System.in);
		int mov = sc.nextInt();
		System.out.println("enter the count of theater in each house:");
		int the = sc.nextInt();
		System.out.println("enter the count of screen in each theater:");
		int scr =sc.nextInt();
		
		int arr[][][] = new int[mov][the][scr];
		
				for(int i=0; i<arr[i].length; i++) {
					System.out.println("inside the movie house no:"+(i+1));
					for(int j=0; j<arr[i].length; j++) {
						System.out.println("inside the theater no"+(j+1));
						for(int k=0; k<arr.length; k++) {
							System.out.println("enter the capacity of scree no:"+(k+1));
							
			arr[i][j][k] = sc.nextInt();
		}
	}
}
		System.out.println("***************************************");
		for(int i=0; i<arr[i].length; i++) {
			System.out.println("inside the movie house no:"+(i+1));
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("inside the theater no"+(j+1));
				for(int k=0; k<arr.length; k++) {
					System.out.println("the fund collected from screen no:"+(k+1));
					int fund = arr[i][j][k];
					System.out.println("fund");
					
					
				}
			}
		}
	}
}
		/*
			**************************************************
			**********************OUTPUT********************
			Enter the Count of movie house:
				2
				enter the count of theater in each house:
				3
				enter the count of screen in each theater:
				2
				inside the movie house no:1
				inside the theater no1
				enter the capacity of scree no:1
				350
				enter the capacity of scree no:2
				99
				inside the theater no2
				enter the capacity of scree no:1
				220
				enter the capacity of scree no:2
				90
				inside the theater no3
				enter the capacity of scree no:1
				34
				enter the capacity of scree no:2
				209
				inside the movie house no:2
				inside the theater no1
				enter the capacity of scree no:1
				78
				enter the capacity of scree no:2
				35
				inside the theater no2
				enter the capacity of scree no:1
				120
				enter the capacity of scree no:2
				987
				inside the theater no3
				enter the capacity of scree no:1
				60
				enter the capacity of scree no:2
				450
*/





/*EX:4
 * write a program to solve the given ascending order 
 * 
 *-> soln
 *    using built in class arrays we can perform the sorting in a very compact approach the arrays class is available inside the util package  
 
package Training_code;
import java.util.Arrays;
public class arrays_student {
	public static void main(String[] args) {
		 int arr[] = {10,30,25,65,40,15,90,78,144,71,54,8};
		 Arrays.sort(arr);
		 for(int i=0; i<arr.length; i++) {
			 System.out.print(arr[i]+",");
		 }
	 }
}


                   *******************************************
                        **************OUTPUT**************
8,10,15,25,30,40,54,65,71,78,90,144,
*/



/*EX:5 
 * write a program to check if given two array are equal or not
 * 
 
	package Training_code;
	import java.util.Arrays;
public class arrays_student {
	public static void main(String[] args) {
int arr1[] = {10, 30,25,68,40,15,90,78,144,71,54,8};
int arr2[] = {90,78,10,30,25,144,71,54,8,68,40,999};
 Arrays.sort(arr1);
 Arrays.sort(arr2);
 if(arr1.length==arr2.length) {
	 for(int i=0; i<arr1.length; i++) {
		 if(arr1[i]!= arr2[i]){
			 System.out.println("Arrays not equal");
			 System.exit(0);
		
		 }
	 }
	System.out.println("Arrays are equal");
	}
 else {
	 System.out.println("Arrays not equal");
 }
}
}

                *************************************************
                    ******************OUTPUT*****************
   
     Arrays not equal
     
     */

