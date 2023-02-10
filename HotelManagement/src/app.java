//import something.Main;
import Rooms.Main;
import view.MainMenu;
import view.customer.CustomerScreen;
import view.DefaultScreen;
import view.request.RequestScreen;
import view.room.RoomScreen;
import view.customer.addCustomerScreen;
import view.room.searchRoomScreen;
import view.room.viewRoomScreen;

public class app {
    private static DefaultScreen defaultScreen;


    public static  void main(String[] args) {

        //creating and showing this application's GUI.


        defaultScreen = new DefaultScreen();
         MainMenu screen = new MainMenu();
        defaultScreen.add(screen);
        defaultScreen.setVisible(true);




    }
}
