package gbingo;

import javafx.application.Application;
import org.rmj.appdriver.GRider;

public class LetMeInn {
    public static void main(String [] args){                
        GRider oApp = new GRider();
        
        if (!oApp.loadEnv("gRider")) {
            System.err.println(oApp.getErrMsg());
            System.exit(1);
        }
        
        if (!oApp.logUser("gRider", "M001111122")) {
            System.err.println(oApp.getErrMsg());
            System.exit(1);
        }   
        
        GriderGui instance = new GriderGui();
        instance.setGRider(oApp);
        
        Application.launch(instance.getClass());
    }
}