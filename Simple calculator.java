import java.util.Scanner;
class Student{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=obj.nextInt();
        System.out.println("Enter second number: ");
        int num2=obj.nextInt();
        System.out.println("Enter operation to be performed: ");
        System.out.println("1 : Addition ");
        System.out.println("2 : Subtraction ");
        System.out.println("3 : Multiplication ");
        System.out.println("4 : Division ");
        int in=obj.nextInt();

        switch (in) {
            case 1:
                System.out.println("The sum of the two numbers is: "+(num1+num2));
                break;
            case 2:
                System.out.println("The difference of the two numbers is: "+(num1-num2)); 
                break;
            case 3:
                System.out.println("The product of the two numbers is: "+(num1*num2));
                break;
            case 4:
                if(num2==0){
                    System.out.println("Cannot be divided");
                    break;
                }
                else{
                    System.out.println("The division of the two numbers is: "+(num1/num2));
                    break;
                }
            default:
                break;
        }
    }
}