package Advanced.Theads.Zeitansage;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

import javax.swing.*;

public class Zeitansage extends Application implements TimeListener {
    int second = 1;

    @Override
    public void signalPerformed() {
        System.out.println(second + " Sekunde seit start");
        second++;
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Thread t1 = new Thread(new Timer(this, 1000));
        t1.start();
        MessageView.create(stage, "Place Holder to Stop the counter in Console", "Stop the Counter").showView();
        t1.interrupt();
        Platform.exit();
    }
}
