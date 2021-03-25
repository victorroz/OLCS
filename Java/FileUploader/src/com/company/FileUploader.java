package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileUploader {
    private static int fileId;
    private String filename, filetype;
    private int fileSize;
    private static String fileCreated;
    public int idset = fileId;

    public FileUploader(String filename, String filetype, int fileSize) {
        this.filename = filename;
        this.filetype = filetype;
        this.fileSize = fileSize;
    }
    public String FileIdCreator(){
        return this.filename += "." + "_" + this.filetype + this.idset;
    }
    public String FileTypeChecher () {
        try{
            if(this.filetype == "txt" || this.filetype == "jpg" || this.filetype == "png"|| this.filetype == "doc"){
                return this.filetype;
            }
            else{
                throw new Exception();
            }
        }catch (Exception err){
            System.out.println("File type not specified");
        }
        return "";
    }
    public int FileSizeChecker () {
        try{
            if (this.fileSize <= 5 && fileSize >= 0) {
                return this.fileSize;
            }
            else {
                throw new Exception();
            }
        }catch (Exception err){
            System.out.println("File size does not match the required limit!");
        }
        return 0;
    }
    public void ShowInfo(){
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter newTime = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String formattedDate = time.format(newTime);

        System.out.println("\nFile Name: " + FileIdCreator());
        System.out.println("File Type: " + FileTypeChecher());
        System.out.println("File Size: " + FileSizeChecker());
        System.out.println("Date Created: " + formattedDate);
    }
    public static int getFileId() {
        return fileId;
    }

    public static void setFileId(int fileId) {
        FileUploader.fileId = fileId;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileCreated() {
        return fileCreated;
    }

    public void setFileCreated(String fileCreated) {
        FileUploader.fileCreated = fileCreated;
    }
}
