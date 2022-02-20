package com.example.appinjavaattempt2;

public class ApplicationContext {

    private static ApplicationContext instance;

    private int extrovertCount;
    private int introvertCount;

    public static ApplicationContext getInstance() {
        if(instance == null) {
            instance = new ApplicationContext();
        }
        return instance;
    }

    private ApplicationContext() {
        this.extrovertCount = 0;
        this.introvertCount = 0;
    }

    public int getExtrovertCount() {
        return extrovertCount;
    }

    public int getIntrovertCount() {
        return introvertCount;
    }

    public void setExtrovertCount(int extrovertCount) {
        this.extrovertCount = extrovertCount;
    }

    public void setIntrovertCount(int introvertCount) {
        this.introvertCount = introvertCount;
    }

    public void incrementExtrovertCount () {
        this.extrovertCount++;

    }
    public void incrementIntrovertCount () {
        this.introvertCount++;
    }

    public void backToZeroPersonality () {
        this.extrovertCount = 0;
        this.introvertCount = 0;
    }
}
