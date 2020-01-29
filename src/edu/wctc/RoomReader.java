package edu.wctc;

import java.io.*;
import java.util.ArrayList;

public class RoomReader {

    public ArrayList<Room> readRoomFile(String fileName) throws IOException,ClassNotFoundException {
        ArrayList<Room> roomList = new ArrayList<>();

        FileInputStream fis = new FileInputStream("cats.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object obj;

        try {
            while ((obj = ois.readObject()) != null)
            {
                Room aRoom = (Room)obj;
                roomList.add(aRoom);
            }}catch (EOFException e){}

        return roomList;

        }
    }

}
