package javaIncAssg3.task4;

public class TricycleFactory implements CycleFactory {
    public Cycle getCycle(){
        return new Tricycle();
    }
}
