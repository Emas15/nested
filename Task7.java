import java.util.Scanner;;
public class Task7 {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        int testCase = sc.nextInt();

        for(int i =1; i<=testCase; i++){

            int X = sc.nextInt();
            int Y = sc.nextInt();
            int count = 1;
            int sum = 0;

            for(int j = X; count<=Y; j++){

                if(j%2!=0){
                    sum+=j;
                    count++;
                }
            }
            System.out.println(sum);
        }
    }
    
}
