import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input scores for exam and assessment
        System.out.print("Enter exam score (out of 40): ");
        int examScore = scanner.nextInt();

        System.out.print("Enter assessment score (out of 20): ");
        int assessmentScore = scanner.nextInt();

        // Input fee payment status
        System.out.print("Has the student paid the fees in full? (true/false): ");
        boolean feesPaid = scanner.nextBoolean();

        // Check requirements
        boolean passedExam = examScore >= 25;
        boolean passedAssessment = assessmentScore >= 15;
        int totalScore = examScore + assessmentScore;
        boolean isCondoned = totalScore == 39;

        // Determine the result
        if ((passedExam && passedAssessment) || isCondoned) {
            if (feesPaid) {
                System.out.println("Congratulations! The student is issued a certificate.");
            } else {
                System.out.println("The student has passed but cannot be issued a certificate due to unpaid fees.");
            }
        } else {
            System.out.println("The student has failed.");

            // Inform which component(s) the student passed/failed
            if (!passedExam) {
                System.out.println("The student failed the exam.");
            }
            if (!passedAssessment) {
                System.out.println("The student failed the assessment.");
            }

            // Check if the student failed both components
            if (!passedExam && !passedAssessment) {
                System.out.println("The student must repeat the course.");
            }
        }

        scanner.close();
    }
}