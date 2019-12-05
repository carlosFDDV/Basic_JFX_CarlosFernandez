package application;

import javafx.fxml.FXML;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class BlurController {
	
	@FXML
	private Pane pane;


	@FXML
    public void setblur() {           
             pane.setEffect(new GaussianBlur(50));

    }

	
	@FXML
    public void setfocus() {           
             pane.setEffect(new GaussianBlur(0));
	
	}

	
	@FXML
	private void handleClose() {
	
	        System.exit(0);
	}
}