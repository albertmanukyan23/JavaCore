package homework.fileutil;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtil {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Test of searchFile()");
        System.out.println(fileSearch());
        System.out.println("Test of contentSearch()");
        List<String> list = contentSearch();
        if (list.size() != 0) {
            for (String line : list) {
                System.out.println(line);
            }
        } else System.out.println("File Access error or not .txt file");
        System.out.println("Test of  printSizeOfPackage()");
        printSizeOfPackage();
        try {
            System.out.println("Test of  createFileWithContent()");
            createFileWithContent();
            System.out.println("Test of findLines()");
            List<String> lines = findLines();
            if (lines.size() != 0) {
                for (String line : lines) {
                    System.out.println(line);
                }
            } else System.out.println("Key wasn't found in file");

        } catch (IOException e) {
            System.out.println("File Access Error");
        }
    }

    static boolean fileSearch() {
        String folderPath = SCANNER.nextLine();
        String fileName = SCANNER.next();
        String path = folderPath + "//" + fileName;
        File file = new File(path);
        return file.exists();
    }

    static List<String> contentSearch() {
        List<String> content = new ArrayList<>();
        System.out.println("Input folder path");
        String folderPath = SCANNER.nextLine();
        System.out.println("Input key");
        String key = SCANNER.nextLine();
        File directory = new File(folderPath);
        if (directory.isDirectory()) {
            String[] fileNames = directory.list();
            for (String s : fileNames) {
                if (s.contains(key) && s.contains(".txt")) {
                    content.add(s);
                }
            }
        }
        return content;
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static List<String> findLines() throws IOException {
        List<String> lines = new ArrayList<>();
        System.out.println("Input file path");
        String filePath = SCANNER.nextLine();
        System.out.println("Input key");
        String key = SCANNER.next();
        File file = new File(filePath);
        if (file.isFile()) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(key)) {
                    lines.add(line);
                }
            }
            bufferedReader.close();
        }
        return lines;
    }

    static void printSizeOfPackage() {
        System.out.println("Input folder path");
        String path = SCANNER.nextLine();
        File directory = new File(path);
        if (directory.isDirectory()) {
            int size = 0;
            File[] files = directory.listFiles();
            for (File file1 : files) {
                if (file1.isFile()) {
                    size += file1.length();
                }
            }
            System.out.println("Size: " + size);
            return;
        }
        System.out.println("Directory did not found");
    }

    static void createFileWithContent() throws IOException {
        System.out.println("Input folder path");
        String folderPath = SCANNER.nextLine();
        System.out.println("Input file name");
        String filename = SCANNER.nextLine();
        System.out.println("Please input content");
        String content = SCANNER.nextLine();
        String filePath = folderPath + "\\" + filename;
        File createdFile = new File(filePath);
        if (createdFile.createNewFile()) {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
            bw.write(content);
            bw.close();
            System.out.println("File is created");
            return;
        }
        System.out.println("The file already exists");
    }
}

