import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class TabPositions {
    Pane pane = new Pane();
    public Pane getPane() {
        tabPositions();
        return pane;
    }

    public void tabPositions() {
        ToggleGroup toggleGroup = new ToggleGroup();
        VBox vbox = new VBox();
        HBox hbox1 = new HBox();
        HBox hbox2 = new HBox();
        HBox hbox3 = new HBox();
        TextField text = new TextField();
        Button button = new Button("Информация");
        Label selectedLabel = new Label();

        RadioButton radioButton1 = new RadioButton("Директор ресторана");
        RadioButton radioButton2 = new RadioButton("Первый ассистент директора");
        RadioButton radioButton3 = new RadioButton("Менеджер участка");
        RadioButton radioButton4 = new RadioButton("Менеджер по гостеприимству");
        RadioButton radioButton5 = new RadioButton("Инструктор");
        RadioButton radioButton6 = new RadioButton("Работник ресторана");
        RadioButton radioButton7 = new RadioButton("Работник ночной смены");
        RadioButton radioButton8 = new RadioButton("Бариста");

        pane.getChildren().add(vbox);

        vbox.setPadding(new Insets(10, 30, 10, 30));
        vbox.setSpacing(20);
        vbox.getChildren().add(hbox1);
        hbox1.setSpacing(20);
        hbox1.getChildren().add(new Text("Узнай больше о должностях!\n\nВведите название должности:"));
        vbox.getChildren().add(hbox2);
        hbox2.setSpacing(20);
        hbox2.getChildren().add(text);
        hbox2.getChildren().add(button);

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                boolean textHasBeenFound = false;

                if (radioButton1.getText().equals(text.getText())) {
                    radioButton1.setSelected(true);
                    textHasBeenFound = true;
                    selectedLabel.setText(" Вы выбрали: " + radioButton1.getText() + ".\n\n Директор ресторана ставит цели и задачи команде менеджеров \n ресторана и обеспечивает условия" +
                            " для их выполнения. Он осуществляет \n контроль за удовлетворением потребностей гостей ресторана,\n" +
                            " развитием сотрудников и обеспечивает прибыльность ведения бизнеса.");
                    text.clear();
                }

                if (radioButton2.getText().equals(text.getText())) {
                    radioButton2.setSelected(true);
                    textHasBeenFound = true;
                    selectedLabel.setText(" Вы выбрали: " + radioButton2.getText() + ".\n\n Первый ассистент директора руководит одним или \n несколькими направлениями бизнеса в ресторане. Он" +
                            " обладает лидерскими качествами,\n развивает команду работников и инструкторов, напрямую влияет на\n" +
                            " выполнение поставленных перед командой ресторана задач.");
                    text.clear();
                }

                if (radioButton3.getText().equals(text.getText())) {
                    radioButton3.setSelected(true);
                    textHasBeenFound = true;
                    selectedLabel.setText(" Вы выбрали: " + radioButton3.getText() + ".\n\n Менеджер участка организует работу одного из \n участков ресторана — зону сервиса, производства или" +
                            " МакДрайв. Он контролирует \n точность выполнения процедур, скорость обслуживания, а также качество\n" +
                            " предоставляемой гостям продукции.");
                    text.clear();
                }

                if (radioButton4.getText().equals(text.getText())) {
                    radioButton4.setSelected(true);
                    textHasBeenFound = true;
                    selectedLabel.setText(" Вы выбрали: " + radioButton4.getText() + ".\n\n Менеджер по гостеприимству создает впечатляющую, \n гостеприимную атмосферу в ресторане: встречает" +
                            " гостей, оказывает \n помощь в выборе заказа. Взаимодействует с гостями на протяжении их визита.\n" +
                            " Является примером заботы о гостях для работников ресторана.");
                    text.clear();
                }

                if (radioButton5.getText().equals(text.getText())) {
                    radioButton5.setSelected(true);
                    textHasBeenFound = true;
                    selectedLabel.setText(" Вы выбрали: " + radioButton5.getText() + ".\n\n Инструктор обучает новых и уже опытных сотрудников \n работе на участках. Он имеет отличные навыки" +
                            " общения и работы в команде,\n демонстрирует высокий уровень работы на всех позициях.\n");
                    text.clear();
                }

                if (radioButton6.getText().equals(text.getText())) {
                    radioButton6.setSelected(true);
                    textHasBeenFound = true;
                    selectedLabel.setText(" Вы выбрали: " + radioButton6.getText() + ".\n\n Работник ресторана обслуживает гостей ресторана: \n принимает, собирает и выдает заказы. Работает на " +
                            "кухне.\n Поддерживает чистоту в зале и на прилегающей территории.");
                    text.clear();
                }

                if (radioButton7.getText().equals(text.getText())) {
                    radioButton7.setSelected(true);
                    textHasBeenFound = true;
                    selectedLabel.setText(" Вы выбрали: " + radioButton7.getText() + ".\n\n Работник ночной смены подготавливает производственные и \n служебные помещения ресторана" +
                            " к открытию. Осуществляет комплексное \n обслуживание, моет и санитаризирует оборудование ресторана.");
                    text.clear();
                }

                if (radioButton8.getText().equals(text.getText())) {
                    radioButton8.setSelected(true);
                    textHasBeenFound = true;
                    selectedLabel.setText(" Вы выбрали: " + radioButton8.getText() + ".\n\n Бариста готовит кофе, напитки и десерты из \n ассортимента МакКафe, принимает, собирает и" +
                            " рассчитывает заказы на кассе.\n Создает гостеприимную обстановку для посетителей ресторана.\n Поддерживает" +
                            " чистоту на рабочем месте.");
                    text.clear();
                }

                if (!textHasBeenFound){
                    Alert warning = new Alert(Alert.AlertType.ERROR);
                    warning.setContentText("Такого варианта нет!");
                    warning.show();
                    text.clear();
                }
            }
        });

        radioButton1.setToggleGroup(toggleGroup);
        radioButton2.setToggleGroup(toggleGroup);
        radioButton3.setToggleGroup(toggleGroup);
        radioButton4.setToggleGroup(toggleGroup);
        radioButton5.setToggleGroup(toggleGroup);
        radioButton6.setToggleGroup(toggleGroup);
        radioButton7.setToggleGroup(toggleGroup);
        radioButton8.setToggleGroup(toggleGroup);

        FlowPane flowPane = new FlowPane(Orientation.VERTICAL, 10, 10);
        flowPane.getChildren().addAll(radioButton1, radioButton2, radioButton3, radioButton4, radioButton5, radioButton6, radioButton7, radioButton8);
        flowPane.setPadding(new Insets(10));
        vbox.getChildren().add(hbox3);
        hbox3.setSpacing(120);
        hbox3.getChildren().add(flowPane);
        hbox3.getChildren().add(selectedLabel);
    }
}
