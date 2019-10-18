package by.epam.unit04.text.entity;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence {

    List<Word> words = new ArrayList<>();

    private Sentence(List<Word> words) {
        this.words = words;
    }

    public Sentence() {
        this(new ArrayList<>());
    }


    public Sentence(Word word) {
        this.words.add(word);
    }

    public Sentence(String sentence) {
        Word sent = new Word(sentence);
        this.words.add(sent);
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    // bean rule 2 get и 2 set
    public void addWord(Word word) { //добавление города в коллекцию в конец
        words.add(word);
    }

    public void addWord(int index, Word word) { //добавление города в указанную позицию
        words.add(index, word);
    }

    public void addWord(String sentence) {
        words.add(new Word(sentence));

    }


    public Word getWord(Word word) { //вернуть слово из коллекции
        for (Word w : words) {
            if (word.equals(w)) {
                return word;
            }
        }
        return new Word(); //вернуть пустое слово )))
    }

    public Word getWord(int index) { //вернуть город из коллекции по индексу
        return words.get(index);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return Objects.equals(words, sentence.words);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words);
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "words=" + words +
                '}';
    }
}
