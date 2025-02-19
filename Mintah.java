import java.util.Scanner;

public class Mintah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int examScore,assessmentScore,feePaid;
        // Get student scores and fee status
        System.out.print("Enter exam score: ");
        examScore = input.nextInt();
        
        System.out.print("Enter assessment score: ");
        assessmentScore = input.nextInt();
        
        System.out.print("Enter amount paid (should be 100 for full payment): ");
        feePaid = input.nextInt();
        
        boolean condoned = (examScore == 24 && assessmentScore == 15) || (examScore == 25 && assessmentScore == 14);
        
        System.out.println("\nGrading Result:");
        
        if (examScore>=25) {
            System.out.println("Exam Passed");
        } else {
            System.out.println("Exam Failed");
        }
        // i think this part of the program is not neccesary
        if (assessmentScore >= 15) {
            System.out.println("Assessment Passed");
        } else {
            System.out.println("Assessment Failed");
        }
        
        if (examScore>=25 && assessmentScore >= 15) {
            System.out.println("Passed overall");
        } else if (condoned) {
            System.out.println("Condoned");
        } else {
            System.out.println("Failed overall");
        }
        
        if ((examScore>=25 && assessmentScore >= 15) || condoned) {
            if (feePaid == 100) {
                System.out.println("Certificate Issued!");
            } else {
                System.out.println("Certificate not issued: Fees not fully paid.");
            }
        } else {
            System.out.println("Student must repeat.");
        }
        
        input.close();
    }
}