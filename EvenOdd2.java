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
        System.out.print("The product of the leading diagonal of the even array is: ");
        productOfLeadingDiagonal(even);

        System.out.print("The product of the leading diagonal of the odd array is: ");
        productOfLeadingDiagonal(odd);
    }
    public static void productOfLeadingDiagonal(int[][] array){
        int product = 1;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (i == j){
                    product *= array[i][j];
                }
            }
        }
        System.out.println(product);
    }
}