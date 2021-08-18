package chapterFourteen;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class PathFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a File name or a file Path");
        Path path = Paths.get(scanner.nextLine());
        System.out.println(File.separator);
    }
}
