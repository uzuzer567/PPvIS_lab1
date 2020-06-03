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
    int priceOrder = 0;
    Pane pane = new Pane();

    public Pane getPane() {
        tabMenu();
        return pane;
    }

    public void tabMenu() {
        VBox vbox = new VBox();
        HBox hboxMenu = new HBox();
        HBox hboxHamburger = new HBox();
        HBox hboxCheeseburger = new HBox();
        HBox hboxMcChicken = new HBox();
        HBox hboxBigTasty = new HBox();
        HBox hboxFrenchFries = new HBox();
        HBox hboxPotatoInRusticWay = new HBox();
        HBox hboxCocaCola = new HBox();
        HBox hboxFanta = new HBox();
        TextField selectedFood = new TextField();
        Text textPriceOrder = new Text();
        Button buttonAddToOrder = new Button("Добавить к заказу");

        CheckBox checkBoxHamburger = new CheckBox("Гамбургер");
        CheckBox checkBoxCheeseburger = new CheckBox("Чизбургер");
        CheckBox checkBoxMcChicken = new CheckBox("МакЧикен");
        CheckBox checkBoxBigTasty = new CheckBox("Биг Тейсти");
        CheckBox checkBoxFrenchFries = new CheckBox("Картофель фри");
        CheckBox checkBoxPotatoInRusticWay = new CheckBox("Картофель по-деревенски");
        CheckBox checkBoxCocaCola = new CheckBox("Coca-Cola");
        CheckBox checkBoxFanta = new CheckBox("Fanta");

        pane.getChildren().add(vbox);
        vbox.setPadding(new Insets(10, 30, 10, 30));
        vbox.setSpacing(20);
        vbox.getChildren().add(new Text("Меню"));
        vbox.getChildren().add(hboxMenu);
        hboxMenu.setSpacing(20);
        hboxMenu.getChildren().add(selectedFood);
        hboxMenu.getChildren().add(textPriceOrder);
        vbox.getChildren().add(buttonAddToOrder);

        buttonAddToOrder.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                boolean textHasBeenFound = false;
                if (checkBoxHamburger.getText().equals(selectedFood.getText())) {
                    checkBoxHamburger.fire();
                    textHasBeenFound = true;
                    priceOrder += 20;
                    selectedFood.clear();
                }

                if (checkBoxCheeseburger.getText().equals(selectedFood.getText())) {
                    checkBoxCheeseburger.fire();
                    textHasBeenFound = true;
                    priceOrder += 25;
                    selectedFood.clear();
                }

                if (checkBoxMcChicken.getText().equals(selectedFood.getText())) {
                    checkBoxMcChicken.fire();
                    textHasBeenFound = true;
                    priceOrder += 30;
                    selectedFood.clear();
                }

                if (checkBoxBigTasty.getText().equals(selectedFood.getText())) {
                    checkBoxBigTasty.fire();
                    textHasBeenFound = true;
                    priceOrder += 40;
                    selectedFood.clear();
                }

                if (checkBoxFrenchFries.getText().equals(selectedFood.getText())) {
                    checkBoxFrenchFries.fire();
                    textHasBeenFound = true;
                    priceOrder += 15;
                    selectedFood.clear();
                }

                if (checkBoxPotatoInRusticWay.getText().equals(selectedFood.getText())) {
                    checkBoxPotatoInRusticWay.fire();
                    textHasBeenFound = true;
                    priceOrder += 20;
                    selectedFood.clear();
                }

                if (checkBoxCocaCola.getText().equals(selectedFood.getText())) {
                    checkBoxCocaCola.fire();
                    textHasBeenFound = true;
                    priceOrder += 25;
                    selectedFood.clear();
                }

                if (checkBoxFanta.getText().equals(selectedFood.getText())) {
                    checkBoxFanta.fire();
                    textHasBeenFound = true;
                    priceOrder += 20;
                    selectedFood.clear();
                }

                textPriceOrder.setText("Стоимость заказа: " + priceOrder + "$.");

                if (!textHasBeenFound){
                    Alert warning = new Alert(Alert.AlertType.ERROR);
                    warning.setContentText("Такого варианта нет!");
                    warning.show();
                    selectedFood.clear();
                }
            }
        });
        vbox.getChildren().add(hboxHamburger);
        hboxHamburger.getChildren().add(checkBoxHamburger);
        hboxHamburger.getChildren().add(new Text(" - 20$"));
        vbox.getChildren().add(hboxCheeseburger);
        hboxCheeseburger.getChildren().add(checkBoxCheeseburger);
        hboxCheeseburger.getChildren().add(new Text(" - 25$"));
        vbox.getChildren().add(hboxMcChicken);
        hboxMcChicken.getChildren().add(checkBoxMcChicken);
        hboxMcChicken.getChildren().add(new Text(" - 30$"));
        vbox.getChildren().add(hboxBigTasty);
        hboxBigTasty.getChildren().add(checkBoxBigTasty);
        hboxBigTasty.getChildren().add(new Text(" - 40$"));
        vbox.getChildren().add(hboxFrenchFries);
        hboxFrenchFries.getChildren().add(checkBoxFrenchFries);
        hboxFrenchFries.getChildren().add(new Text(" - 15$"));
        vbox.getChildren().add(hboxPotatoInRusticWay);
        hboxPotatoInRusticWay.getChildren().add(checkBoxPotatoInRusticWay);
        hboxPotatoInRusticWay.getChildren().add(new Text(" - 20$"));
        vbox.getChildren().add(hboxCocaCola);
        hboxCocaCola.getChildren().add(checkBoxCocaCola);
        hboxCocaCola.getChildren().add(new Text(" - 25$"));
        vbox.getChildren().add(hboxFanta);
        hboxFanta.getChildren().add(checkBoxFanta);
        hboxFanta.getChildren().add(new Text(" - 20$"));
    }
}
