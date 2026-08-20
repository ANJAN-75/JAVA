import java.util.Scanner;
public class question1 {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("you are elegible for voting");
        }else{
            System.out.println("You are not eligible for voting");
        }

    }
}
