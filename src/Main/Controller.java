package Main;
import Testing.TestingMainAlgo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Controller {
    @FXML private TextArea WordListInput;
    @FXML private TextField Name;
    @FXML private TextField Surname;
    @FXML private TextField ThirdName;
    @FXML private DatePicker DateOfBirth;

    public void ValidatingInputs(ActionEvent event) {
        /*TODO:change the data into normal one
        ** input age
        ** Abreviations of the name, surname, middle name, father name */
    }
    //Writes into data.txt
    public void WriteOnFile(BufferedWriter myFile, Stack<String> WordList) throws IOException {
        Iterator<String> itr = WordList.iterator();
        while(itr.hasNext()) {
            myFile.write(itr.next());
            myFile.newLine();
        }
        myFile.close();
    }
    public void onSubmit(ActionEvent event) throws IOException {
        FileWriter myFile = new FileWriter("\\C:\\Users\\kumak\\IdeaProjects\\BruteForce\\src\\sample\\data\\data.txt");
        BufferedWriter FileWriter = new BufferedWriter(myFile);
        TestingMainAlgo combiner = new TestingMainAlgo();
        //Main Function

        //WordArrayUseless = combiner.combinations(ValidatingInputs(event));
       /* for (int word = 0; word < WordArrayUseless.length; word++) {
            WordList.push(WordArrayUseless[word]);
        }
        WriteOnFile(FileWriter);*/
    }
}
