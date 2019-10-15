package by.epam.unit04.text;

import by.epam.unit04.text.entity.Sentence;
import by.epam.unit04.text.entity.Text;
import by.epam.unit04.text.entity.Word;
import by.epam.unit04.text.logicText.LogicText;

public class Main {

    public static void main(String[] args) {
        Word w = new Word("Programmer");
        Sentence sentence = new Sentence(w);
        LogicText logicText = new LogicText();
        //logicText.addText("is a");
        Text text = new Text("Learning", sentence);
        System.out.println(logicText.displayText(sentence));
    }
}
