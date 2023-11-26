package Strategy;

import Strategy.FlyableBehavior.FlyWithRocks;

public class BlueDuck extends Duck{
    // here we gonna make a constructor to specify the type of Fly that we want
    public BlueDuck(){
        this.flyBehavior=new FlyWithRocks();
    }

}
