package project.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import project.Model.CardObject;
import java.awt.image.*;


import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class PlayGroundViewController extends Application implements Initializable {



    @FXML
    private Button card1_1Button;

    @FXML
    private ImageView imageview;


    @FXML
    private void testButton(ActionEvent event){
        System.out.println("logButton");
        //MediaPlayer.play();
        File file= new File("D:\\WORK\\EGYETEM\\3 FÉLÉV\\Swt\\PROJEKT FELADAT\\CODE\\SpeedCard\\SOURCE\\PROJECT\\src\\project\\media\\testpic.jpg");
        Image image = new Image (file.toURI().toString());
        imageview.setImage(image);
    }

    @FXML
    private void imgLoad(Button button){
        //String path="/Views/testpic.jpg";

        /*
        Image img = new Image("/Views/testpic.jpg");
        ImageView view = new ImageView(img);

        //Teszt Miatt
        button.setTranslateX(200);
        button.setTranslateY(25);
        //Setting the size of the button
        button.setPrefSize(80, 80);
        //Setting a graphic to the button
        button.setGraphic(view);
        */
        File file= new File("D:\\WORK\\EGYETEM\\3 FÉLÉV\\Swt\\PROJEKT FELADAT\\CODE\\SpeedCard\\SOURCE\\PROJECT\\src\\project\\media\\testpic.jpg");
        Image image = new Image (file.toURI().toString());
        ImageView view = new ImageView(image);
        view.setFitHeight(70);
        view.setPreserveRatio(true);
        card1_1Button.setGraphic(view);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imgLoad(card1_1Button);


    }

    @Override
    public void start(Stage stage) throws Exception {
/*
        String path="testpic.jpg";
        Image img = new Image(path);
        ImageView view = new ImageView(img);
        card1_1Button.setGraphic(view);

*/

    }

}
