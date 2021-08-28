package chapterFifteen.fileMatching;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileMatch {
    private static Formatter formatter;

    public static void openFile() {
        {
            Scanner input;
            String oldmastContent = "100 Alan Jones 348.17\n300 Mary Smith 27.19\n500 Sam Sharp 0.00\n700 Suzy Green –14.22";
            try {
                formatter = new Formatter("stone.txt");
                input = new Scanner(Paths.get("stone.txt"));
            } catch (FileNotFoundException ex) {

            } catch (IOException ex) {

            }

            formatter.format(oldmastContent);
            formatter.close();
        }
//            try
//            {
//               input = new Scanner(Paths.get(fileName));
//            }
//            catch (IOException er)
//            {
//                System.err.println("Error opening file. Terminating.");
//                System.exit(1);
//            }
//        }
    }
//
//    public static void closeFile() {
//        if (input != null) {
//            input.close();
//        }
//    }

    //    public void readFile() {
//        {
//            System.out.printf("%-10s%-12s%-12s%10s%n", "Account",
//                    "First Name", "Last Name", "Balance");
//            try
//            {
//                while ( input.hasNext() )
//                {
//                    System.out.printf("%-10d%-12s%-12s%10.2f%n", input.nextInt(),
//                            input.next(), input.next(), input.nextDouble());
//                }
//            }
//            catch (NoSuchElementException elementException)
//            {
//                System.err.println("File improperly formed. Terminating.");
//            }
//            catch (IllegalStateException stateException)
//            {
//                System.err.println("Error reading from file. Terminating.");
//            }
//        }
//    }
//        public static void addRecords()
//        {
//            Scanner input = new Scanner(System.in);
//            System.out.printf("%s%n%s%n? ",
//                    "Enter account number, first name, last name and balance.",
//                    "Enter end-of-file indicator to end input.");
//            while (input.hasNext())
//            {
//                try
//                {
//                    formatter.format("%d %s %s %.2f%n", input.nextInt(),
//                            input.next(), input.next(), input.nextDouble());
//                }
//                catch (FormatterClosedException er)
//                {
//                    System.err.println("Error writing to file. Terminating.");
//                    break;
//                }
//                catch (NoSuchElementException elementException)
//                {
//                    System.err.println("Invalid input. Please try again.");
//                    input.nextLine();
//                }
//                System.out.print("? ");
//            }
//        }
//
    public static void main(String[] args) {
        String fileName = "stone.txt";
        openFile();
        //addRecords();
        //closeFile();
    }
}
