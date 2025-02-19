/*  Name: Nsiah Paul Junior Kwabena
    Reference Number: 20993527
    Index Number: 9029923 */

import java.util.Scanner;

public class GradingSystem2{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
      System.out.println("Enter the number of students: ");
      int studentNumber = input.nextInt();
      System.out.println("Enter the following; Exam, Assessment, Fees.");
      int Exam[] = new int [studentNumber];
      int Assessment[] = new int [studentNumber];
      int Fees[] = new int [studentNumber];
      int i = 0;

      while(i < studentNumber){
        System.out.println("Student " + (i+1));
        Exam[i] = input.nextInt();
        if(Exam[i] == -1){
          break;
        }
        Assessment[i] = input.nextInt();
        Fees[i] = input.nextInt();
        i++;
      }

      /*for (i = 0; i < NoS; i++){
        System.out.println((Exam[i]) +", " + (Assessment[i]) + ", " + (Fees[i]));            
      } */

      for (i = 0; i < studentNumber; i++){
        System.out.println("For Student " + (i+1));
        if (Exam[i] >= 25 && Assessment[i] >= 15){
            System.out.println("Requirement 1 & 2 satisfied");
            if(Fees[i]==100){
              System.out.println("You are entitled to a certificate");
            }else{
              System.out.println("But there are arrears to settle");
            }
        }else if((Exam[i] + Assessment[i])==39){
            if((Exam[i] == 25 && Assessment[i] == 14) || (Exam[i] == 24 && Assessment[i] == 15)){
              System.out.println("You are condoned.");
              if(Fees[i]==100){
                System.out.println("You are entitled to a certificate");
              }else{
                System.out.println("But there are arrears to settle");
              }
            }
        }else if(Exam[i] < 25 && Assessment[i] >= 15){
            if(Fees[i] == 100){
              System.out.println("Your exam score is not satisfactory for a certificate.");
              System.out.println("You have to repeat.");
            }
        }else if(Exam[i] >= 25 && Assessment[i] < 15){
          System.out.println("Your Assessment is not satisfactory for a certificate.");
          System.out.println("You have to repeat.");
        }else{
          System.out.println("You have to REPEAT");
        
    }
}
input.close();
}
}