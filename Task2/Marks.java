package com.company.GroupProject.Task2;

/* We have to calculate the average of marks obtained in three subjects by student A and by student B.
    Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
    Provide implementation of abstract method in classes 'A' and 'B'.
    The constructor of student A takes the marks in three subjects as its parameters
    and the marks in four subjects as its parameters for student B. Test your code*/

public abstract class Marks {
    int maths;
    int art;
    int history;
    int french;
    abstract void getPercentage();
}
class StudentA extends Marks {
    StudentA(int maths, int art, int history) {
        this.maths=maths;
        this.art=art;
        this.history=history;}

    @Override
    void getPercentage() {
        double avarage = (maths+art+history)/3;
        System.out.println("Average for studentA is: "+avarage);}}

class StudentB extends Marks {
    StudentB(int maths, int art, int history, int french) {
        this.maths=maths;
        this.art=art;
        this.history=history;
        this.french=french;}

    @Override
    void getPercentage() {
        double avarage = (maths+art+history+french)/4;
        System.out.println("Average for studentB is: "+avarage);}}