package Strategy;

import Strategy.FlyableBehavior.FlyRestricted;

public class GreenDuck extends Duck{
    public String type="Green Duck";

    public GreenDuck(){
        this.flyBehavior= new FlyRestricted();
    }

}
