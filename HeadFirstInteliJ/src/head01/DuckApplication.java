package head01;

public class DuckApplication {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        // 모든 오리에 적용되는 함수
        mallard.swim();

        //인터페이스로 분리한 오리 행동들
        mallard.performFly();
        mallard.performQuack();

        //abstract를 통해서 클래스 각각 행동 구현
        mallard.display();
    }
}
