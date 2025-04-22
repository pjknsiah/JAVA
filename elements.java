import java.util.Scanner;
public class elements {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int[][] even= new int[3][3];
        int[][] odd=new int[3][3];
        int evenindex=0;
        int oddindex=0;
        //taking input into the 2 dimensional array
        for(int i=0; i<18; i++){
            System.out.println("Enter values from 1 to 18");
            int value=input.nextInt();
            if(value%2==0){
                if(evenindex<3){
                    even[0][evenindex]=value;
                    evenindex+=1;
                }else if(evenindex<6){
                    even[1][evenindex-3]=value;
                    evenindex+=1;
                }else{
                    even[2][evenindex-6]=value;
                    evenindex+=1;
                }
            }else{
                if(oddindex<3){
                    odd[0][oddindex]=value;
                    oddindex+=1;
                }else if(oddindex<6){
                    odd[1][oddindex-3]=value;
                    oddindex+=1;
                }else{
                    odd[2][oddindex-6]=value;
                    oddindex+=1;
                }
            }
        }
        //finding the product of the leading diagonal of the even array
        
        /*int[][] even={
            {2,4,6},
            {8,10,12},
            {14,16,18}
        };
        int[][] odd={
            {1,3,5},
            {7,9,11},
            {13,15,17}
        };
        */


        int productleading=1;
        int productleading1=1;
        for(int i=0; i<3; i++){
            productleading*=even[i][i];
            productleading1*=odd[i][i];
        }
        System.out.println("The product of the leading diagonals in the even matrix is "+ productleading);
        System.out.println("The product of the leading diagonals in the odd matrix is "+ productleading1);

        //finding the product of the trailing diagonals
        int producttrailing=even[2][0]*even[1][1]*even[0][2];
        int producttrailing1=odd[2][0]*odd[1][1]*odd[0][2];
        System.out.println("The product of the trailing diagonals in the even matrix is "+ producttrailing);
        System.out.println("The product of the trailing diagonals in the odd matrix is "+ producttrailing1);
        int difference=producttrailing-productleading;
        int difference1=producttrailing1-productleading1;
        System.out.println("the difference between the leading and trailing diagonals in the even matrix is "+ difference);
        System.out.println("the difference between the leading and trailing diagonals in the odd matrix is "+ difference1);
        int totaldifference=producttrailing1-producttrailing;
        System.out.println("the difference between the products of the trailing diagonals in  odd matrix and the trailing diagonals in the even matrix is "+totaldifference);
    }
}