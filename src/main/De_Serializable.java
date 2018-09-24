package main;

import java.io.*;

public class De_Serializable implements Serializable
{
    private int age = 23;
    private String name = "Oleg";
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        De_Serializable test = new De_Serializable();

        File file = new File("/home/oleg/test/Serializable/test.txt");

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream out = new ObjectOutputStream(fos);
        out.writeObject(test);

        out.flush();
        out.close();

        FileInputStream fis = new FileInputStream("/home/oleg/test/Serializable/test.txt");
        ObjectInputStream in = new ObjectInputStream(fis);
        De_Serializable newTest = (De_Serializable) in.readObject();
        System.out.println(newTest);
        in.close();

    }

}
