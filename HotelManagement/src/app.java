import something.Main;
import view.CustomerScreen;
import view.DefaultScreen;
import view.MainMenu;
import view.Screen;

import java.awt.*;

public class app {
    private static DefaultScreen defaultScreen;


    public static  void main(String[] args) {

        //creating and showing this application's GUI.


        defaultScreen = new DefaultScreen();
        CustomerScreen screen =  new CustomerScreen();
        defaultScreen.add(screen);
        defaultScreen.setVisible(true);





    }
}
