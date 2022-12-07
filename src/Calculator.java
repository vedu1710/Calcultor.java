import java.sql.SQLOutput;
import java.util.*;
public class Calculator{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();

        System.out.println("Enter the value of b");
        int b = sc.nextInt();

        System.out.println("Enter the function");
        int Calculation = sc.nextInt();

        System.out.println("The calculation is:");
        switch(Calculation){
            case 1: System.out.println(a+b); break;
            case 2: System.out.println(a-b); break;
            case 3: System.out.println(a*b); break;
            case 4: System.out.println(a/b); break;
            default: System.out.println("This is invalid function");
        }

    }
}