import java.util.HashMap;
import java.util.Random;

class WordGame {
    public HashMap<String, String> wordsWithTranslation;
    public HashMap<String, Integer> score;
    public String [] words = {"Hello","Good","Time"};
Random random=new Random();
    public boolean check(String word, String translationToCheck) {
        String rightTranslation = wordsWithTranslation.get(word);
        return rightTranslation.equals(translationToCheck);

    }

    public String nextWord() {
        int index =random.nextInt(words.length);
        return words[index];


    }
        public WordGame(){
            this.wordsWithTranslation=new HashMap<>();
            this.wordsWithTranslation.put("Hello","Привет");
            this.wordsWithTranslation.put("Good","Хорошо");
            this.wordsWithTranslation.put("Time","Время");
            this.wordsWithTranslation.put("Russia","СССР");
            this.wordsWithTranslation.put("Timur","А щит хере гоу эгейн");
            int i = 0;
            for(String current : wordsWithTranslation.keySet()){
                score.put(current,0);
                words[i] = current;
                i++;
            }
        }


}
