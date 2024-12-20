import java.util.Scanner;
public class Task4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
     

        for (int i =2; count<num;i++) {

            int divCount = 0;
            

            for(int j = 1; j<=i; j++){
                if(i%j==0){
                    divCount++;
            
            }
        }
            if(divCount==2){
                count++;

                if(count==num){
                System.out.print(i);
            }
            else{
                System.out.print(i+", ");
            }
         
        }

       
    }
    
}
}
