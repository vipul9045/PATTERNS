import java.util.Scanner;

public class triangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of row");
        int r = sc.nextInt();
        outerloop : for ( int i = 1 ; i <= r ; i++){
            innerloop : for ( int j = 1 ; j <= i ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
