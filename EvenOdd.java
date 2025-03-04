import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] even = new int[3][3];
        int[][] odd = new int[3][3];
        System.out.println("Enter the first 18 natural numbers: ");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                int num = input.nextInt();
                
                if (i % 2 == 0){
                    even[i][j] = num;
                }else{
                    odd[i][j] = num;
                }
            }
        }input.close();
        System.out.println("Odd Numbers Array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(odd[i][j] + " ");
            }}
    }
}