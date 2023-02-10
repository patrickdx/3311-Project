//import something.Main;
import controller.ApplicationController;
import view.DefaultScreen;

public class app {

    public static  void main(String[] args) {

        //creating and showing this application's GUI.

        DefaultScreen  defaultScreen = new DefaultScreen();
        ApplicationController app_controller = new ApplicationController(defaultScreen);
        defaultScreen.setVisible(true);


    }
}
