import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class TabFeedback {
    Pane pane = new Pane();
    public Pane getPane() {
        tabFeedback();
        return pane;
    }
    public void tabFeedback() {
        VBox vbox = new VBox();
        HBox hbox = new HBox();
        TextField text = new TextField();
        Button button1 = new Button();
        Button button2 = new Button();
        String buttonText = "Ответить";

        pane.getChildren().add(vbox);

        vbox.setPadding(new Insets(10, 30, 10, 30));
        vbox.setSpacing(20);

        vbox.getChildren().add(new Text("Вам у нас понравилось?"));
        vbox.getChildren().add(text);
        vbox.getChildren().add(hbox);
        hbox.setSpacing(20);
        button1.setText(buttonText);
        hbox.getChildren().add(button1);
        hbox.getChildren().add(button2);

        button1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String nameBlankButton;
                nameBlankButton = text.getText();
                text.clear();
                button2.setText(nameBlankButton);
            }
        });

        button2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String nameBlankButton;
                String nameButtonAnswerTheQuestion;
                nameBlankButton = button2.getText();
                nameButtonAnswerTheQuestion = button1.getText();
                button1.setText(nameBlankButton);
                button2.setText(nameButtonAnswerTheQuestion);
            }
        });
    }
}
