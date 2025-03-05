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
        System.out.println("The product of the leading diagonal of the even array is: " + evenPOLD);

        int oddPOLD = productOfLeadingDiagonal(odd);
        System.out.println("The product of the leading diagonal of the odd array is: " + oddPOLD);

        int evenPOTD = productOfTrailingDiagonal(even);
        int oddPOTD = productOfTrailingDiagonal(odd);
        
        System.out.println("The difference of the product of the trailing and leading diagonals of the even array is: " + (evenPOTD - evenPOLD));
        System.out.println("The difference of the product of the trailing and leading diagonals of the odd array is: " + (oddPOTD - oddPOLD));
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
}