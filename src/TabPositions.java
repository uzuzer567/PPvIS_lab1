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
        VBox vbox = new VBox();
        HBox hboxTextNamePosition = new HBox();
        HBox hboxNamePosition = new HBox();
        HBox hboxFlowPane = new HBox();
        TextField namePosition = new TextField();
        Button buttonGetInformationAboutPosition = new Button("Информация");
        Label selectedPosition = new Label();

        ToggleGroup toggleGroup = new ToggleGroup();
        RadioButton radioButtonRestaurantDirector = new RadioButton("Директор ресторана");
        RadioButton radioButtonFirstAssistantDirector = new RadioButton("Первый ассистент директора");
        RadioButton radioButtonManagerSite = new RadioButton("Менеджер участка");
        RadioButton radioButtonManagerHospitality = new RadioButton("Менеджер по гостеприимству");
        RadioButton radioButtonInstructor = new RadioButton("Инструктор");
        RadioButton radioButtonRestaurantWorker = new RadioButton("Работник ресторана");
        RadioButton radioButtonNightWorker = new RadioButton("Работник ночной смены");
        RadioButton radioButtonBarista = new RadioButton("Бариста");

        radioButtonRestaurantDirector.setToggleGroup(toggleGroup);
        radioButtonFirstAssistantDirector.setToggleGroup(toggleGroup);
        radioButtonManagerSite.setToggleGroup(toggleGroup);
        radioButtonManagerHospitality.setToggleGroup(toggleGroup);
        radioButtonInstructor.setToggleGroup(toggleGroup);
        radioButtonRestaurantWorker.setToggleGroup(toggleGroup);
        radioButtonNightWorker.setToggleGroup(toggleGroup);
        radioButtonBarista.setToggleGroup(toggleGroup);

        pane.getChildren().add(vbox);
        vbox.setPadding(new Insets(10, 30, 10, 30));
        vbox.setSpacing(20);
        vbox.getChildren().add(hboxTextNamePosition);
        hboxTextNamePosition.setSpacing(20);
        hboxTextNamePosition.getChildren().add(new Text("Узнай больше о должностях!\n\nВведите название должности:"));
        vbox.getChildren().add(hboxNamePosition);
        hboxNamePosition.setSpacing(20);
        hboxNamePosition.getChildren().add(namePosition);
        hboxNamePosition.getChildren().add(buttonGetInformationAboutPosition);

        buttonGetInformationAboutPosition.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                boolean positionHasBeenFound = false;

                if (radioButtonRestaurantDirector.getText().equals(namePosition.getText())) {
                    radioButtonRestaurantDirector.setSelected(true);
                    positionHasBeenFound = true;
                    selectedPosition.setText(" Вы выбрали: " + radioButtonRestaurantDirector.getText() + ".\n\n Директор ресторана ставит цели и задачи команде менеджеров \n ресторана и обеспечивает условия" +
                            " для их выполнения. Он осуществляет \n контроль за удовлетворением потребностей гостей ресторана,\n" +
                            " развитием сотрудников и обеспечивает прибыльность ведения бизнеса.");
                    namePosition.clear();
                }

                if (radioButtonFirstAssistantDirector.getText().equals(namePosition.getText())) {
                    radioButtonFirstAssistantDirector.setSelected(true);
                    positionHasBeenFound = true;
                    selectedPosition.setText(" Вы выбрали: " + radioButtonFirstAssistantDirector.getText() + ".\n\n Первый ассистент директора руководит одним или \n несколькими направлениями бизнеса в ресторане. Он" +
                            " обладает лидерскими качествами,\n развивает команду работников и инструкторов, напрямую влияет на\n" +
                            " выполнение поставленных перед командой ресторана задач.");
                    namePosition.clear();
                }

                if (radioButtonManagerSite.getText().equals(namePosition.getText())) {
                    radioButtonManagerSite.setSelected(true);
                    positionHasBeenFound = true;
                    selectedPosition.setText(" Вы выбрали: " + radioButtonManagerSite.getText() + ".\n\n Менеджер участка организует работу одного из \n участков ресторана — зону сервиса, производства или" +
                            " МакДрайв. Он контролирует \n точность выполнения процедур, скорость обслуживания, а также качество\n" +
                            " предоставляемой гостям продукции.");
                    namePosition.clear();
                }

                if (radioButtonManagerHospitality.getText().equals(namePosition.getText())) {
                    radioButtonManagerHospitality.setSelected(true);
                    positionHasBeenFound = true;
                    selectedPosition.setText(" Вы выбрали: " + radioButtonManagerHospitality.getText() + ".\n\n Менеджер по гостеприимству создает впечатляющую, \n гостеприимную атмосферу в ресторане: встречает" +
                            " гостей, оказывает \n помощь в выборе заказа. Взаимодействует с гостями на протяжении их визита.\n" +
                            " Является примером заботы о гостях для работников ресторана.");
                    namePosition.clear();
                }

                if (radioButtonInstructor.getText().equals(namePosition.getText())) {
                    radioButtonInstructor.setSelected(true);
                    positionHasBeenFound = true;
                    selectedPosition.setText(" Вы выбрали: " + radioButtonInstructor.getText() + ".\n\n Инструктор обучает новых и уже опытных сотрудников \n работе на участках. Он имеет отличные навыки" +
                            " общения и работы в команде,\n демонстрирует высокий уровень работы на всех позициях.\n");
                    namePosition.clear();
                }

                if (radioButtonRestaurantWorker.getText().equals(namePosition.getText())) {
                    radioButtonRestaurantWorker.setSelected(true);
                    positionHasBeenFound = true;
                    selectedPosition.setText(" Вы выбрали: " + radioButtonRestaurantWorker.getText() + ".\n\n Работник ресторана обслуживает гостей ресторана: \n принимает, собирает и выдает заказы. Работает на " +
                            "кухне.\n Поддерживает чистоту в зале и на прилегающей территории.");
                    namePosition.clear();
                }

                if (radioButtonNightWorker.getText().equals(namePosition.getText())) {
                    radioButtonNightWorker.setSelected(true);
                    positionHasBeenFound = true;
                    selectedPosition.setText(" Вы выбрали: " + radioButtonNightWorker.getText() + ".\n\n Работник ночной смены подготавливает производственные и \n служебные помещения ресторана" +
                            " к открытию. Осуществляет комплексное \n обслуживание, моет и санитаризирует оборудование ресторана.");
                    namePosition.clear();
                }

                if (radioButtonBarista.getText().equals(namePosition.getText())) {
                    radioButtonBarista.setSelected(true);
                    positionHasBeenFound = true;
                    selectedPosition.setText(" Вы выбрали: " + radioButtonBarista.getText() + ".\n\n Бариста готовит кофе, напитки и десерты из \n ассортимента МакКафe, принимает, собирает и" +
                            " рассчитывает заказы на кассе.\n Создает гостеприимную обстановку для посетителей ресторана.\n Поддерживает" +
                            " чистоту на рабочем месте.");
                    namePosition.clear();
                }

                if (!positionHasBeenFound){
                    Alert warning = new Alert(Alert.AlertType.ERROR);
                    warning.setContentText("Такого варианта нет!");
                    warning.show();
                    namePosition.clear();
                }
            }
        });

        FlowPane flowPane = new FlowPane(Orientation.VERTICAL, 10, 10);
        flowPane.getChildren().addAll(radioButtonRestaurantDirector, radioButtonFirstAssistantDirector, radioButtonManagerSite, radioButtonManagerHospitality,
                radioButtonInstructor, radioButtonRestaurantWorker, radioButtonNightWorker, radioButtonBarista);
        flowPane.setPadding(new Insets(10));
        vbox.getChildren().add(hboxFlowPane);
        hboxFlowPane.setSpacing(120);
        hboxFlowPane.getChildren().add(flowPane);
        hboxFlowPane.getChildren().add(selectedPosition);
    }
}
