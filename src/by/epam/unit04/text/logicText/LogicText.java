package by.epam.unit04.text.logicText;

import by.epam.unit04.text.entity.Sentence;
import by.epam.unit04.text.entity.Text;

public class LogicText {


    public String  addText (Text t1, String text){
        return t1.getSentence() + " " +  text;
    }

    public String  displayText (Text text){
        return text.toString();
    }
    public String displayHeader (Text text){
        return text.getHeader();
    }
    public String displayText (Sentence sentence){
        return sentence.toString();
    }

}
