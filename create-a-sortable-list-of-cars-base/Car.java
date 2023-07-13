public class Car implements Comparable<Car>{
    public int Price;
    public int Speed;

    public Car(){}
    public int getPrice(){
        return this.Price;
    }
    public int getSpeed(){
        return this.Speed;
    }

    @Override
    public int compareTo(Car othercar) {
        return this.Price - othercar.getPrice();
    }
}
