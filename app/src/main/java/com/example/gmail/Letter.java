package com.example.gmail;

public class Letter {
    public String letterFrom;
    public String letterTheme;
    public String letterBody;
    public String letterDate;

    public Letter(String letterFrom, String letterTheme, String letterBody, String date) {
        this.letterFrom = letterFrom;
        this.letterTheme = letterTheme;
        this.letterBody = letterBody;
        this.letterDate = date;
    }
}
