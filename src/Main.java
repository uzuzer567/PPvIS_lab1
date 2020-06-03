import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.util.Duration;

public class Main extends Application {
    private String title = "  Добро пожаловать в наше кафе!  ";

    public void start(Stage stage) throws Exception {
        TabQuestionnaire  getTabQuestionnaire = new TabQuestionnaire();
        TabFeedback getTabFeedback = new TabFeedback();
        TabPositions getTabPositions = new TabPositions();
        TabMenu getTabMenu = new TabMenu();
        TabReceiveOrder getTabReceiveOrder = new TabReceiveOrder();

        Tab tabQuestionnaire = new Tab("Анкета");
        Tab tabFeedback = new Tab("Отзыв");
        Tab tabPositions = new Tab("Должности");
        Tab tabMenu = new Tab("Меню");
        Tab tabReceiveOrder = new Tab("Получить заказ");

        tabQuestionnaire.setContent(getTabQuestionnaire.getPane());
        tabFeedback.setContent(getTabFeedback.getPane());
        tabPositions.setContent(getTabPositions.getPane());
        tabMenu.setContent(getTabMenu.getPane());
        tabReceiveOrder.setContent(getTabReceiveOrder.getPane());
        TabPane tabpane = new TabPane(tabQuestionnaire, tabPositions, tabMenu, tabReceiveOrder, tabFeedback);

        stage.setTitle(title);
        int lastSymbol = stage.getTitle().length();
        Timeline timeline;
        timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.getKeyFrames().add(
                new KeyFrame(Duration.seconds(0.05),
                        new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent event) {
                                stage.setTitle(" " + stage.getTitle());
                                stage.setTitle(stage.getTitle().charAt(lastSymbol) + stage.getTitle().substring(1, lastSymbol));
                            }
                        }

                ));
        timeline.playFromStart();

        Scene scene = new Scene(tabpane, 1000, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
