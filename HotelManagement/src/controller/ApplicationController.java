package controller;
import view.MainMenu;
import view.Screen;
import view.DefaultScreen;


import javax.swing.JPanel;

import Rooms.Search.TypeOfScreen;
import view.request.RequestScreen;
import view.room.RoomScreen;


public class ApplicationController {
    private static DefaultScreen defaultScreen;

    public static Screen[] screens = new Screen[TypeOfScreen.values().length];
    public static MainMenuController mainMenuController;
    public static RequestController requestController;
    public static RoomScreenController roomController;


    public ApplicationController(DefaultScreen defaultScreen) {
        this.defaultScreen = defaultScreen;


        screens[TypeOfScreen.MAIN_MENU_SCREEN.getNumber()] = new MainMenu();
        screens[TypeOfScreen.ROOM_SCREEN.getNumber()] = new RoomScreen();
        screens[TypeOfScreen.REGISTER_SCREEN.getNumber()] = new RequestScreen();

        mainMenuController = new MainMenuController((MainMenu) screens[TypeOfScreen.MAIN_MENU_SCREEN.getNumber()]);
        roomController = new RoomScreenController((RoomScreen) screens[TypeOfScreen.ROOM_SCREEN.getNumber()]);
        requestController = new RequestController((RequestScreen) screens[TypeOfScreen.REGISTER_SCREEN.getNumber()]);

        screenSwitching(screens[TypeOfScreen.MAIN_MENU_SCREEN.getNumber()]);

    }
    public static void screenSwitching(JPanel Nscreen){
        defaultScreen.getContentPane().removeAll();
        defaultScreen.getContentPane().repaint();
        defaultScreen.getContentPane().add(Nscreen);
    }



}

