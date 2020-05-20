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
    String title;
    @Override
    public void start(Stage stage) throws Exception {

        TabQuestionnaire  task1 = new TabQuestionnaire ();
        TabFeedback task2 = new TabFeedback();
        TabPositions task3 = new TabPositions();
        TabMenu task4 = new TabMenu();
        TabReceiveOrder task5 = new TabReceiveOrder();

        Tab tab1 = new Tab("Анкета");
        Tab tab2 = new Tab("Отзыв");
        Tab tab3 = new Tab("Должности");
        Tab tab4 = new Tab("Меню");
        Tab tab5 = new Tab("Получить заказ");

        tab1.setContent(task1.getPane());
        tab2.setContent(task2.getPane());
        tab3.setContent(task3.getPane());
        tab4.setContent(task4.getPane());
        tab5.setContent(task5.getPane());
        TabPane tabpane = new TabPane(tab1, tab3, tab4, tab5, tab2);

        title = "  Добро пожаловать в наше кафе!  ";
        stage.setTitle(title);
        int last = stage.getTitle().length();

        Timeline timeline;
        timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.getKeyFrames().add(
                new KeyFrame(Duration.seconds(0.05),
                        new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent event) {
                                stage.setTitle(" " + stage.getTitle());
                                stage.setTitle(stage.getTitle().charAt(last) + stage.getTitle().substring(1, last));
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

