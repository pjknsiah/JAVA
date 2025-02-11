import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get student details
        System.out.print("Enter exam score: ");
        int examScore = scanner.nextInt();
        
        System.out.print("Enter assessment score: ");
        int assessmentScore = scanner.nextInt();
        
        System.out.print("Enter amount paid in fees: ");
        int feesPaid = scanner.nextInt();
        
        // Define passing criteria
        boolean passedExam = examScore >= 25;
        boolean passedAssessment = assessmentScore >= 15;
        boolean condoned = (examScore + assessmentScore) == 39;
        boolean feesPaidInFull = feesPaid >= 100;
        
        // Check if student passed
        if ((passedExam && passedAssessment)) {
            if (feesPaidInFull) {
                System.out.println("You have paid your fees in full and will receive a certificate.");
            } else {
                System.out.println("You did not pay the full fees, so no certificate will be issued.");
            }
        }
        if(condoned){
            if (feesPaidInFull) {
                System.out.println("You have paid your fees in full and will receive a certificate.");
            } else {
                System.out.println("You did not pay the fees in full.");
            }
        }
        else {
            System.out.println("You have failed.");
            
            if (!passedExam) {
                System.out.println("You failed the exam.");
            }
            if (!passedAssessment) {
                System.out.println("You failed the assessment.");
            }
            
            if (!passedExam && !passedAssessment) {
                System.out.println("You are required to repeat.");
            }
        }
        
        scanner.close();
    }
}
