package javaIncAssg3.task1Rodent;

public class Gerbil extends Rodent {
    Gerbil(){
        System.out.println("GERBIL CLASS");
    }

    @Override
    public void bite(){
        System.out.println("Gerbil bites");
    }

    @Override
    public void run(){
        System.out.println("Gerbil runs");
    }
}
