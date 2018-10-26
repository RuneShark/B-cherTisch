package BTP;

import java.util.Scanner;

public class BTP {
    public static void main (String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("gimme de articles");
        String output = scanner.nextLine();
        System.out.println("End " + output);

        XMLReader xmlReader = new XMLReader();
        xmlReader.readXML(output);

    }
}
