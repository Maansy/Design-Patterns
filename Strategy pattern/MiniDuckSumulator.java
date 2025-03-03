public class MiniDuckSumulator {
    public static void main(String[] args){
        Duck mallard = new MallarDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        model.performQuack();
        model.setQuackBehavior(new MuteQuack());
        model.performQuack();
    }
    
}
