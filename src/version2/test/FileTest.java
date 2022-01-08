package version2.test;

import java.io.File;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String importFileDirectory;
            String importFileName;

            System.out.println(":-----------------------------:");
            System.out.println(":     ENTER THE FILE PATH     : ");
            System.out.println(":-----------------------------:");
            System.out.print("   >>>>: ");
            importFileDirectory = scanner.nextLine().trim();

            System.out.println(":-----------------------------:");
            System.out.println(":     ENTER THE FILE NAME     : ");
            System.out.println(":-----------------------------:");
            System.out.print("   >>>>: ");

            importFileName = scanner.nextLine().trim();
            File file = new File(importFileDirectory + importFileName + ".bin");

            if (file.exists()) {
                System.out.println("EXIST");
            }
            else
                System.out.println("NONE");
        }
    }
}
