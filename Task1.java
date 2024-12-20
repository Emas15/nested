import java.util.Scanner;
public class Task1{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int min = Integer.MAX_VALUE;
        int occ = 0;
        
        
        int total = sc.nextInt();



        for(int i = 1; i<=total; i++){
            
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            

            if(num>0 && num%2==0){
                if(num>max){
                    max=num;
                }
                if(num<min){
                    min= num;
                }
                occ++;


            }
      
        }
if(occ>0){
        int average =(max+min)/2;
     
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
        System.out.println("Average: "+average);
    }
    else{
        System.out.println("Max: "+0);
        System.out.println("Min: "+0);
        System.out.println("Average: "+0);

    }
}
}