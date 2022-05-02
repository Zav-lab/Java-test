package Transport;

public abstract class Transport {

    protected float speed;
    private int weight;
    private String color;
    private byte[] coordinates;

    public Transport(){}


    public Transport(float speed, int weight, String color, byte[] coordinates) {

        System.out.println("Object created");
        setValues(speed, weight, color, coordinates);
       // System.out.println(getValues());
    }
    public Transport(int weight, byte[] coordinates){
        this.weight = weight;
        this.coordinates = coordinates;
        //System.out.println(this.getValues());
    }

    public abstract void moveObject(float speed);
    public abstract boolean stopObject();


    protected void setValues(float speed, int weight, String color, byte[] coordinates){
        this.speed = speed;
       this.weight = weight;
        this.color = color;
        this.coordinates = coordinates;

    }
    protected String getValues(){
        String info = "Object speed: " + this.speed + ". Weight: " + this.weight + ". Color: " + this.color + "\n";
        String infoCoordinates = "Coordinates:\n";
        for(int i = 0; i < coordinates.length; i++){
            infoCoordinates += coordinates[i] + "\n";

        }
        return info + infoCoordinates;
    }

    class Engine {
        private boolean isReady;
        private int km;

        public void setValues(boolean isReady, int km){
            this.isReady = isReady;
            this.km = km;
        }

        public void  isReady(boolean isReady){
            this.isReady = isReady;
        }

        public void info(){
            if(isReady)
                System.out.println("Engine is working properly");
            else
                System.out.println("Engine is not working. He drove " + km + "km");
        }
    }

}
