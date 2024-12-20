import java.util.Scanner;
public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            if(num<0){
                break;
            }
            int sq = num*num;
            System.out.println(num+"^"+num+" = "+ sq);
        }
    }
    
}
