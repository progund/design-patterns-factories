class Main{
  public static void main(String[] args){
    CarFactory cf = new VolvoFactory();
    System.out.println(cf.createCar());
    cf = new BMWFactory();
    System.out.println(cf.createCar());
  }
}
abstract class Car{}
class Volvo extends Car{
  @Override
  public String toString(){ return "Volvo"; }
}
class BMW extends Car{
  @Override
  public String toString(){ return "BMW"; }
}
class VolvoFactory extends CarFactory{
  @Override
  protected Car makeIt(){
    return new Volvo();
  }
}
class BMWFactory extends CarFactory{
  @Override
  protected Car makeIt(){
    return new BMW();
  }
}
public abstract class CarFactory{
  // Virtual method
  public Car createCar(){
    return makeIt();
  }
  protected abstract Car makeIt();
}
