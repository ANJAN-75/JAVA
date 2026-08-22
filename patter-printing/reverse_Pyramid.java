// *********
//  *******
//   *****
//    ***
//     *
public class reverse_Pyramid {
    void main(){
        int num=4;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=(2*num-i-(i-1));k++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
        
}
