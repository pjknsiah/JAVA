import java.util.Scanner;
public class Melchi{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 20 nos");
        int Nos[] = new int [20];
        for(int i = 0; i < Nos.length; i++){
            Nos[i] = input.nextInt();
        }

        int k[][] = new int [3][3];
       
        System.out.println("Enter the values ");
        for(int i = 0; i < k.length; i++){
            if(Nos[i]%2==0){
                for(int j = 0; j < k[i].length; j++){
                    k[i][j] = Nos[i];
                }                           
            }
        }

        for(int i = 0; i < k.length; i++){
            for(int j = 0; j < k[i].length; j++){   
                System.out.print(k[i][j] + " ");
            }
            System.out.println();
        }
    }
}