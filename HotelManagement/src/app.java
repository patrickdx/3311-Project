import something.Main;
import view.MainMenu;
import view.customer.CustomerScreen;
import view.DefaultScreen;
import view.request.RequestScreen;
import view.room.RoomScreen;
import view.customer.addCustomerScreen;

public class app {
    private static DefaultScreen defaultScreen;


    public static  void main(String[] args) {

        //creating and showing this application's GUI.


        defaultScreen = new DefaultScreen();
        addCustomerScreen screen = new addCustomerScreen();
        defaultScreen.add(screen);
        defaultScreen.setVisible(true);





    }
}
