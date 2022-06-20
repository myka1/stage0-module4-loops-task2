package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 1;
        while(i <= printToInclusive) {
            int j = i;
            int n = 0;
            while(j >= 1) {
                if(i % j == 0){
                    n++;
                }
                j--;
            }
            if(n == 2){
                System.out.println(i);
            }
            i++;
        }
    }
}
