package com.example.loreentaskmnger.data;

public class MyTask {
    private String Key;
    private String tittle;
    private String subject;
    private int important,necessary;

    public String getKey() {
        return Key;
    }

    public String getTittle() {
        return tittle;
    }

    public String getSubject() {
        return subject;
    }

    public int getImportant() {
        return important;
    }

    public int getNecessary() {
        return necessary;
    }

    public void setKey(String key) {
        Key = key;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setImportant(int important) {
        this.important = important;
    }

    public void setNecessary(int necessary) {
        this.necessary = necessary;
    }

    @Override
    public String toString() {
        return "MyTask{" +
                "Key='" + Key + '\'' +
                ", tittle='" + tittle + '\'' +
                ", subject='" + subject + '\'' +
                ", important=" + important +
                ", necessary=" + necessary +
                '}';
    }
}

