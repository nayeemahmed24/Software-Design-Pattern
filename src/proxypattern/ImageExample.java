package proxypattern;



import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;  
import javafx.scene.text.Text;
import javafx.stage.Stage;  



import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ImageExample extends Application {  
   static String filename;
    @Override 
   public void start(Stage stage) throws FileNotFoundException {         

       Image image = new Image(new FileInputStream(filename));  
      ImageView imageView = new ImageView(image); 

      imageView.setX(50); 
      imageView.setY(25); 
      imageView.setFitHeight(455); 
      imageView.setFitWidth(500); 

      imageView.setPreserveRatio(true);  
      
      Group root = new Group(imageView);  
      
      Scene scene = new Scene(root, 600, 500);  
      stage.setTitle("Loading an image");  
      
      Text text = new Text();      
      text.setText("Image is Loading"); 
      text.setX(50); 
      text.setY(50); 
      
      Group root1 = new Group(text);   
      Scene scene1 = new Scene(root1, 600, 300);  
      
      
      stage.setScene(scene1);
      
      stage.show(); 
      
      Task<Void> sleeper = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                }
                return null;
            }
        };
        sleeper.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
            @Override
            public void handle(WorkerStateEvent event) {
                   stage.setScene(scene);
      
            }
        });
        new Thread(sleeper).start();      
      
   }  
  
   
   static void kk(String filename,String args[]) { 
      ImageExample.filename = filename;
       launch(args); 
   } 
}