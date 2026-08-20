import java.util.Scanner;
public class Question2 {
    void main(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your number");
        int num=sc.nextInt();

        int reverse=0;
        int actualNum=num;
        while(num>0){
            reverse*=10;
            int lastnumber=num%10;
            reverse+=lastnumber;
            num=num/10;
        }
        System.out.println(reverse);

        if(actualNum==reverse){
            System.out.println("this "+actualNum+" is a palaindrome");
        }else{
            System.out.println("its not a palendrome");
        }
    }
}
