package MemberContainer;

import java.io.*;
import java.util.List;

public class ReadSerializedFile {
    public static void main(String[] args) {
        String filePath = "objects.ser"; // Der Pfad zu deiner .ser-Datei

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            List<Member> memberList = (List<Member>) ois.readObject();
            System.out.println("Gelesene Member:");
            for (Member member : memberList) {
                System.out.println(member);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

