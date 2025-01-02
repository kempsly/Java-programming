import java.util.Random;

public class RandomNumberGeneration {
    public static void main(String[] args){
        Random random = new Random();
        int myRandomNum = random.nextInt(5, 20);

        System.out.println("Random numerb is : " + myRandomNum);
    }
}
