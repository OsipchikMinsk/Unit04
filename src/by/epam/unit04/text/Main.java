package by.epam.unit04.text;

import by.epam.unit04.text.entity.Sentence;
import by.epam.unit04.text.entity.Text;
import by.epam.unit04.text.entity.Word;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

   private void displayTextByIterator (Text text){
        List<Sentence> textList = text.getSentences();
        Iterator<Sentence> iterator = textList.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
        System.out.println();
    }

    private void displayTextByForEach(Text text) {
        for (Sentence sen :text.getSentences()){
            for (Word word :text.getSentence(sen).getWords()){
                System.out.print(word.getValue());
            }
        }
        System.out.println();
    }



    public static void main(String[] args) {

        Word word = new Word("I ");
        Sentence sentence = new Sentence(word);
        sentence.addWord("like Java");
        Sentence sentence1 = new Sentence(" Its cool");
        List<Sentence> sentenceList = new ArrayList<>();
        sentenceList.add(sentence);
        sentenceList.add(sentence1);
        Text text = new Text("About Java", sentenceList);
        Main main = new Main();
        main.displayTextByIterator(text);
        System.out.println(text.getHeader());
        main.displayTextByForEach(text);
        System.out.println(text.getSentence(sentence1));



    }
}
