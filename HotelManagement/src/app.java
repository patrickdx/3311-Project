import something.Main;
import view.DefaultScreen;
import view.MainMenu;
import view.Screen;

import java.awt.*;

public class app {
    private static DefaultScreen defaultScreen;


    public static  void main(String[] args) {

        //creating and showing this application's GUI.


        defaultScreen = new DefaultScreen();
        MainMenu menu =  new MainMenu();
        defaultScreen.add(menu);
        defaultScreen.setVisible(true);





    }
}
