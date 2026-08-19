import java.util.Scanner;
void main(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter length: ");
    int x=sc.nextInt();
    System.out.print("Enter width: ");
    int y=sc.nextInt();

    int area=x*y;
    System.out.println("Area= "+ area);

    int perimeter=2*(x+y);
    System.out.println("perimeter= "+perimeter);
}