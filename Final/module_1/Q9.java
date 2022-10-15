import java.util.Scanner;

// print this dimond pattern:
                    //       *   
                    //      *  *
                    //    *   *  *
	                //    *  *  *  * 
                    //     *   *  *
                    //       *   *
                    //          *	


public class Q9 {
    public static void main(String[] args) {
        System.out.print("Enter the number of Maximum number of diamond in the row: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
