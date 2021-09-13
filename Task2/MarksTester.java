package com.company.GroupProject.Task2;

public class MarksTester {
    public static void main(String[] args) {
        Marks marksA = new StudentA( 60,80,70);
        marksA.getPercentage();

        Marks marksB = new StudentB(70,75,80,95);
        marksB.getPercentage();
    }
}
