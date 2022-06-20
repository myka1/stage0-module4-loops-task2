package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 0;
        if(multiplyByAndToInclusive == 0) {
            System.out.println("");
        } else if(multiplyByAndToInclusive > 0) {
            while (i <= multiplyByAndToInclusive) {
                System.out.println(i * multiplyByAndToInclusive);
                i++;
            }
        } else if(multiplyByAndToInclusive < 0) {
            int pos = Math.abs(multiplyByAndToInclusive);
            while (i >= multiplyByAndToInclusive) {
                System.out.println(i * pos);
                i--;
            }
        }
    }
    public static void main(String[] args) {
        Multiplication s = new Multiplication();
        s.printMultiplied(-5);
    }
}
