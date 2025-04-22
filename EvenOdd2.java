public class EvenOdd2{
    public static void main(String[] args){
        int[][] even = new int[3][3];
        int[][] odd = new int[3][3];
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
  
        int evenIndex = 0, oddIndex = 0;
        for (int number : numbers){
            if (number % 2 == 0){
                even[evenIndex / 3][evenIndex % 3] = number;
                evenIndex++;
            }else{
                odd[oddIndex / 3][oddIndex % 3] = number;
                oddIndex++;
            }
        }
        int evenPOLD = productOfLeadingDiagonal(even);
        int oddPOLD = productOfLeadingDiagonal(odd);
        int evenPOTD = productOfTrailingDiagonal(even);
        int oddPOTD = productOfTrailingDiagonal(odd);
        
        printMatrix(odd);
        printMatrix(even);

        System.out.println("The product of the leading diagonal of the even array is: " + evenPOLD);
        System.out.println("The product of the leading diagonal of the odd array is: " + oddPOLD);

        System.out.println("\nThe difference of the products of the trailing and leading diagonals of the even array is: " + (evenPOTD - evenPOLD));
        System.out.println("The difference of the products of the trailing and leading diagonals of the odd array is: " + (oddPOTD - oddPOLD));

        System.out.println("\nThe difference between the products of the trailing diagonals of the odd and even arrays is: " + (oddPOTD - evenPOTD));
    }
    public static int productOfLeadingDiagonal(int[][] array){
        int product = 1;
        for (int i = 0; i < 3; i++){
            product *= array[i][i];
        }
        return product;
    }
    public static int productOfTrailingDiagonal(int[][] array){
        int product = 1;
        for (int i = 2; i >=0; i--){
            product *= array[i][2 - i];
        }
        return product;
    }
    public static void printMatrix(int[][] array){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}