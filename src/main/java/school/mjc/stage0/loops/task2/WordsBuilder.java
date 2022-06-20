package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int i = 0;
        String phrase = "";
        while (i < chars.length){
            String temp = Character.toString(chars[i]);
            System.out.print(phrase.concat(temp));
            i++;
        }
        
    }
}
