import java.util.Scanner;

public class Esmund {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("If you want to exit the program enter -1");
            System.out.print("\nPlease enter your exam score: ");
            int exam = scanner.nextInt();
            if (exam == -1) {
                System.out.println("Thank you for your time, you have exited the program");
                break;
            }

            System.out.print("Please enter your assessment score: ");
            int assessment = scanner.nextInt();

            System.out.print("Please enter the amount of school fees you've paid (100 means full payment):");
            int feePaid = scanner.nextInt();

            int totalScore = exam + assessment;

            if ((exam >= 25 && assessment >= 15) || (exam == 24 || assessment == 15) || (exam == 25 || assessment == 14)) {
                if (feePaid == 100) {
                    System.out.println(" Yo have passed, here is your certificate.");
                } else {
                    System.out.println(" You have passed but ypu have not paid your fees in full.\nYou will not be given the a certificate until you have paid in full");
                }
            } else {
                System.out.println(" I'm sorry, but you have faiked");
                if (!(exam >= 25 && !(assessment >= 15))) {
                    System.out.println("You have failed both components. You will have repeat this course.");
                } else if (!(exam >= 25)) {
                    System.out.println("You have failed the exams but you passed the assessment.");
                } else {
                    System.out.println("You have failed the assessment but you passed the exam.");
                }
            }

            char grade;

            if(totalScore >= 70){
             grade = 'A';
            }
            else
            switch (totalScore) {
                case 70: grade = 'A'; 
                break;
                case 60: grade = 'B'; 
                break;
                case 50: grade = 'C'; 
                break;
                case 40: grade = 'D'; 
                break;
                default: grade = 'F';  
                break;
            }
            System.out.println("Your grade is : " + grade);
        }

        scanner.close();
    }
}




// Name: Esmund Delanyo Tsegah
// Index number: 9046023
// Student ID: 20968073