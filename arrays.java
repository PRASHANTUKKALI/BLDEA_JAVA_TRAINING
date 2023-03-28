/*EX:1
 * 
 * Shradha is owner of the educational trust which is named as shradha vidya niketan it is trust which is rated as 5 star for the kind of infrastructure 
 * contains also the performance of the students in every year below mention is climps of performance of each class of students 
 * class 1:5 students cent percent(100%)
 * class 2:5 students cent percent(100%)
 * class 3:5 students cent percent(100%)
 * defect this abov mentioned senario to store and desplay the result

*/

/*class     students
 * 0            5
 * 1            5
 * 2            5
 * */


/*import java.util.Scanner;
public class arrays {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the count of class :");
Scanner sc = new Scanner(System.in);
int cls = sc.nextInt();
System.out.println("enter the count of students in each class: ");
int stu = sc.nextInt();
 int arr[][] = new int[cls][stu];
 for(int i=0; i<cls; i++) {
	 System.out.println("inside the class"+(i+1));
	 for(int j=0; j<stu; j++) {
		 System.out.println("enter the marks of student"+(j+1));
		 arr[i][j] = sc.nextInt();
		 
	 }
 }
 
 System.out.println("----------------------------");
 for(int i=0; i<cls; i++) {
	 System.out.println("inside the class"+(i+1));
	 for(int j=0; j<stu; j++) {
		 System.out.println("enter the marks of student"+(j+1)+("is : ")+arr[i][j]);
		 
		
		 

		 }

}
  }
	} */




//OUTPUT OF ABOVE PROGRAM:///////////////////

/*enter the count of class :
3
enter the count of students in each class: 
5
inside the class1
enter the marks of student1
41
enter the marks of student2
31
enter the marks of student3
33
enter the marks of student4
21
enter the marks of student5
34
inside the class2
enter the marks of student1
23
enter the marks of student2
65
enter the marks of student3
36
enter the marks of student4
44
enter the marks of student5
43
inside the class3
enter the marks of student1
34
enter the marks of student2
71
enter the marks of student3
32
enter the marks of student4
54
enter the marks of student5
23
----------------------------
inside the class1
enter the marks of student1is : 41
enter the marks of student2is : 31
enter the marks of student3is : 33
enter the marks of student4is : 21
enter the marks of student5is : 34
inside the class2
enter the marks of student1is : 23
enter the marks of student2is : 65
enter the marks of student3is : 36
enter the marks of student4is : 44
enter the marks of student5is : 43
inside the class3
enter the marks of student1is : 34
enter the marks of student2is : 71
enter the marks of student3is : 32
enter the marks of student4is : 54
enter the marks of student5is : 23   */


/*EX:2
 * 
 * write a program to store the marks of students who had appered for mathematics examination conducted by the central board of mathematics where
 * 15 student had appered for examination also display the marks of each students */

 

import java.util.Scanner;

/**
 * @author ratho
 *
 */
public class arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the count of students : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++) {
System.out.println("enter the marks of student numberb"+(i+1));
		arr[i]=sc.nextInt();
	}
		for(int i=0; i<n; i++) {
System.out.println("the marks of student number"+(i+1)+("is : ")+arr[i]);
}
}
}
//////////////////////////////////////////////////////

///    OUTPUT    ///

/*enter the count of students : 
5
enter the marks of student numberb1
25
enter the marks of student numberb2
20
enter the marks of student numberb3
15
enter the marks of student numberb4
21
enter the marks of student numberb5
22
the marks of student number1is : 25
the marks of student number2is : 20
the marks of student number3is : 15
the marks of student number4is : 21
the marks of student number5is : 22*/



