package Rooms;

public enum RoomType {
    SINGLE(1, 100), DOUBLE(2, 300), SUITE(4, 600), PRESIDENTIAL_SUITE(2, 1000);

    public final int numBeds;
    public final int rate;     // price per night

    RoomType(int numBeds, int rate){
        this.numBeds = numBeds;
        this.rate = rate;
    }

    public int getSize(){
        return this.numBeds;
    }

    public int getRate() {
        return rate;
    }
}

