import java.util.Scanner;;
public class Task6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        

       

        while(true){

            System.out.print("Enter Number: ");
            int num = sc.nextInt();
            int divCount = 0;
         
            if(num%2!=0){
                break;
            }

            

            for(int j=1; j<=num;j++){
                

                
               if(num%j==0){
                    divCount++;
                   

                }


            }
            System.out.println(num + " has " + divCount + " divisors");

        }
        
       
    }

}
