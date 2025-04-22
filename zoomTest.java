import java.util.Scanner;

public class zoomTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] grades = new int[20];
        
        System.out.println("Enter 20 Grades (1-5)!"); 
        
        for(int i = 0; i < 20; i++) {
            try {
                System.out.print("Grade " + (i+1) + ": ");
                String userInput = input.next();
                int grade = Integer.parseInt(userInput);
                
                int[] testArray = new int[6];
                testArray[grade] = 1;
                
                grades[i] = grade;
            } 
            catch (NumberFormatException e) {
                System.out.println("Please enter a number!");
                i--;
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Grade must be between 1 and 5!");
                i--;
            }
        }
        input.close();

        int[] frequency = new int[6];
        try {
            for (int grade : grades) {
                frequency[grade]++;
            }
            
            for (int i = 1; i < 6; i++) {
                System.out.println("Grade " + i + " occurs " + frequency[i] + " times");
            }
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid grade found in array!");
        }
    }
}