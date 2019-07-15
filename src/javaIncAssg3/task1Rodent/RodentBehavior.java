package javaIncAssg3.task1Rodent;

public class RodentBehavior {
    public static void main(String[] args){

        Rodent[] rodents = {new Mouse(), new Gerbil(),new Hamster()};
        for(Rodent rodent : rodents){
            rodent.run();
            rodent.bite();
        }

    }
}
