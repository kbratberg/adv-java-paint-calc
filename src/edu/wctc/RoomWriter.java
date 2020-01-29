package edu.wctc;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class RoomWriter {
    public void writeRoomFile(String filename, ArrayList<Room> roomList) throws IOException {
        FileOutputStream fos = new FileOutputStream("rooms.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(roomList);


    }
}
