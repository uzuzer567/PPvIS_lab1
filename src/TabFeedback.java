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
        TextField answerToQuestion = new TextField();
        Button buttonAddNameToButton = new Button();
        Button buttonSwapButtonNames = new Button();
        String buttonAddNameToButtonName = "Ответить";

        pane.getChildren().add(vbox);
        vbox.setPadding(new Insets(10, 30, 10, 30));
        vbox.setSpacing(20);
        vbox.getChildren().add(new Text("Вам у нас понравилось?"));
        vbox.getChildren().add(answerToQuestion);
        vbox.getChildren().add(hbox);
        hbox.setSpacing(20);
        buttonAddNameToButton.setText(buttonAddNameToButtonName);
        hbox.getChildren().add(buttonAddNameToButton);
        hbox.getChildren().add(buttonSwapButtonNames);

        buttonAddNameToButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String nameEmptyButton;
                nameEmptyButton = answerToQuestion.getText();
                answerToQuestion.clear();
                buttonSwapButtonNames.setText(nameEmptyButton);
            }
        });

        buttonSwapButtonNames.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String nameEmptyButton;
                String nameButtonAnswerTheQuestion;
                nameEmptyButton = buttonSwapButtonNames.getText();
                nameButtonAnswerTheQuestion = buttonAddNameToButton.getText();
                buttonAddNameToButton.setText(nameEmptyButton);
                buttonSwapButtonNames.setText(nameButtonAnswerTheQuestion);
            }
        });
    }
}
