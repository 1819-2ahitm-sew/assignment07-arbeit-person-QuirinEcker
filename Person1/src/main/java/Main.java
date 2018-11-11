import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bewohner[] bewohner = new Bewohner[getLines("src/main/resources/personen.csv")];
        bewohner = readFile("src/main/resources/personen.csv", bewohner);
        showBewohner(bewohner);
    }

    private static void showBewohner(Bewohner[] bewohner) {
        for (int i = 0; i < bewohner.length; i++) {
            System.out.println(bewohner[i].getVorname() + ";" + bewohner[i].getNachnaem());
        }
    }

    private static Bewohner[] readFile(String fileName, Bewohner[] bewohner) {
        String[] parts;

        try(Scanner scanner = new Scanner(new FileReader(fileName))) {
            int i = 0;
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                parts = scanner.nextLine().split(";");
                bewohner[i] = new Bewohner(parts[0], parts[1]);
                i++;
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return bewohner;
    }

    private static int getLines(String fileName) {
        int counter = 0;

        try(Scanner scanner = new Scanner(new FileReader(fileName))) {
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                counter++;
                scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return counter;
    }
}
