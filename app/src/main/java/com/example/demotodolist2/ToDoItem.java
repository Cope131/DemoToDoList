package com.example.demotodolist2;

import java.util.Calendar;

public class ToDoItem {

    private String title;
    private Calendar date;

    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @Override
    //DATE FORMAT: month/day/year (day)
    public String toString() {
        return (date.get(Calendar.MONTH) + 1)
                + "/" + date.get(Calendar.DAY_OF_MONTH)
                + "/" + date.get(Calendar.YEAR)
                + " (" + getDay(date.get(Calendar.DAY_OF_WEEK)) + ")";
    }

    private String getDay(int d) {
        String day = "";
        switch(d) {
            case 1 : day = "Sunday"; break;
            case 2 : day = "Monday"; break;
            case 3 : day = "Tuesday"; break;
            case 4 : day = "Wednesday"; break;
            case 5 : day = "Thursday"; break;
            case 6 : day = "Friday"; break;
            case 7 : day = "Saturday";
        }
        return day;
    }

}
