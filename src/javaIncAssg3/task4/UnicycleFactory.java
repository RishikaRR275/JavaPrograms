package javaIncAssg3.task4;

public class UnicycleFactory implements CycleFactory {
    public Cycle getCycle(){
        return new Unicycle();
    }
}
