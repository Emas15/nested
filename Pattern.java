
public class Pattern {

    public static void main(String[] args) {
        
        for(int i = 4; i>=1; i--){

            for(int j=1; j<=(4-i); j++){
                System.out.print(" ");
            }

            for(int k =1; k<=i; k++){
                System.out.print(k);
            }
            System.out.println();
            
        }

    }
    
}