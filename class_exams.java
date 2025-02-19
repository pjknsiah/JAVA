import java.util.Scanner;

public class class_exams {

    public static int n;

	public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        while(true) {
        	
        System.out.print("Enter the number of students: ");
        n = input.nextInt();
        input.nextLine();
        if(n>=0) {
        	break;
        }else
        {
        	System.out.println("Enter a valid value for the number of students!");
        };
    };
        // Arrays to hold student information
        String[] Id = new String[n];
        double[] midsem = new double[n];
        double[] exam = new double[n];
        double[] total = new double[n];
        String [] remarks=new String[n];
        char []grade= new char[n];
        String[]cert=new String[n];
        double [] fees=new double[n];
        boolean[]rec=new boolean[n];
        
        int a=0;
        		while (a<n)
        		{
            System.out.println("\nEnter details for Student " + (a + 1));
            
            System.out.print("ID: ");
            Id[a] = input.nextLine();
        
            while (true) {
                System.out.print("Midsem Score (0-30): ");
                midsem[a] = input.nextDouble();
                if (midsem[a] >= 0 && midsem[a] <= 30) {
                    break;
                } else {
                    System.out.println("Invalid midsem score! Please enter a value from 0 to 30.");
                }
            }
            
            while (true) {
                System.out.print("Exam Score (0-70): ");
                exam[a] = input.nextDouble();
                if (exam[a] >= 0 && exam[a] <= 70) {
                    break;
                } else {
                    System.out.println("Invalid exam score! Please enter a value between 0 and 70.");
                }
            }
            while(true) {
            	System.out.println("Enter the percentage of school fees paid: ");
            	fees[a]=input.nextDouble();
            	if(fees[a]==100) {
            		cert[a]="Rewarded";
            		rec[a]=true;
            		break;
            	}else if((fees[a]<100)&&!(fees[a]<0)) {
            		cert[a]="false";
            		rec[a]=false;
            	break;
            	}else {System.out.println("enter a valid fees percentage!");}
            }
           
            total[a] = midsem[a] + exam[a];
            input.nextLine();
            if(((midsem[a]==15)&&(exam[a]==24))||((midsem[a]==14)&&(exam[a]==25))){
            	
            	remarks[a]="Condoned";
            	grade[a]=' ';
            }
            else if(total[a]<40) {
                           
            	remarks[a]="Trail";
            	grade[a]='F';
            	}
            else if((total[a]>=40)&&(total[a]<50)) {
            	remarks[a]="Pass";
            	grade[a]='D';
            	
            }
            else if((total[a]>=50)&&(total[a]<60))
            {
            	remarks[a]="Good";
            	grade[a]='C';
            }
            else if((total[a]>=60)&&(total[a]<70))
            { remarks[a]="Very Good";
            grade[a]='B';
            }
            else {
            	remarks[a]="Excellent";
            	grade[a]='A';
            };
            
            a++;
            
        }
        
        // Close scanner to avoid resource leak
        input.close();
        
        // Optionally, display all students' data
        System.out.println("\n--- All Students' Data ---");
        System.out.println("ID\tMidsem\tExam\tTotal\tGrade\tRemarks\tCertificate");
        for (int v = 0; v < n; v++) {
        	if(rec[v]==true) {
            System.out.println(Id[v] + "\t" + midsem[v] + "\t" + exam[v] + "\t" + total[v]  + "\t" + grade[v]+"\t" + remarks[v]+"\t"+cert[v]);
        }
        	else {
        		System.out.println(Id[v]+"\t"+"Withheld or Fail due to school fees payment Status");
        	}
        	
        }
    }
}

