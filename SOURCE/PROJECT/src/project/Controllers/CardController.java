package project.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.application.Application;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import project.Model.AffectCard;
import project.Model.CardObject;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class CardController extends Application implements Initializable {

    /*
    A metódussal rendelkező kártyákat kezeli
     */

    @FXML
    public Label des_Label;

    @FXML
    public Label crystal_Label;

    @FXML
    public Label name_Label;

    @FXML
    public ImageView card_Img;

    @FXML
    private Button downButton;

    @FXML
    public Button play_Button;

    AffectCard ac=new AffectCard("Your ground unite get 3 more attack point.",2,0,50,"Attack Boost","src\\project\\media\\card1.jpg");

    @Override
    public void start(Stage stage) throws Exception {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        LabelWithout(ac);
    }

    public void setCardStyle(ImageView viewImage, String path)
    {
        File file= new File(path);
        Image image = new Image (file.toURI().toString());
        viewImage.setImage(image);
        viewImage.setPreserveRatio(false);
        viewImage.setFitWidth(150);
        viewImage.setFitHeight(250);
    }

    public void LabelWithout(AffectCard card)
    {
        name_Label.setText(card.getName());
        des_Label.setText(card.getDescription());
        crystal_Label.setText(String.valueOf(card.getPrice()));
        setCardStyle(card_Img, card.getImgPath());
    }


    @FXML
    private void downFunction(ActionEvent event)
    {
        Stage stage = (Stage) downButton.getScene().getWindow();
        stage.close();
    }
}
