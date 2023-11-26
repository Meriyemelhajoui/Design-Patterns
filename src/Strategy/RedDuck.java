package Strategy;

import Strategy.FlyableBehavior.FlyWithWIngs;

public class RedDuck extends Duck{

    public RedDuck(){
        this.flyBehavior= new FlyWithWIngs();
    }

}
