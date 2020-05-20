import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class TabMenu {
    Pane pane = new Pane();
    public Pane getPane() {
        tabMenu();
        return pane;
    }
    int priceOrder = 0;
    public void tabMenu() {
        VBox vbox = new VBox();
        HBox hbox = new HBox();
        TextField text = new TextField();
        Text cost = new Text();
        Button button = new Button("Добавить к заказу");

        CheckBox checkBox1 = new CheckBox();
        CheckBox checkBox2 = new CheckBox();
        CheckBox checkBox3 = new CheckBox();
        CheckBox checkBox4 = new CheckBox();
        CheckBox checkBox5 = new CheckBox();
        CheckBox checkBox6 = new CheckBox();
        CheckBox checkBox7 = new CheckBox();
        CheckBox checkBox8 = new CheckBox();

        HBox hbox1 = new HBox();
        HBox hbox2 = new HBox();
        HBox hbox3 = new HBox();
        HBox hbox4 = new HBox();
        HBox hbox5 = new HBox();
        HBox hbox6 = new HBox();
        HBox hbox7 = new HBox();
        HBox hbox8 = new HBox();

        checkBox1.setText("Гамбургер");
        checkBox2.setText("Чизбургер");
        checkBox3.setText("МакЧикен");
        checkBox4.setText("Биг Тейсти");
        checkBox5.setText("Картофель фри");
        checkBox6.setText("Картофель по-деревенски");
        checkBox7.setText("Coca-Cola");
        checkBox8.setText("Fanta");

        pane.getChildren().add(vbox);

        vbox.setPadding(new Insets(10, 30, 10, 30));
        vbox.setSpacing(20);
        vbox.getChildren().add(new Text("Меню"));
        vbox.getChildren().add(hbox);
        hbox.setSpacing(20);
        hbox.getChildren().add(text);
        hbox.getChildren().add(cost);
        vbox.getChildren().add(button);

        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                boolean textHasBeenFound = false;
                if (checkBox1.getText().equals(text.getText())) {
                    checkBox1.fire();
                    textHasBeenFound = true;
                    priceOrder += 20;
                    text.clear();
                }

                if (checkBox2.getText().equals(text.getText())) {
                    checkBox2.fire();
                    textHasBeenFound = true;
                    priceOrder += 25;
                    text.clear();
                }

                if (checkBox3.getText().equals(text.getText())) {
                    checkBox3.fire();
                    textHasBeenFound = true;
                    priceOrder += 30;
                    text.clear();
                }

                if (checkBox4.getText().equals(text.getText())) {
                    checkBox4.fire();
                    textHasBeenFound = true;
                    priceOrder += 40;
                    text.clear();
                }

                if (checkBox5.getText().equals(text.getText())) {
                    checkBox5.fire();
                    textHasBeenFound = true;
                    priceOrder += 15;
                    text.clear();
                }

                if (checkBox6.getText().equals(text.getText())) {
                    checkBox6.fire();
                    textHasBeenFound = true;
                    priceOrder += 20;
                    text.clear();
                }

                if (checkBox7.getText().equals(text.getText())) {
                    checkBox7.fire();
                    textHasBeenFound = true;
                    priceOrder += 25;
                    text.clear();
                }

                if (checkBox8.getText().equals(text.getText())) {
                    checkBox8.fire();
                    textHasBeenFound = true;
                    priceOrder += 20;
                    text.clear();
                }
                cost.setText("Стоимость заказа: " + priceOrder + "$.");

                if (!textHasBeenFound){
                    Alert warning = new Alert(Alert.AlertType.ERROR);
                    warning.setContentText("Такого варианта нет!");
                    warning.show();
                    text.clear();
                }
            }
        });
        vbox.getChildren().add(hbox1);
        hbox1.getChildren().add(checkBox1);
        hbox1.getChildren().add(new Text(" - 20$"));
        vbox.getChildren().add(hbox2);
        hbox2.getChildren().add(checkBox2);
        hbox2.getChildren().add(new Text(" - 25$"));
        vbox.getChildren().add(hbox3);
        hbox3.getChildren().add(checkBox3);
        hbox3.getChildren().add(new Text(" - 30$"));
        vbox.getChildren().add(hbox4);
        hbox4.getChildren().add(checkBox4);
        hbox4.getChildren().add(new Text(" - 40$"));
        vbox.getChildren().add(hbox5);
        hbox5.getChildren().add(checkBox5);
        hbox5.getChildren().add(new Text(" - 15$"));
        vbox.getChildren().add(hbox6);
        hbox6.getChildren().add(checkBox6);
        hbox6.getChildren().add(new Text(" - 20$"));
        vbox.getChildren().add(hbox7);
        hbox7.getChildren().add(checkBox7);
        hbox7.getChildren().add(new Text(" - 25$"));
        vbox.getChildren().add(hbox8);
        hbox8.getChildren().add(checkBox8);
        hbox8.getChildren().add(new Text(" - 20$"));
    }
}
