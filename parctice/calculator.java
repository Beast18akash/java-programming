import java.util.*;

public class calculator {


    public static int add(int a, int b){
     return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int mult(int a, int b){
        return a*b;
    }
    public static int div(int a,int b){
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
    int choice;
int num1,num2,result;


do{
    System.out.println("\n-----calculator menu-----");
    System.out.println("1 : Addition");
    System.out.println("2 : subtraction");
    System.out.println("3 : multiplication");
    System.out.println("4 : division");
    System.out.println("5 : exit");
    System.out.println(" enter your choice ");
  choice = sc.nextInt();

  if (choice >=1 && choice <=4){
    System.out.println("enter the firstnumber");
    num1 = sc.nextInt();
    System.out.println("enter your secondnumber");
    num2 = sc.nextInt();



    switch (choice) {
        case 1:
        result =add(num2, num1);
            System.out.println("Result:" + result);
            break;
    case 2:
    result =sub(num1, num2);
            System.out.println("Result:" + result);
            break;

            case 3:
            result =mult(num1, num2);
            System.out.println("Result:" + result);
            break;
            case 4:
            result =div(num1, num2);
            System.out.println("Result:" + result);
            break;
    }
}
     else if (choice >=5){
                System.out.println("Invalid choice");
            }

  } while(choice !=5); {
     System.out.println("calculator is closed try it later");

     sc.close();
  }
}
    }

