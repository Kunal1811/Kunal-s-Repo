import java.util.Scanner;

public class PreWorkFinalAssignment{

Scanner sc = new Scanner(System.in);

           //function to checkPalindrome

       public void checkPalindrome()  {
            System.out.print("Enter Number To Be Checked: ");
            int num = sc.nextInt();

            int org = num;
            int sum = 0;
            int rem = 0;
            
            while(num>0){
                  rem = num%10;
                  sum = rem + (sum*10);
                  num = num/10;
            }
            if(sum==org)
            System.out.println("Number Is Palinrome. ");
            else 
            System.out.println("Number Is NOT Palinrome. ");
      }

 

            //function to printPattern

       public void printPattern() {
            System.out.print("Enter The Number Of Levels You Want: ");
            int num = sc.nextInt();

            for(int i=num;i>0;i--){
                  for(int j=i;j>0;j--){
                        System.out.print("*");
                  }
                  System.out.println("");
            }
      }

 

          //function to check no is prime or not

        public void checkPrimeNumber() {
            System.out.print("Enter The Number To Be Checked: ");
            int num = sc.nextInt();

            int count=0;
            for(int i=1;i<num;i++){
                  if(num%i==0){
                        count++;
                  }
            }
            if(count>1){
                  System.out.println("Number Is Composite. ");
            }
            else{
                  System.out.println("Number Is Prime. ");
            }
        }

         

          // function to print Fibonacci Series

          public void printFibonacciSeries() {

                //initialize the first and second value as 0,1 respectively.

           int first = 0, second = 1;

           System.out.print("Enter The Number Of Outputs In Fibonacci Series: ");
           int num = sc.nextInt();

           int sum=1;
           System.out.print(first +" "+second +" ");
           for(int i=0;i<num-2;i++){
                  System.out.print(sum +" ");
                  first=second;
                  second=sum;
                  sum=first+second;
           }

          }

 

//main method which contains switch and do while loop

      public static void main(String[] args) {

                PreWorkFinalAssignment obj = new PreWorkFinalAssignment();

                int choice;

                Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

 

choice = sc.nextInt();

switch (choice) {

 

case 0:

choice = 0;

break;

 

case 1: {

obj.checkPalindrome();

}

break;

 

case 2: {

 

obj.printPattern();

}

break;

 

case 3: {

obj.checkPrimeNumber();

}

break;

 

case 4: {

 

obj.printFibonacciSeries();

}

break;

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}

 

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}

 

}