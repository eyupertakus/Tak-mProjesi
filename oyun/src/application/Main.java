package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Etiket (Label)
        Label label = new Label("Welcome to Cennet");

        // Buton
        Button button = new Button("Buraya tıklarsan sana yeni bir mesaj göstericem");

        // Butona tıklanınca yapılacak işlem
        button.setOnAction(e -> label.setText("Oyunumuza hoşgeldiniz, güvenliğiniz ve eğlenceniz önceliğimizdir"));

        // Dikey kutu yerleşimi
        VBox layout = new VBox(10); // 10 piksel aralık
        layout.getChildren().addAll(button, label);

        // Sahne oluşturma
        Scene scene = new Scene(layout, 400, 400);

        // Pencere ayarları
        primaryStage.setTitle("Kule Oyunu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
