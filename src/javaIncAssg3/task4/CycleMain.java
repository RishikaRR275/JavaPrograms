package javaIncAssg3.task4;

public class CycleMain {
    public static void rideCycle(CycleFactory factory) {
        Cycle cycle = factory.getCycle();
        cycle.ride();
    }
    public static void main(String [] args) {
        rideCycle(new UnicycleFactory());
        rideCycle(new BicycleFactory());
        rideCycle(new TricycleFactory());
    }
}
