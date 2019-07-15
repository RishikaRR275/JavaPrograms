package javaIncAssg3.task3;

public class OrderFoodMain {
    static  void orderStarters(Starter starter){
        starter.prepareStarter();
        starter.serveStarter();
    }

    static void orderMainCourse(MainCourse mainCourse){
        mainCourse.prepareMainCourse();
        mainCourse.serveMainCourse();
    }

    static void orderDesserts(Dessert dessert){
        dessert.prepareDessert();
        dessert.serveDessert();
    }

    static void doneEating(Food food){
        food.generateBill();
    }
    public static void main(String[] args){
        OrderFood orderFood = new OrderFood();
        orderStarters(orderFood);
        orderMainCourse(orderFood);
        orderDesserts(orderFood);
        doneEating(orderFood);
    }
}
