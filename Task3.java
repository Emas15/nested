import java.util.Scanner;
public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int total = sc.nextInt();
        int neg = 0;
        int nonNeg = 0;

        for(int i = 1; i<=total; i++){
            System.out.print("Enter number "+i+": ");
            int num = sc.nextInt();

            if(num<0){
                neg++;
            }
            else if(num>=0){
                nonNeg++;
            }
        }

        System.out.println(nonNeg+ " Non-negative Numbers");
        System.out.println(neg+ " Negative Numbers");
    }
    
}
