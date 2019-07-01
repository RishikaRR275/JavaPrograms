package javaIncAssg3.task3;

public class OrderFood extends FoodItems implements Food {
    public void prepareStarter() {
        System.out.println("Starter prepared!");
    }

    public void serveStarter() {
        System.out.println("Starter served!");
    }

    public void prepareMainCourse() {
        System.out.println("Main COurse prepared!");
    }

    public void serveMainCourse() {
        System.out.println("Main Course served!");
    }

    public void prepareDessert() {
        System.out.println("Dessert prepared!");
    }

    @Override
    public void serveDessert() {
        System.out.println("Dessert served!");
    }

    @Override
    public void generateBill() {
        System.out.println("Bill Generated");
    }
}
