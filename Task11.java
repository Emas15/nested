import java.util.Scanner;
public class Task11 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Start: ");
        int s = sc.nextInt();
        System.out.print("End: ");
        int e = sc.nextInt();

    System.out.println("Armstrong numbrers: ");
        for(int i = s; i<=e; i++){
           
            int temp = i;
            int sum =0;

            while(temp>0){
                int digit = temp%10;
             
                
                sum+= digit*digit*digit;
                temp/=10;

            
            }

            if(sum==i){
                System.out.println(i);
               }
         
         
          

                

            }
        }

        
    }
    

