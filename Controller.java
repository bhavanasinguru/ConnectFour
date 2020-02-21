package myGame;


import javafx.animation.TranslateTransition;
import javafx.animation.TranslateTransitionBuilder;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;


import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Button button;
    @FXML
    private Pane myPane;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Circle circle=new Circle();
        circle.setRadius(20);
        circle.setFill(Color.RED);
        circle.setTranslateX(50);
        circle.setTranslateY(50);
        myPane.getChildren().add(circle);

        button.setOnAction(event -> {startAnimation(circle);
        });
    }

    private void startAnimation(Circle circle) {
        TranslateTransition t=new TranslateTransition();
        t.setDuration(Duration.seconds(20));
        t.setNode(circle);
        t.setToY(100);
        t.play();

        }
    }

