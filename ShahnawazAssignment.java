package shahnawazAssignments;
import java.util.Scanner;
public class ShahnawazAssignment {
	// nCr and nPr 
     /* public static int nPr(int n , int r) {
    	  int result=factorial(n)/factorial(n-r);
    	  return result;
      }
      public static int nCr(int n , int r) {
    	  int result = factorial(n) / (factorial(n-r) * factorial(r));
    	  return result;
      }
      public static int factorial(int n) {
    	  int i = 1;
    	  int fact = 1;
    	  for(i=1; i<=n; i++) 
    		  fact = fact*i;
    	  return fact;
    		  
    	   }
	  public static void main(String [] args) {
		  System.out.println(nPr(4,2));
		  System.out.println(nCr(3,2));
	  }   */
	
	
	
	// Increment and Decrement 
	
	/* public static void main(String [] args) {
		// post fix increment and Decerement
		 int a = 9;
		 int b = a++;
		 System.out.println(a);
		 System.out.println(b);
		 
		 int i = 10;
		 int j = i--;
		 System.out.println(i);
		 System.out.println(j);
		 
		 // Prefix Increment and Decrement
		 int m = 11;
		 int n = ++m;
		 System.out.println(m);
		 System.out.println(n);
		 
		 int k = 12;
		 int l = --k;
		 System.out.println(k);
		 System.out.println(l);
	 } */
	
	
	    
	// Multiplication table
	  /*
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(n + "x" + i + "=" + n*i);
		}
	}  */
	
	
	
	
		
	}


  // String pool in Java
  /* 
      String pool is nothing but a storage area in Java heap .  It is just like object allocation.  By default, it is empty and privately maintained by the Java String class.
      Whenever we create a string the string object occupies some space in the heap memory. 
    
   example: 

String name = "Shahnawaz";
String name1= "Shahnawaz";
if ( name== name1){
System.out.println(" they are equal" );
}
else
System.out.println(" not equal" );

Reason :
 Because they are having diffirent Names , Still their memory allocation in the heap memory is Same. Because they carring same Characters.

   */


// Data type / Memory Size / Wrapper class / Range .
  /*
   Data Types       Wrapper ClassName  Memory size    Range

   byte             Byte               1 byte        -128 to 127
   short            Short              2 bytes       -32,768 to 32,767
   int              Integer            4 bytes       -2,147,483,648 to 2,147,483,647
   long             Long               8 bytes       -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

   float            Float              4 bytes
   double           Double             8 bytes

   char             Character          2 bytes
   String           String             According to string size

   bool             Boolean            1 byte
     */

// What is String...
  /*
  String : String is a sequence of characters. But in java string is an object that represents sequence of character.
   For example: String name="Shahnawaz"        //it is take 6 bytes
                String name="ShahnawazHashmi"  //30 bytes
   first store string name is Shahnawaz it will take memory size is 6 bytes. After that when it is changed to ShahnawazHashmi it's take 30 bytes that 
   is not possible to store in the same memory location because size is different for that reason string is called as immutable. 
  */

// Comparison between java And Python who is faster to execute code
  /*
   In terms of speed, Java is faster than Python as it is a compiled language. It takes less time to execute a code.
   Python is an interpreted language and it determines the type of data at run time which makes it slower comparatively.

 */
       


