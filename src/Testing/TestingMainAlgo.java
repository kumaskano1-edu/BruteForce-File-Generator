package Testing;

import Algorithm.MainAlgorithm;
import Objects.Person;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.Arrays;

public class TestingMainAlgo {
    public static void main(String[] args) {
        String[] ExtraWordList = new String[]{"President", "Log", "Kyrgyzstan", "Normalization", "Kurmanbek" };
        String Name = "Kurmanbek";
        String Surname = "Karaev";
        String ThirdName = "Maadanbekovich";
        String Date = "05/08/2001";

        Person sampleRecord = new Person(Name, Surname, ThirdName, Date, ExtraWordList);
        MainAlgorithm algo = new MainAlgorithm();
        //testing environment
        sampleRecord.SettingArray();
        String[] Wordlist = sampleRecord.getWordList();
        //loop for modifying String
        /*for(int i = 0; i < Wordlist.length-3; i++) {
            if (i < 3) {
                algo.ParsingStringVersionWithNames(Wordlist[i]);
            } else {
                algo.ParsingStringVersions(Wordlist[i]);
            }
        }*/
        //loop for adding date
        for(int i = 0; i<3; i++) {
            algo.AddToStack(sampleRecord.ParsingDate()[i]);
        }
        //starting combination of the words
        String[] Words = algo.getStack().toArray(new String[0]);
        System.out.println(Arrays.toString(Words));
        System.out.println(Words.length);
        
        = algo.combination(Words, Words.length);
        System.out.println(Arrays.toString(Combinations));
    }
}


