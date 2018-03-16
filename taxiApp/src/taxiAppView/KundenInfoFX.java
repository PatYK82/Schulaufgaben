package view;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class KundenInfoFX extends Application {

	@Override
	public void start(Stage stage) {

		Label auswahl = new Label("Auswahl des Fahrzeugstyps");
		Label entfernung = new Label("Entfernung");
		CheckBox nachfahrt = new CheckBox("Nachtfahrt (Zuschlag 10 %)");
		CheckBox kindersitz = new CheckBox("Kindersitz (Zuschlag 1 €)");
		CheckBox bar = new CheckBox("Bar (Zuschlag 15 €)");
		VBox box = new VBox(auswahl, entfernung, nachfahrt,kindersitz,bar);
		Pane pane = new Pane(box);
		Scene scene = new Scene(pane);
		stage.setTitle("Taxi");
		stage.setScene(scene);
		stage.show();
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
