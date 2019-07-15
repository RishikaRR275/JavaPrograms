package javaIncAssg3.task4;

public class BicycleFactory implements CycleFactory {
    public Cycle getCycle(){
        return new Bicycle();
    }
}
