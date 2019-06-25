package ru.popovanton.plorum.javabasics;

import java.io.*;

public class SimpleFile {
    private File file;

    public File setFile(String filepath) throws IOException {
        file = new File(filepath);
        file.getParentFile().mkdirs();
        file.createNewFile();
        return file;
    }

    public void writeStringToFile(File file, String str) {
        try(FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fileWriter)) {
            bw.write(str);
        } catch (IOException e) {
            System.out.println("Exception throws while working with file");
            e.printStackTrace();
        }
    }

    public boolean removeFile(File file) {
        return file.delete();
    }

    public File getFile() {
        return file;
    }
}
