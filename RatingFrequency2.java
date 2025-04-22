import java.util.InputMismatchException;
import java.util.Scanner;

public class RatingFrequency2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] grades = new int [20];
        
        System.out.println("Enter 20 Grades!!"); 
        for(int i = 0; i < 20; i++){
            while(true){
                try {
                    System.out.print("Grade " + (i + 1) + ": ");
                    grades[i] = input.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid Input, please enter an Integer");
                    input.nextLine();
                    break;
                }
            }
        }input.close();

        int[] frequency = new int[6];
        for (int grade : grades){
            try {
                frequency[grade]++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid Grade " + grade + " detected");
            }
        }
        for (int i = 1; i < 6; i++){
            System.out.println("Grade " + i + " occurs " + frequency[i] + " times");
        }

    }
}