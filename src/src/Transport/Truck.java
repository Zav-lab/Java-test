package Transport;

public class Truck extends Transport {


    private boolean isLoaded;
    public Engine engine = new Engine();
    public Truck(int speed, int weight, String color, byte[] coordinates) {
        super(weight, coordinates);
    }

    public Truck(int weight, byte[]coordinates,boolean isLoaded){

        super(weight, coordinates);
        this.isLoaded = isLoaded;

    }

    public void setValues(float speed, int weight, String color, byte[] coordinates, boolean isLoaded){
        super.setValues(speed, weight, color, coordinates);
        this.isLoaded = isLoaded;

    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Object is moving at a speed of" + speed);
    }

    @Override
    public boolean stopObject() {
        this.speed = 0;
        return true;
    }

    @Override
    protected String getValues() {
        System.out.println(super.getValues());
        return getLoaded();
    }

    public void setLoaded(boolean loaded) {
        this.isLoaded = loaded;
    }

    public String getLoaded() {
        if(isLoaded)
            return "Truck is loaded";
        else
            return "Truck is not loaded";
    }
}
