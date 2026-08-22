
import java.util.Scanner;

public class Question3 {
    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter your Second number: ");
        int num2 = sc.nextInt();

        
        for(int i=num1;i<=num2;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count+=1;
                }
            }
            if(i==1){
                System.out.println(i +" its not a prime");
            }
            else if(count>2){
                System.out.println(i+" its not a prime number");
            }else{
                System.out.println(i+" its a prime number");
            }
        }

    }

}
