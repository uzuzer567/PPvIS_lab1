import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;

public class TabQuestionnaire {
    Pane pane = new Pane();
    public Pane getPane() {
        tabQuestionnaire();
        return pane;
    }
    Boolean checkPerson;
    public void tabQuestionnaire() {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Алиса",  298510582));
        person.add(new Person("Иван",  339736761));
        person.add(new Person("Елизавета",  296810736));

        VBox vbox = new VBox();
        HBox hbox1 = new HBox();
        HBox hbox2 = new HBox();
        HBox hbox3 = new HBox();
        HBox hbox4 = new HBox();
        HBox hbox5 = new HBox();
        Text text = new Text();
        TextField text1 = new TextField();
        TextField text2 = new TextField();
        Button button1 = new Button("Отправить");
        Button button2 = new Button("Информация");

        ComboBox<Person> comboBox1 = new ComboBox();
        ComboBox<String> comboBox2 = new ComboBox();
        ComboBox<String> comboBox3 = new ComboBox();

        comboBox1.getItems().addAll(person);

        pane.getChildren().add(vbox);

        vbox.setPadding(new Insets(10, 30, 10, 30));
        vbox.setSpacing(20);

        vbox.getChildren().add(new Text("Хочешь устоиться к нам? Заполни!"));
        vbox.getChildren().add(hbox1);

        hbox1.setSpacing(20);
        hbox1.getChildren().add(new Text("Имя:"));
        hbox1.getChildren().add(text1);
        vbox.getChildren().add(hbox2);
        hbox2.getChildren().add(new Text("Контактный телефон:     "));
        hbox2.getChildren().add(new Text("+375 "));
        hbox2.getChildren().add(text2);

        vbox.getChildren().add(hbox3);
        hbox3.setSpacing(20);
        hbox3.getChildren().add(button1);

        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                hbox4.getChildren().clear();
                checkPerson = false;
                Person p = new Person(text1.getText(), Integer.parseInt(text2.getText()));
                for (int i=0;i < person.size();i++) {
                    if (person.get(i).equals(p)) {
                        checkPerson = true;
                    }

                }
                if (!checkPerson){
                    person.add(p);
                    comboBox1.getItems().add(p);
                    hbox4.getChildren().add(new Text("Вы занесены в базу! Мы c Вами свяжемся!"));
                }
                else if (checkPerson){
                    hbox4.getChildren().add(new Text("Такой человек уже есть в базе!"));
                }
                text1.clear();
                text2.clear();
            }
        });

        vbox.getChildren().add(hbox4);
        hbox4.setSpacing(20);
        vbox.getChildren().add(new Text("База:"));
        vbox.getChildren().add(hbox5);
        hbox5.setSpacing(20);
        hbox5.getChildren().add(comboBox1);
        hbox5.getChildren().add(button2);

        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                hbox4.getChildren().clear();
                Person pers = comboBox1.getSelectionModel().getSelectedItem();

                if (pers != null) {
                    text.setText("Имя: " + pers.getName() + ", " +
                            "контактный телефон: +375" + pers.getNumber() + ".");
                }
                else {
                    text.setText("Человек не выбран!");
                }
            }
        });
        hbox5.getChildren().add(text);
    }
}

