package by.epam.unit04.text.entity;

import java.util.Arrays;

public class Sentence {
    private String valueOfSentence = " ";

    public Sentence(Word word) {
        this.valueOfSentence = word.getValue();
    }
    public Sentence (Word[] words){
        this.valueOfSentence = Arrays.toString(words);
    }

    public String getValueOfSentence() {
        return valueOfSentence;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "valueOfSentence='" + valueOfSentence + '\'' +
                '}';
    }
}
