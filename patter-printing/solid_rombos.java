// - - - - *****
// - - - *****
// - - *****
// - *****
// *****

public class solid_rombos {
    void main(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=(5+(5-i));j++){
                if(j<=(5-i)){
                    System.out.print("_");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println(" ");
        }
        
    }
}


//cleaner version code
// public class SolidRhombus {
//     public static void main(String[] args) {

//         for (int i = 1; i <= 5; i++) {

//             for (int j = 1; j <= 5 - i; j++) {
//                 System.out.print("_ ");
//             }

//             for (int j = 1; j <= 5; j++) {
//                 System.out.print("* ");
//             }

//             System.out.println();
//         }
//     }
// }