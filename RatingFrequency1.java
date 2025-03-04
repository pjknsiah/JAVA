public class RatingFrequency1 {
    public static void main(String[] args){
        int[] grades = {1,2,5,4,3,5,2,1,3,3,1,4,3,2,5,3,4,5,3,1};

        int frequency[] = new int[6];
        for (int grade : grades){
            frequency[grade]++;
        }
        for (int i = 1; i < 6; i++){
            System.out.println("Grade " + i + " occurs " + frequency[i] + " times");
        }
    }
}