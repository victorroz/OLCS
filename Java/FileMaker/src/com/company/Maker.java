package com.company;

import java.time.LocalDateTime;
import java.io.FileWriter;
import java.io.IOException;

public class Maker {
    private String mId;
    private String mName;
    private String mContent;
    private LocalDateTime mCreated;
    private static int mCount;

    public Maker(String mName, String mType, String mContent) {
        if (TypeChecker(mType)) {
            this.SetMId(IdCreator(mType));
            this.SetMName(mName, mType);
            this.SetMContent(mContent);
            this.SetMCreated();
            this.MakeFile();
        } else {
            System.out.println("File type not supported.");
        }
    }

    public String GetMId() {
        return mId;
    }

    public void SetMId(String mId) {
        this.mId = mId;
    }

    public String GetMName() {
        return mName;
    }

    public void SetMName(String mName, String mType) {
        this.mName = mName + "." +mType;
    }

    public String GetMContent() {
        return mContent;
    }

    public void SetMContent(String mContent) {
        this.mContent = mContent;
    }

    public LocalDateTime GetMCreated() {
        return mCreated;
    }

    public void SetMCreated() {
        this.mCreated = LocalDateTime.now();
    }

    private static String IdCreator(String mType) {
        return (mType + ++mCount);
    }

    private boolean TypeChecker(String mType) {
        System.out.println("Type Checker");
        if (mType == "txt" || mType == "doc" || mType == "py") {
            return true;
        }
        return false;
    }

    private void MakeFile() {
        try {
            FileWriter fileWriter = new FileWriter(this.GetMName());
            fileWriter.write(this.GetMContent());
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }

    public void ShowInfo() {
        System.out.println("Filename: " + this.GetMName());
        System.out.println("Content: " + this.GetMContent());
        System.out.println("File Created on: " + this.GetMCreated());
    }
}
