public class John{
    public static void main(String[] args) {
        
    try {

        int myInt = Integer.parseInt("1");
    } catch (NumberFormatException nfe) {

        System.out.println("NO integer in string");
    }
    finally{
        System.out.println("End here");
    }
    }
}