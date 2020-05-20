import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.util.Callback;

public class TabReceiveOrder {
    Pane pane = new Pane();
    public Pane getPane() {
        tabReceiveOrder();
        return pane;
    }

    public void tabReceiveOrder() {
        VBox vbox = new VBox();
        HBox hbox1 = new HBox();
        HBox hbox2 = new HBox();
        TextField text = new TextField();
        Button button1 = new Button("Получить заказ");
        Button button2 = new Button("Купить салфетку");
        Button button3 = new Button("Забрать заказ");

        ObservableList<Order> order = FXCollections.observableArrayList();

        pane.getChildren().add(vbox);

        vbox.setPadding(new Insets(10, 30, 10, 30));
        vbox.setSpacing(20);
        vbox.getChildren().add(new Text("Введите Ваше имя:"));
        vbox.getChildren().add(hbox1);
        hbox1.setSpacing(20);
        hbox1.getChildren().add(text);
        hbox1.getChildren().add(button1);

        vbox.getChildren().add(hbox2);
        hbox2.setSpacing(20);

        TableView<Order> tableView = new TableView<>(order);

        TableColumn<Order, String> column1 = new TableColumn<>("Выполнен");
        column1.setPrefWidth(125);
        column1.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Order, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Order, String> param) {
                return param.getValue().nameProperty();
            }
        });

        TableColumn<Order, String> column2 = new TableColumn<>("Активен");
        column2.setPrefWidth(125);
        column2.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Order, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Order, String> param) {
                return param.getValue().emptyFieldProperty();
            }
        });

        tableView.getColumns().addAll(column1, column2);

        hbox2.getChildren().add(tableView);
        hbox2.getChildren().add(button2);
        hbox2.getChildren().add(button3);

        button1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String name = text.getText();

                order.add(new Order(name, null));
                text.clear();
            }
        });

        button2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                Order selected = tableView.getSelectionModel().getSelectedItem();
                String name, name1;
                name = selected.getName();
                name1 = selected.getEmptyField();
                if(name == null) {
                    return;
                }
                selected.emptyFieldProperty().setValue(name);
                selected.nameProperty().setValue(name1);
            }
        });

        button3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                Order selected = tableView.getSelectionModel().getSelectedItem();
                String name, name1;
                name = selected.getName();
                name1 = selected.getEmptyField();
                if(name1 == null) {
                    return;
                }
                selected.emptyFieldProperty().setValue(name);
                selected.nameProperty().setValue(name1);
            }
        });

    }
}
