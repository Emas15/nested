import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Start: ");
        int s = sc.nextInt();
        System.out.print("End: ");
        int e = sc.nextInt();

        System.out.println("Perfect Numbers: ");
        for(int i=s; i<=e; i++){
            int sum = 0;

            int temp  = i;

            for(int j=1; j<temp; j++){
                if(temp%j==0){
                    sum+=j;
                }
            }
            if (sum==i){
                System.out.println(i);
            }
        }
        
       
     
       }
            
        }
    
