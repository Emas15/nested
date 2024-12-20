import java.util.Scanner;
public class Task5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("The value of N: ");
        int n = sc.nextInt();
        int y = 0;

        for(int i = 1; i<=n; i++){

            for (int j=1; j<=i; j++){
                y += j;
            }
        }

        System.out.print("The value of y: "+y);
    }
    
}
