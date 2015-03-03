package edu.upc.eetac.dsa.igonzalez.Ejercicio4;


import java.io.File;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        BinaryIoClass testWrite = new BinaryIoClass(3, 7.5, 'a');
        testWrite.saveToFile("test-io-binary");

        BinaryIoClass testRead = BinaryIoClass.readFromFile("test-io-binary");
        System.out.println("integer = " + testRead.getInteger());
        System.out.println("decimal = " + testRead.getDecimal());
        System.out.println("char = " + testRead.getCharacter());

        File file = new File("test-io-binary");
        file.delete();
    }
}
