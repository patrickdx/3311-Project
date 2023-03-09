package controller;

import Rooms.Room;
import Rooms.RoomType;


import java.sql.*;
import java.util.ArrayList;

public class DBController {
    private static Connection con;
    private static Statement st;
    private static String query;
    private static final String DATABASE_NAME = "hotelmanagementdb";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "Confirm2.";

    public static void connect(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + DATABASE_NAME, USERNAME, PASSWORD);
            st = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }


    public static ArrayList<Room> getRooms() {
        ArrayList<Room> rooms = new ArrayList<>();
        try{
            query = "select * from room";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                String type = rs.getString("Type");
                int room_num = rs.getInt("number");
                boolean isBooked = rs.getString("STATUS").equals("BOOKED");
                rooms.add(new Room(room_num, RoomType.valueOf(type), isBooked));
            }
        }catch (SQLException e) {
            System.out.println(e);
        }
        return rooms;
    }

    
}
