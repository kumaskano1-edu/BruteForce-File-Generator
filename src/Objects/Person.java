package Objects;

import java.util.Arrays;
import java.util.Date;
import java.util.Stack;

public class Person {
    protected String[] WordList;
    protected String Name;
    protected String Surname;
    protected String ThirdName;
    protected String dates;
    protected String[] ExtraWordList;
    public Person(String name, String surname, String thirdName, String date, String[] wordList) {
        Name = name;
        Surname = surname;
        ThirdName = thirdName;
        dates = date;
        ExtraWordList = wordList;
        SettingArray();
    }
    //Getters
    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getThirdName() {
        return ThirdName;
    }

    public String getDates() {
        return dates;
    }

    public String[] getExtraWordList() {
        return ExtraWordList;
    }

    public String[] getWordList() {return WordList;};

    //Other Methods
    public String[] ParsingDate(){
        String[] arrayDate = dates.split("/");
        return arrayDate;
    }
    //generating an array from the class Ibjects
    public void SettingArray() {
        int LengthOfArray = ExtraWordList.length + 6;
        String[] EmptyWordList = new String[LengthOfArray];
        EmptyWordList[0] = Name;
        EmptyWordList[1] = Surname;
        EmptyWordList [2] = ThirdName;
        for(int i = 0; i<ExtraWordList.length; i++) {
            EmptyWordList[i+3] = ExtraWordList[i];
        }
        String[] dates = ParsingDate();
        for(int i = EmptyWordList.length-3; i< EmptyWordList.length; i++) {
            EmptyWordList[i] = dates[i - EmptyWordList.length + 3];
        }
        WordList = EmptyWordList;
    }

    @Override
    public String toString() {
        return "Person{" +
                "WordList=" + Arrays.toString(WordList) +
                ", Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", ThirdName='" + ThirdName + '\'' +
                ", dates='" + dates + '\'' +
                ", ExtraWordList=" + Arrays.toString(ExtraWordList) +
                '}';
    }
}
