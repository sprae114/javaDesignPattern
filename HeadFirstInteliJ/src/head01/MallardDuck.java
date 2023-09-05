package head01;


import head01.fly.FlyWithWings;
import head01.quack.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리 입니다.");
    }
}
