import java.util.Scanner;

public class RatingFrequency2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] grades = new int [20];
        
        System.out.println("Enter 20 Grades!!"); 
        for(int i = 0; i < 20; i++){
            grades[i] = input.nextInt();
        }input.close();

        int[] frequency = new int[6];
        for (int grade : grades){
            frequency[grade]++;
        }
        for (int i = 1; i < 6; i++){
            System.out.println("Grade " + i + " occurs " + frequency[i] + " times");
        }

    }
}