
import controller.ApplicationController;
import controller.DBController;
//import view.DefaultScreen;


public class app {

    public static  void main(String[] args) {

        //creating and showing this application's GUI.

        DBController.connect();

        new ApplicationController();


    }
}
