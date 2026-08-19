import java.util.Scanner;
void main(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Student Marks =>");
    System.out.print("Bengali: ");
    int Bengali=sc.nextInt();
    System.out.print("English: ");
    int English=sc.nextInt();
    System.out.print("Math: ");
    int Math=sc.nextInt();
    System.out.print("Science: ");
    int Science=sc.nextInt();
    System.out.print("Arts: ");
    int Arts=sc.nextInt();

    int Total= (Bengali+English+Math+Science+Arts);
    double Persentage=((double)Total/500.0)*100;

    System.out.println("Student Marks= "+Total);
    System.out.println("Student Persentage= "+Persentage+"%");
}