import java.util.Scanner;

public class GradingSystem{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int examScore, assesmentScore;
    boolean feesPaid;
    System.out.print("Enter your exam score: ");
    examScore = input.nextInt();
    System.out.print("Enter your assesmentScore: ");
    assesmentScore = input.nextInt();
    System.out.print("Have you paid your fees in full(true/false): ");
    feesPaid = input.nextBoolean();

    if(assesmentScore >=15 && examScore >= 25){
            if(feesPaid){
                System.out.println("Congratulations!!, you have received your Certificate");
            }else{
                System.out.println("You have not paid the fees in full");
            }
    }else if(examScore + assesmentScore >= 39){
            if(feesPaid){
                System.out.println("You have been condoned");
            }else{
                System.out.println("You have not paid your fees in full");
            }
    }else{
            if(assesmentScore < 15 && examScore >= 25){
                System.out.println("You have failed the assesment");
            }else if(examScore < 25 && assesmentScore >= 15){
                System.out.println("You have failed the exam");
            }else{
                System.out.println("You have to repeat the course");
            }
    }input.close();
}
}