package controller;
<<<<<<< HEAD
import view.MainMenu;
import view.Screen;
import view.customer.CustomerScreen;
import view.DefaultScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import Rooms.Search.TypeOfScreen;
=======
import view.*;
import javax.swing.*;
>>>>>>> e0b2e97006f04d508a366a139d8267e81122d902

public class ApplicationController {
    private static DefaultScreen defaultScreen;

    public static Screen[] screens = new Screen[TypeOfScreen.values().length];
    public static MainMenuController mainMenuController;
    //public static 




    defaultScreen = new DefaultScreen();

    screens[ScreenType.MAIN_MENU_SCREEN.getValue()]= new MainMenuScreen();
    screens[ScreenType.ROOM_SCREEN.getValue()]= new RoomScreen();
    screens[ScreenType.REGISTER_SCREEN.getValue()]= new RegisterScreen();


    roomController = new roomController((RoomScreen) screens[TypeOfScreen.ROOM_SCREEN.getNumber()]);
    mainMenuController = new MainMenuController((MainMenuScreen) screens[TypeOfScreen.MAIN_MENU_SCREEN.getNumber()]);
    registerController = new registerController((RegisterScreen) screens[TypeOfScreen.REGISTER_SCREEN.getNumber()]);


    public static void screenSwitching(JPanel Nscreen){

        defaultScreen.getContentPane().removeAll();
        defaultScreen.getContentPane().repaint();
        defaultScreen.getContentPane().add(Nscreen);
    }



}

