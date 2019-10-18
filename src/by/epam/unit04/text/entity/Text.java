package by.epam.unit04.text.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Text {

    private  String header;

    List<Sentence> sentences = new ArrayList<>();

    public Text(String header, List<Sentence> sentence) {
        this.header = header;
        this.sentences = sentence;
    }
    public Text (String header, String inputString){
        this.header = header;
        Sentence sentence = new Sentence(inputString);
        sentences.add(sentence);
    }


    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }
    // bean rule 2 get и 2 set
    public void addSentence (Sentence sentence){ //добавление города в коллекцию в конец
        sentences.add(sentence);
    }
    public void addSentence (int index, Sentence sentence){ //добавление города в указанную позицию
        sentences.add(index, sentence);
    }
    public void addSentence (String sentence){
        sentences.add(new Sentence(sentence));
    }

    public Sentence getSentence(Sentence sentence) { //вернуть текст из коллекции
        for ( Sentence s : sentences) {
            if (sentence.equals(s)) {
                return sentence;
            }
        }
        return new Sentence (); //вернуть пустой текст)))
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Objects.equals(header, text.header) &&
                Objects.equals(sentences, text.sentences);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, sentences);
    }

    @Override
    public String toString() {
        return "Text{" +
                "header='" + header + '\'' +
                ", sentences=" + sentences +
                '}';
    }

}
