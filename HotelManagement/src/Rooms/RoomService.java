package Rooms;

import java.util.ArrayList;
import java.util.List;

public class RoomService {
    List<String> history;

    public RoomService(){
        history = new ArrayList<>();
    }

    public void request(String request){
        history.add(request);
    }

    public void cancelRequest(String request){
        history.remove(request);
    }

    public List<String> requestHistory(){
        return this.history;
    }

}
