public class RaceCar {
    private int currentFuel;
    private int currentSpeed;
    private int speedLimit;
    private int maxFuelCapacity;

    public RaceCar() {
        currentFuel = 10;
        currentSpeed = 0;
        speedLimit = 100;
        maxFuelCapacity = 100;
    }
    public boolean increaseSpeed(int speedFactor)
    {
        if( currentSpeed + speedFactor > speedLimit)
            return false;

        currentSpeed = currentSpeed + speedFactor;
        return true;
    }
    public boolean decreaseSpeed(int speedFactor)
    {
        if( currentSpeed - speedFactor < 0 )
            return false;

        currentSpeed = currentSpeed - speedFactor;
        return true;
    }
    public boolean increaseFuel(int fuel)
    {
        if(currentFuel + fuel > maxFuelCapacity)
            return false;

        currentFuel = currentFuel + fuel;
        return true;
    }
    public boolean decreaseFuel(int fuel)
    {
        if(currentFuel - fuel < 0)
            return false;

        currentFuel = currentFuel - fuel;
        return true;
    }
    public void emptyFuel()
    {
        currentFuel = 0;
    }

    public int getSpeed() {
        return currentSpeed;
    }
    public int getFuel() {
        return currentFuel;
    }
}