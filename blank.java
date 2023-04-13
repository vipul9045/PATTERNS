import java.util.Scanner;

public class RectangularStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
    outerloop :    for ( int i = 1 ; i <= r ; i++){
        innerloop : for ( int j = 1 ; j <= c ; j++ ){
            if ( i == 1 || i == r  || j == 1 || j == c){
                System.out.print("*");

            }
            else{
                System.out.print(" ");
            }
            
        }
        System.out.println();
      }
    }
}
