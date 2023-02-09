package Rooms;

import java.util.ArrayList;
import java.util.List;

public class RoomService {
    //Room roomNos = new Room();
    List<String> requestList;
    List<Integer> roomList;

    public RoomService(){
        requestList = new ArrayList<>();
        roomList = new ArrayList<>();
    }

    public void addRequest(String request, int roomNumber){
        requestList.add(request);
        roomList.add(roomNumber);

    }

    public void cancelRequest(String request, int roomNumber){
        requestList.remove(request);
        roomList.remove(roomNumber);
    }

    public List<String> requestHistory(){
        return this.requestList;
    }
    
    /*public List<String> viewRoomsWithRequest(){
        return 0;
        
    }/ */

}
