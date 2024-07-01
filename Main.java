import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * This class demonstrates file handling in Java: creating a file, writing to it,
 * and reading from it.
 */
public class Main {

    private static File myFile;

    /**
     * The main method of the program. It demonstrates file handling operations.
     *
     * @param args Command line arguments (not used in this program).
     * @throws IOException Signals that an I/O exception of some sort has occurred.
     * @throws InterruptedException Thrown when a thread is waiting, sleeping, or otherwise occupied, and the thread is interrupted, either before or during the activity.
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        createFile("src/fileName.txt");
        writeToFile();
        readFromFile();
    }

    /**
     * Creates a new file at the specified path if it does not already exist.
     *
     * @param filePath The path of the file to be created.
     * @throws IOException Signals that an I/O exception of some sort has occurred.
     */
    public static void createFile(String filePath) throws IOException {
        myFile = new File(filePath);
        if (myFile.createNewFile()) {
            System.out.println("File " + myFile.getName() + " created");
        } else {
            System.out.println("File already available.");
        }
    }

    /**
     * Writes a predefined text to the file created earlier.
     *
     * @throws IOException Signals that an I/O exception of some sort has occurred.
     */
    private static void writeToFile() throws IOException {
        FileWriter fileWriter = new FileWriter(myFile);
        fileWriter.write("""
                Learning Curve of any Programming language is measured by amount of hands 
                on projects to solidify the theoritical knowledge absorbed to make sense practically
                hands on projects plus theory scaled equally can improve coding competency.""");
        fileWriter.close();
    }

    /**
     * Reads the content of the file and prints it to the console.
     *
     * @throws FileNotFoundException Thrown if the specified file does not exist or cannot be read.
     * @throws InterruptedException Thrown when a thread is waiting, sleeping, or otherwise occupied, and the thread is interrupted, either before or during the activity.
     */
    private static void readFromFile() throws FileNotFoundException, InterruptedException {
        Scanner readFile = new Scanner(myFile);
        System.out.println("Reading file....");
        // Simulates a delay reading the file, printing numbers 1 to 5 with a 1 second delay.
        for (int i = 1; i < 6; i++) {
            Thread.sleep(1000);
            System.out.print(" " + i);
        }
        System.out.println();
        while (readFile.hasNextLine()) {
            String mydata = readFile.nextLine();
            System.out.println(mydata);
        }
        readFile.close(); // Close the scanner after reading
    }
}
