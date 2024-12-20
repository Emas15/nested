import java.util.Scanner;
public class Task9 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int total  = sc.nextInt();

        for(int i = 1; i<=total; i++){

            for(int j=1; j<=(total-i); j++){
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
    
}
