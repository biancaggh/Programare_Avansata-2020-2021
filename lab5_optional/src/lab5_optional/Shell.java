package lab5_optional;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shell {

    String commandLine;
    BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

    void shellProgram() throws IOException, InvalidCommandException, InvalidCatalogException {

        //
        while (true) {
            System.out.println("command>");
            commandLine = console.readLine();

            if (commandLine.equals("exit")) {
                System.exit(0);
            }
            if (commandLine.equals(""))
                continue;
            if (commandLine.equals("save")) {
                Catalog catalog = new Catalog("Catalog", "D:\\movies\\catalog.ser");
                Item item = new Movie("Hunger", 2008,7.6,"D:\\movies\\Hunger");
                catalog.add(item);
                saveCommand.save(catalog);

            }

            if (commandLine.equals("load")) {
                loadCommand.load("C:/Users/Asus/Desktop/PA/pa.ser");
            }
            if (commandLine.equals("list")) {
                Catalog catalog = new Catalog("Catalog", "D:\\movies\\catalog.ser");
                Item item = new Movie("Hunger", 2008,7.6,"D:\\movies\\Hunger");
                catalog.add(item);
                ListCommand.list(catalog);
            }
            if (commandLine.equals("clear")) {
                for (int index = 0; index < 15; index++) {
                    System.out.println();
                }
            }
            if (!(commandLine.equals("exit") || commandLine.equals("clear") || commandLine.equals("help")|| commandLine.equals("save")|| commandLine.equals("list")|| commandLine.equals("play")|| commandLine.equals("add") ||  commandLine.equals("load")|| commandLine.equals("report"))) {
                throw new InvalidCommandException(commandLine);
            }


        }
    }
}

