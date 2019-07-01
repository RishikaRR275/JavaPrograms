package javaIncAssg3.task1Rodent;

public class Hamster extends Rodent {
    Hamster(){
        System.out.println("HAMSTER CLASS");
    }

    @Override
    public void bite(){
        System.out.println("Hamster bites");
    }

    @Override
    public void run(){
        System.out.println("Hamster runs");
    }
}
