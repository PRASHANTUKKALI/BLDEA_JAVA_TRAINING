//creating patterns
/*
a==>
  {" * * * * * "}
  
 
public class java_programs {
	public static void main(String[] args) {
		for(int j=1;j<=5;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
*/
//////////////////////////////////////////////////////////////////
/*
b==>
 { " 1 2 3 4 5 " }
 
 
public class java_programs {
	public static void main(String[] args) {
		for(int j=1;j<=5;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
*/
///////////////////////////////////////////////////////////////////////
/*
c==>
{"1 6 11 16 21"}


public class java_programs {
	public static void main(String[] args) {
		int count=1;
		for(int j=1;j<=5;j++) {
			System.out.print(count+" ");
			count=count+5;
		}
		System.out.println();
	}
}
 */
////////////////////////////////////////////////////////////////////////////
/*
 d==>
 {" 25 20 15 10 05"}
 
 */
public class java_programs {
	public static void main(String[] args) {
		int count=25;
		for(int j=1;j<=5;j++) {
			System.out.print(count+" ");
			count=count-5;
		}
		System.out.println();
	}
}

//1.
/* 
  $ $ $ $ $
  $ $ $ $ $
  $ $ $ $ $
  $ $ $ $ $
  $ $ $ $ $ 
  


public class java_programs {

	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=5;j++) {
				System.out.print("$ ");
			}
			System.out.println();
		}

	}

}
\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ */
/*
 
 
2.
   1 1 1 1 1
   2 2 2 2 2
   3 3 3 3 3
   4 4 4 4 4
   5 5 5 5 5

public class java_programs {

	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=5;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}

\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\   */
/*
 3.
 1 2 3 4 5
 1 2 3 4 5
 1 2 3 4 5
 1 2 3 4 5
 1 2 3 4 5
 
 
public class java_programs {

	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=5;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\  */
/*
 4.
 1  2  3  4  5
 6  7  8  9  10
 11 12 13 14 15
 16 17 18 19 20
 21 22 23 24 25
 
 
import java.util.Scanner;
	 public class java_programs {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of n: ");
		int n=sc.nextInt();
		int count=1;
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=n;j++) {
				System.out.print(count+"  ");
				count++;
			}
			
			System.out.println();
		}

	}
} 
*/
////////////////////////////////////////////////////////////////////////
/*
 
 5.
 25 24 23 22 21
 20 19 18 17 16
 15 14 13 12 11
 10 09 08 07 06
 05 04 03 02 01
 
 
import java.util.Scanner;
	 public class java_programs {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of n: ");
		int n=sc.nextInt();
		int count=n*n;
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=n;j++) {
				System.out.print(count+"  ");
				count--;
			}
			
			System.out.println();
		}

	}
} 
*/
////////////////////////////////////////////////////////////////////////////////////
/*
 
 6.
   
   1 6  11 16 21
   2 7  12 17 22
   3 8  13 18 23
   4 9  14 19 24
   5 10 15 20 25
   
   
import java.util.Scanner;
	 public class java_programs {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of n: ");
		int n=sc.nextInt();
		int count=1;
		for (int i=1;i<=n;i++) {
		count=i;
			for (int j=1;j<=n;j++) 
				{
				System.out.print(count+"  ");
				count=count+5;
			}
			System.out.println();
		}

	}
} 
*/
/*
 
 7.
 
 $
 $ $
 $ $ $
 $ $ $ $
 $ $ $ $ $
 
 
import java.util.Scanner;
	 public class java_programs {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of n: ");
		int n=sc.nextInt();
		
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=i;j++) 
				{
				System.out.print("$ ");
			
			}
			System.out.println();
		}

	}
}
*/ 
 /*
  1
  2 2
  3 3 3 
  4 4 4 4
  5 5 5 5 5
  
  
import java.util.Scanner;
	 public class java_programs {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of n: ");
		int n=sc.nextInt();
		
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=i;j++) 
				{
				System.out.print(i+" ");
			
			}
			System.out.println();
		}

	}
}
 
 */
/*
 
 8.
 
 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5
 
 
 
import java.util.Scanner;
	 public class java_programs {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of n: ");
		int n=sc.nextInt();
		
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=i;j++) 
				{
				System.out.print(j+" ");
			
			}
			System.out.println();
		}

	}
}
	 */