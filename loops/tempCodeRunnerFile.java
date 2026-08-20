import java.util.Scanner;
public class question1{
    void main(){
        System.out.println("Enter your number");
        Scanner sc=new Scanner(System.in);

        int number=sc.nextInt();
        int reverse=0;

        while(number>0){
            reverse*=10;
            int lastnum=number%10;
            reverse+=lastnum;
            number=number/10;
        }
        System.out.println("reverse number= "+reverse);

    }

}