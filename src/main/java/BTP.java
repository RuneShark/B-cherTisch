import java.util.Scanner;

import org.jdom2.*;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;
import org.xml.sax.InputSource;

public class BTP {
    public static void main (String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("gimme de articles");
        String output = scanner.nextLine();
        System.out.println("End " + output);

        SAXBuilder saxBuilder = new SAXBuilder();
        InputSource inputSource = new InputSource();
    }
}
