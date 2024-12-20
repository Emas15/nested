import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int width = sc.nextInt();
        int length = sc.nextInt();

        for(int i = 1; i<=length; i++){
            for(int j = 1; j<=width; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
