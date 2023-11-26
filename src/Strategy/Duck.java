package Strategy;

import Strategy.FlyableBehavior.FlyBehavior;

public class Duck {

   public  FlyBehavior flyBehavior;


    public void Fly(){
       this.flyBehavior.Fly();
    }

    // make a setter so a duck can change the behavior of flying
    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior=flyBehavior;
    }

    public void Walk(){
        System.out.println("I walk as a Duck ");
    }

}
