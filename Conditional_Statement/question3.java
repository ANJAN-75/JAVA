import java.util.Scanner;

public class question3 {
    void main(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println("its a even number");
        }else{
            System.out.println("it is a odd number");
        }
    }
}
