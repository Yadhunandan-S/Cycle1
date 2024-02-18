    *

   * *

  *   *

 *     *

*********
import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int out_sp=n-1;
        int inner_sp=1;
        for (int i = 1; i <= 2*n-1; i++) {
            if(i%2==0)
            {
                System.out.println();
                continue;
            }
            if(i==1)
            {
                for (int j = 1; j <= out_sp; j++) {
                    System.out.print(' ');
                }
                System.out.print('*');
                out_sp--;
                System.out.println();
                continue;
            }
            if(i==2*n-1)
            {
                for (int j = 1; j <= 2*n-1; j++) {
                    System.out.print('*');
                }
            }
            else
            {
                for (int j = 1; j <= out_sp; j++) {
                    System.out.print(' ');
                }
                System.out.print('*');
                for (int j = 1; j <= inner_sp; j++) {
                    System.out.print(' ');
                }
                System.out.print('*');
                inner_sp+=2;
                System.out.println();
            }
            
            out_sp-=1;
        }
    }
}
