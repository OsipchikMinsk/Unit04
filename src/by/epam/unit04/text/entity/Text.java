package by.epam.unit04.text.entity;

public class Text {

    private  String header;
    Sentence sentence;

    public Text(String header, Sentence sentence) {
        this.header = header;
        this.sentence = sentence;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Sentence getSentence() {
        return sentence;
    }

    public void setSentence(Sentence sentence) {
        this.sentence = sentence;
    }

}
