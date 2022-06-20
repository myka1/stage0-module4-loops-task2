package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if(power < 0){
            System.out.println("too much power");
        } else {
            int i = 0;
            while(i <= power){
                double sum = Math.pow(2, i);
                int newSum = (int) sum;
                System.out.println(newSum);
                i++;
            }
        }
    }
}
