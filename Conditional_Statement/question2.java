import java.util.Scanner;
public class question2 {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number");
        int num=sc.nextInt();
        if(num<0){
            System.out.println(" Number is nagative");
        }else if(num>0){
            System.out.println("Number is postive");
        }else{
            System.out.println("Number is Zero");
        }
    }
}
