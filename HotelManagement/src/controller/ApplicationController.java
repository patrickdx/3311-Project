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


    public ApplicationController() {
        defaultScreen = new DefaultScreen();

        // Initializing all screens
        screens[TypeOfScreen.MAIN_MENU_SCREEN.getNumber()] = new MainMenu();
        screens[TypeOfScreen.ROOM_SCREEN.getNumber()] = new RoomScreen();
        screens[TypeOfScreen.REQUEST_SCREEN.getNumber()] = new RequestScreen();




        // Creating controllers
        mainMenuController = new MainMenuController((MainMenu) screens[TypeOfScreen.MAIN_MENU_SCREEN.getNumber()]);
        roomController = new RoomScreenController((RoomScreen) screens[TypeOfScreen.ROOM_SCREEN.getNumber()]);
        requestController = new RequestController((RequestScreen) screens[TypeOfScreen.REQUEST_SCREEN.getNumber()]);

        //screenSwitching(screens[TypeOfScreen.MAIN_MENU_SCREEN.getNumber()]);

        // Setting up back button
        setupBackButton();

        defaultScreen.add(screens[TypeOfScreen.MAIN_MENU_SCREEN.getNumber()]);
        defaultScreen.setVisible(true);

        System.out.println("Application started");

    }

    private void setupBackButton() {
        for(int i = 0; i < TypeOfScreen.values().length -1; i++){

            screens[i].getBackButton().addActionListener(e ->
                    screenSwitching(screens[TypeOfScreen.MAIN_MENU_SCREEN.getNumber()]
                    )

                    );
            

        }
    }

    public static void screenSwitching(JPanel newScreen){
        System.out.println(newScreen);
        defaultScreen.getContentPane().removeAll();
        defaultScreen.getContentPane().repaint();
        defaultScreen.getContentPane().add(newScreen);

    }



}

