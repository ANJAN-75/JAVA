import java.util.Scanner;
public class question4 {
    void main(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number");
        int num1=sc.nextInt();
        System.out.print("enter second number");
        int num2=sc.nextInt();
        if(num1==num2){
            System.out.println("Both number are equal");
        }else if(num1>num2){
            System.out.println("Num1 are bigger");
        }
        else{
            System.out.println("Num2 are bigger");

        }


    }
}
