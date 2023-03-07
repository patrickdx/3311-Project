package Rooms.Search;

public enum TypeOfScreen {
    
    
    MAIN_MENU_SCREEN(0),
    ROOM_SCREEN(1),
    //CUSTOMER_SCREEN(2),
    REQUEST_SCREEN(2);


    private int number;


    TypeOfScreen(int number)
        {
        this.number=number;
    }

    public int getNumber(){
        return number;
    }


}
