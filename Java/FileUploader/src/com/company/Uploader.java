package com.company;
import java.time.LocalDateTime;

public class Uploader {
    private String fileId;
    private String fileName;
    private int fileSize;
    private String fileType;
    private LocalDateTime fileCreated;
    private static int fileCounter;

    public Uploader(String fileName, int fileSize, String fileType) {
        if(FileTypeChecker(fileType) && FileSizeChecker(fileSize)) {
            this.fileId = IdCreator(fileType);
            this.fileName = fileName;
            this.fileSize = fileSize;
            this.fileType = fileType;
            this.fileCreated = LocalDateTime.now();

            System.out.println("File successfully created on " + this.fileCreated);
        }
        else {
            System.out.println("Please upload a valid file.");
        }
    }

    private static String IdCreator(String fileType) {
        return fileType + "_" + ++fileCounter;
    }

    private boolean FileTypeChecker(String fileType) {
        try {
            if (fileType == "txt" || fileType == "doc" || fileType == "jpg" || fileType == "png") {
                return true;
            }
            throw new Exception();
        } catch (Exception e) {
            return false;
        }
    }

    private boolean FileSizeChecker(int fileSize) {
        try {
            if (fileSize > 0 && fileSize <= 5120) {
                return true;
            }
            throw new Exception();
        } catch (Exception e) {
            return false;
        }
    }
}
