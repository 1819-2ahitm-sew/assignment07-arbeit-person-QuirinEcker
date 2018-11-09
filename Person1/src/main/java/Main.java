import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String text = readFile("src/main/resources/personen.csv");
        int lines = getLines("src/main/resources/personen.csv");
        System.out.println(text);
    }

    public static String readFile(String fileName) {
        StringBuilder sb = new StringBuilder();

        try(Scanner scanner = new Scanner(new FileReader(fileName))) {
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine());
                sb.append("\n");
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return sb.toString();
    }

    public static int getLines(String fileName) {
        int counter = 0;

        try(Scanner scanner = new Scanner(new FileReader(fileName))) {
            while (scanner.hasNextLine()) {
                counter++;
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return counter;
    }
}
