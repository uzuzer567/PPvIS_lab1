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
    Boolean checkPersonInComboBox;
    Pane pane = new Pane();

    public Pane getPane() {
        tabQuestionnaire();
        return pane;
    }

    public void tabQuestionnaire() {
        List<Person> peopleInComboBox = new ArrayList<>();
        peopleInComboBox.add(new Person("Алиса",  298510582));
        peopleInComboBox.add(new Person("Иван",  339736761));
        peopleInComboBox.add(new Person("Елизавета",  296810736));

        VBox vbox = new VBox();
        HBox hboxName = new HBox();
        HBox hboxNumberPhone = new HBox();
        HBox hboxButtonSendInformation = new HBox();
        HBox hboxMessageAboutAddingInformation = new HBox();
        HBox hboxComboBox = new HBox();
        Text informationAboutSelectedPerson = new Text();
        TextField name = new TextField();
        TextField numberPhone = new TextField();
        Button buttonAddInformationToComboBox = new Button("Отправить");
        Button buttonGetInformationFromComboBox = new Button("Информация");
        ComboBox<Person> comboBoxPersons = new ComboBox();

        comboBoxPersons.getItems().addAll(peopleInComboBox);
        pane.getChildren().add(vbox);
        vbox.setPadding(new Insets(10, 30, 10, 30));
        vbox.setSpacing(20);
        vbox.getChildren().add(new Text("Хочешь устоиться к нам? Заполни!"));
        vbox.getChildren().add(hboxName);

        hboxName.setSpacing(20);
        hboxName.getChildren().add(new Text("Имя:"));
        hboxName.getChildren().add(name);
        vbox.getChildren().add(hboxNumberPhone);
        hboxNumberPhone.getChildren().add(new Text("Контактный телефон:     "));
        hboxNumberPhone.getChildren().add(new Text("+375 "));
        hboxNumberPhone.getChildren().add(numberPhone);

        vbox.getChildren().add(hboxButtonSendInformation);
        hboxButtonSendInformation.setSpacing(20);
        hboxButtonSendInformation.getChildren().add(buttonAddInformationToComboBox);

        buttonAddInformationToComboBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                hboxMessageAboutAddingInformation.getChildren().clear();
                checkPersonInComboBox = false;
                Person newPerson = new Person(name.getText(), Integer.parseInt(numberPhone.getText()));
                for (int i=0; i < peopleInComboBox.size(); i++) {
                    if (peopleInComboBox.get(i).equals(newPerson)) {
                        checkPersonInComboBox = true;
                    }

                }
                if (!checkPersonInComboBox){
                    peopleInComboBox.add(newPerson);
                    comboBoxPersons.getItems().add(newPerson);
                    hboxMessageAboutAddingInformation.getChildren().add(new Text("Вы занесены в базу! Мы c Вами свяжемся!"));
                }
                else if (checkPersonInComboBox){
                    hboxMessageAboutAddingInformation.getChildren().add(new Text("Такой человек уже есть в базе!"));
                }
                name.clear();
                numberPhone.clear();
            }
        });

        vbox.getChildren().add(hboxMessageAboutAddingInformation);
        hboxMessageAboutAddingInformation.setSpacing(20);
        vbox.getChildren().add(new Text("База:"));
        vbox.getChildren().add(hboxComboBox);
        hboxComboBox.setSpacing(20);
        hboxComboBox.getChildren().add(comboBoxPersons);
        hboxComboBox.getChildren().add(buttonGetInformationFromComboBox);

        buttonGetInformationFromComboBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                hboxMessageAboutAddingInformation.getChildren().clear();
                Person selectedPerson = comboBoxPersons.getSelectionModel().getSelectedItem();
                if (selectedPerson != null) {
                    informationAboutSelectedPerson.setText("Имя: " + selectedPerson.getName() + ", " +
                            "контактный телефон: +375" + selectedPerson.getNumber() + ".");
                }
                else {
                    informationAboutSelectedPerson.setText("Человек не выбран!");
                }
            }
        });

        hboxComboBox.getChildren().add(informationAboutSelectedPerson);
    }
}

