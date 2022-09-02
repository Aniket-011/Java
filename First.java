/* 
class First{
   public static void main(String args[]){
      System.out.println("Hello World");
   }
}


class First{
   public static void main(String args[]){
      int a=11;
      int b=3;
      int j= a+b;
      System.out.print(j);

   }
}


//INPUT
import java.util.*;
class First{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      String name = sc.nextLine();
      System.out.println(name);
   }
}

1. Addition of two numbers

import java.util.*;
class First{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = a+b;
      System.out.println("Addition of two number is");
      System.out.println(c);
   }

}

2. To check odd or even

import java.util.*;
class First{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      if(a%2==0){
         System.out.println("Even");

      }
      else{
         System.out.println("Odd");
      }
   }
}

SWITCH CONDITION:

import java.util.*;
class First{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      switch(a){
         case 1: System.out.println("Hello");
         break;
         case 2: System.out.println("Namaste");
         break;
         case 3: System.out.println("Bonjour");
      }
   }
}

FOR LOOP:

class First{
   public static void main(String args[]){
      int i;
      for(i=0; i<5;i++)
      System.out.println("Hello World");
   }
}

WHILE LOOP:

class First{
   public static void main(String args[]){
      int i=0;
      while(i<7){
         System.out.println(i);
         i++;
      }
   }
}

DO WHILE:

class First{
   public static void main(final String args[]){
      int i=0;
      do{
         System.out.println(i);
           i++;
            
       } while(i<7);
      }
   }

SUM UPRTO N NATURAL NUMBER:
import java.util.*;
class First{
   public static void main(String args[]){
      int sum=0;
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      
      for(int i=0; i<a; i++)
{     
    sum=sum+i;
   
}   
System.out.println(sum);
   }
}

PATTERN:

class First{
   public static void main(String args[]){
      for(int i=0; i<5; i++){
         for(int j=0; j<5; j++){
            System.out.print("* ");
         }
         System.out.println("\n");
      }
   }
}

PATTERN:

class First{
   public static void main(String args[]){
      for(int i=1; i<=4; i++){
         for(int j=1; j<=5; j++){
            
            if(i==1||j==1||i==4||j==5)
            System.out.print("*");
            else
            System.out.print(" ");
         }
         System.out.println("\n");
         }
      }
   }


HALF PYRAMID PATTERN:

class First{
   public static void main(String args[]){
      for(int i=1; i<5; i++){
         for(int j=1; j<=i; j++){
            System.out.print("*");
         }
         System.out.print("\n");
      }
   }
}

REVERSE HALF PYRAMID PATTERN:

class First{
   public static void main(String args[]){
      for(int i=1; i<5; i++){
         for(int j=i; j<5; j++){
            System.out.print("*");
         }
         System.out.print("\n");
      }
   }
}

PATTERN:

class First{
   public static void main(String args[]){
      for(int i=1; i<5; i++){
         for(int j=i; j<5; j++){
            System.out.print(" ");
         }
         for(int j=1; j<=i; j++){
            System.out.print("*");
         }
         System.out.print("\n");
      }
   }
}

NUMBER PATTERN:

class First{
   public static void main(String args[]){
      for(int i=1; i<5; i++){
         for(int j=1; j<=i; j++){
            System.out.print(j+" ");
         }
         System.out.print("\n");
      }
   }
}


class First{
   public static void main(String args[]){
      for(int i=1; i<=5; i++){
         for(int j=i; j<=5; j++){
            System.out.print(j+" ");
         }
         System.out.print("\n");
      }
   }
}

FLOYD'S TRIANGLE:

class First{
   public static void main(String args[]){
      int r=1;
      for(int i=1; i<5; i++){
         for(int j=1; j<=i; j++){
            System.out.print(r+" ");
            r++;
         }
         System.out.print("\n");
      }
   }
}

0-1 TRIANGLE:

class First{
   public static void main(String args[]){
      int r=1;
      for(int i=1; i<5; i++){
         for(int j=1; j<=i; j++){
            int sum=i+j;
            if(sum%2==0){
               System.out.print("1 ");
            }
            else{
               System.out.print("0 ");
            }
         }
         System.out.print("\n");
      }
   }
}


class First{
   public static void main(String args[]){
      for(int i=1; i<=5; i++){
         for(int j=1; j<=i; j++){
               System.out.print("*");
         }
         int sp=2*(5-i);
         for(int j=1; j<=sp; sp++ ){
               System.out.print(" ");
         }
         for(int j=1; j<=i; j++){
            System.out.print("*");
         }
      }
      for(int i=5; i>=1; i--){
         for(int j=1; j<=i; j++){
               System.out.print("*");
         }
         int sp=2*(5-i);
         for(int j=1; j<=sp; sp++ ){
               System.out.print(" ");
         }
         for(int j=1; j<=i; j++){
            System.out.print("*");
         }
      }
   }
}

PATTERN:

class First{
   public static void main(String args[]){
      for(int i=1; i<=5; i++){
         int sp=(5-i);
         for(int j=1; j<=sp; j++){
            System.out.print(" ");
         }
         for(int j=1; j<=5; j++){
            System.out.print("*");
         }
         System.out.print("\n");
      }
   }
}

FUNCTION :

import java.util.*;
public class First{
   public static void printMyName(String name){
   System.out.println
   (name);
   return;
   }

   public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
      String name = sc.nextLine();
      printMyName(name);

   }
}

ADDITION OF TWO NUMDBERS USING FUNCTION:

import java.util.*;
class First{
   public static int addno(int a, int b){
      int c=a+b;
      System.out.println(c);
      return 0;
   }
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      addno(a,b);


   }
}

FACTORIAL OF TWO NUMBERS:

import java.util.*;
class First{
   public static int factno(int a){
      int f=1;
      while(a>0){
         f=f*a;
         a--;
      }
      System.out.println(f);
      return 0;
   }
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      factno(a);


   }
}

INPUT OF ARRAY:,  

import java.util.*;
class First{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int arr[] = new int[size];
      for(int i=0; i<size; i++){
         arr[i]=sc.nextInt();      
      }
   for(int i=0; i<size; i++){
      System.out.print(arr[i]+" ");
   }
}
}

FIND INDEX OF ELEMENT:

import java.util.*;
class First{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter size of array");
      int size = sc.nextInt();
      int arr[] = new int[size];
      for(int i=0; i<size; i++){
         arr[i] = sc.nextInt();
      }
      System.out.print("Your array is \n");
      for(int i=0; i<size; i++){
         System.out.print(arr[i]+" ");
      }
      System.out.println("Enter element to find:");
      int num = sc.nextInt();
      System.out.print("Your element is at index:");
      for(int i=0; i<size;i++){
         if(num==arr[i]){
            System.out.print(i);
         }

      }
   }
}

2D ARRAY:

import java.util.*;
class First{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Size of first of array");
      int size1 = sc.nextInt();
      System.out.print("Size of second of array");
      int size2 = sc.nextInt();

      int arr[][] = new int[size1][size2];

      System.out.print("Enter element of 2d array");
      for(int i=0; i<size1; i++){
      for(int j=0; j<size2; j++){
         arr[i][j]=sc.nextInt();      
      }
        
      }
      System.out.print("Your 2d array is:\n");
      for(int i=0; i<size1; i++){
         for(int j=0; j<size2; j++){
            System.out.print(arr[i][j]+" ");      
         }
           System.out.println();
         }
   }
}

FIND LOCATION OF ELEMENT IN MATRICES:

import java.util.*;
class First{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Size of first of array");
      int size1 = sc.nextInt();
      System.out.print("Size of second of array");
      int size2 = sc.nextInt();

      int arr[][] = new int[size1][size2];

      System.out.print("Enter element of 2d array");
      for(int i=0; i<size1; i++){
      for(int j=0; j<size2; j++){
         arr[i][j]=sc.nextInt();      
      }
        
      }
      System.out.print("Your 2d array is:\n");
      for(int i=0; i<size1; i++){
         for(int j=0; j<size2; j++){
            System.out.print(arr[i][j]+" ");      
         }
            System.out.println();
         }
         System.out.print("\nEnter element to find its location");
         int num = sc.nextInt();
         for(int i=0; i<size1; i++){
            for(int j=0; j<size2; j++){
               if(arr[i][j]==num){
                  System.out.println("Element found at"+ i + "," + j);   
               }    
               
            }
            
            }  
            
   }
}

CONCATINATION OF STRING:

import java.util.*;
class First{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      String name1 = sc.nextLine();
      String name2 = sc.nextLine();
      System.out.print(name1+" "+name2);
   }
}

FIND SUBSTRING:

import java.util.*;
class First{
   public static void main(String args[]){
      String name1 = "Aniket Gupta studying in NIET:";
      String name2 = name1.substring(0,name1.length());
      System.out.print(name2);
   }
}


// STRINGS ARE IMMUTABLE:

COMPARE TWO STRINGS:

import java.util.*;
class First{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      String name1 = sc.nextLine();
      String name2 = sc.nextLine();
      System.out.print(name1+" "+name2 + "\n");
      if(name1.compareTo(name2)==0){
         System.out.print("Strings are equall");
      }
      else{
         System.out.print("Strings are not equall");
      }
   }
}

PRINT CHARACTER:

class First{
   public static void main(String args[]){
      char name = '@';
      System.out.print(name);

   }
}

TO PRINT CHARACTER AT GIVEN INDEX IN STRING: 

class First{
   public static void main(String args[]){
      StringBuilder str = new StringBuilder("Aniket");
      System.out.println(str.charAt(4));
   }
}

TO SET THE ANOTHER ELEMENT ON GIVEN INDEX:

class First{
   public static void main(String args[]){
      StringBuilder str = new StringBuilder("Aniket");
      str.setCharAt(2,'e');
      System.out.println(str);

   }
}

INSERT ELEMENT AT ZERO INDEX:

class First{
   public static void main(String args[]){
      StringBuilder str = new StringBuilder("Aniket");
      str.insert(0,'a');
      System.out.println(str);

   }
}

DELET ELEMENT:

class First{
   public static void main(String args[]){
      StringBuilder str = new StringBuilder("Aniket");
      str.delete(0,1);
      System.out.println(str);

   }
}

TO ADD ELEMTNT AT LAST OF STRING:

class First{
   public static void main(String args[]){
      StringBuilder str = new StringBuilder("Aniket");
      str.append('T');
      System.out.println(str);

   }
}

REVERSE STRING:

class First{
   public static void main(String args[]){
      StringBuilder str = new StringBuilder("Aniket");
      for(int i=0; i<str.length()/2; i++){
         int front = i;
         int back = str.length() - 1- i ;

         char frontChar = str.charAt(front);
         char backChar = str.charAt(back);

         str.setCharAt(front,backChar);
         str.setCharAt(back,frontChar);
      }
      System.out.println(str);

   }
}
*/