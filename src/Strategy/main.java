package Strategy;

import Strategy.FlyableBehavior.FlyWithRocks;

public class main {

    public static void main(String[] args) {
        Duck d1 = new GreenDuck();
        d1.Walk();
        d1.Fly();
        d1.setFlyBehavior(new FlyWithRocks());
        d1.Fly();
    }
}
