package javaIncAssg3.task2Cycle;

public class CycleMain {
    public static void main(String[] args){
        System.out.println("UPCASTING...");
        Cycle[] cycles = {new Unicycle(), new Bicycle(), new Tricycle()};
        for(Cycle cycle : cycles){
            System.out.println(cycle instanceof Cycle);
            cycle.balance();
           // CANT call cycle.balance IF there is no balance() method in Cycle
        }

        System.out.println();

        System.out.println("DOWNCASTING...");
        Cycle cycle1 = new Unicycle();
        Unicycle unicycle = (Unicycle) cycle1;
        unicycle.balance();

        Cycle cycle2 = new Bicycle();
        Bicycle bicycle = (Bicycle) cycle2;
        bicycle.balance();

        Cycle cycle3 = new Tricycle();
        Tricycle tricycle = (Tricycle) cycle3;

    }
}
