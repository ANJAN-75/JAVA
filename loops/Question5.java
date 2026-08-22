import java.util.Scanner;
public class Question5 {
    void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        int storeNum=num;
        int storeNum2=num;
        int nextnum=0;
        int count=0;
        while(num>0){
            int lastnum=num%10;
            num=num/10;
            count+=1;
            
        }
        while(storeNum2>0){
            int lastnum=storeNum2%10;
            storeNum2=storeNum2/10;
            int power=1;
            for(int i=1;i<=count;i++){
                
                power*=lastnum;
                
            }
            nextnum+=power;
        }
        if(storeNum==nextnum){
            System.out.println("it is amstrong number");
        }
        else{
            System.out.println("its not a amstrong number");
        }
    }
}
