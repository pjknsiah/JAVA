public class RatingFrequency1 {
    public static void main(String[] args){
        int[] grades = {1,2,5,4,3,5,2,1,3,3,1,4,3,2,5,3,4,5,3,1,17};
        
        int frequency[] = new int[5];
        for (int grade : grades){
            try {
                frequency[grade - 1]++;
             } catch (ArrayIndexOutOfBoundsException e) {
                 System.out.println("Error: Invalid grade found in array! " + e.getMessage());
             }
        }
        for (int i = 1; i < 6; i++){
            System.out.println("Grade " + i + " occurs " + frequency[i -1] + " times");
        }
    }
}