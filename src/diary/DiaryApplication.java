package diary;

import java.util.Arrays;
import java.util.Scanner;

public class DiaryApplication {
    private static Diary diary = new Diary("Wahala");
    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        String homepage = """
                1 -> Add new Entry
                2 -> Delete new Entry
                3 -> Find Entry by Title
                4 -> Exit Application
                 """;
        System.out.println(homepage);
        int userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                System.out.println("Wetin be the entry name:");
                String entryName = scanner.next();
                System.out.println("Wetin be the body:");
                String entryBody = scanner.next();
                diary.addEntry(entryName,entryBody);
                System.out.println("Success");
                System.out.println(Arrays.toString(diary.getAllEntries().toArray()));
                main();
                break;
            case 2:
                System.out.println("What do you want to delete");
                String entryTitle = scanner.nextLine();
                diary.deleteEntryByTitle(entryTitle);
                main();
            case 3:
                System.out.println("Wetin you wan entry name");
                entryName = scanner.next();
                Entry entry = diary.findEntryByTitle(entryName);
                System.out.println(entry);
                main();
                break;
            case 4:
                System.out.println("Bye Bye");
                System.exit(1);
            default:
                System.out.println("Enter a valid input");
                main();
        }

    }
}
