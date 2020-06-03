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
        HBox hboxName = new HBox();
        HBox hboxTableView = new HBox();
        TextField name = new TextField();
        Button buttonAddNameToTable = new Button("Получить заказ");
        Button buttonMoveNameToRightColumn = new Button("Купить салфетку");
        Button buttonMoveNameToLeftColumn = new Button("Забрать заказ");
        ObservableList<Order> orderInTable = FXCollections.observableArrayList();
        TableView<Order> tableViewOrders = new TableView<>(orderInTable);

        pane.getChildren().add(vbox);
        vbox.setPadding(new Insets(10, 30, 10, 30));
        vbox.setSpacing(20);
        vbox.getChildren().add(new Text("Введите Ваше имя:"));
        vbox.getChildren().add(hboxName);
        hboxName.setSpacing(20);
        hboxName.getChildren().add(name);
        hboxName.getChildren().add(buttonAddNameToTable);
        vbox.getChildren().add(hboxTableView);
        hboxTableView.setSpacing(20);

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

        tableViewOrders.getColumns().addAll(column1, column2);

        hboxTableView.getChildren().add(tableViewOrders);
        hboxTableView.getChildren().add(buttonMoveNameToRightColumn);
        hboxTableView.getChildren().add(buttonMoveNameToLeftColumn);

        buttonAddNameToTable.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                orderInTable.add(new Order(name.getText(), null));
                name.clear();
            }
        });

        buttonMoveNameToRightColumn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                Order selectedOrder = tableViewOrders.getSelectionModel().getSelectedItem();
                String name, nameEmpty;
                name = selectedOrder.getName();
                nameEmpty = selectedOrder.getEmptyField();
                if(name == null) {
                    return;
                }
                selectedOrder.emptyFieldProperty().setValue(name);
                selectedOrder.nameProperty().setValue(nameEmpty);
            }
        });

        buttonMoveNameToLeftColumn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                Order selectedOrder = tableViewOrders.getSelectionModel().getSelectedItem();
                String name, nameEmpty;
                name = selectedOrder.getName();
                nameEmpty = selectedOrder.getEmptyField();
                if(nameEmpty == null) {
                    return;
                }
                selectedOrder.emptyFieldProperty().setValue(name);
                selectedOrder.nameProperty().setValue(nameEmpty);
            }
        });

    }
}
