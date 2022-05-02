package Transport;

public class Car extends Transport implements ILight{

    private boolean isOn = false;
    public Engine engine = new Engine();

    public Car(float speed, int weight, String color, byte[] coordinates) {

        super(speed, weight, color, coordinates);



    }
    public Car() {}

    @Override
    public void moveObject(float speed) {
        System.out.println("Object is moving at a speed of " + speed);

    }

    @Override
    public boolean stopObject() {
        return false;
    }


    @Override
    public void serLight(boolean set) {
        this.isOn = set;

    }

    @Override
    public void blinkLight() {
        System.out.println("Мы моргаем фарами");

    }
}
