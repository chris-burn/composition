package example.codeclan.com.composition_starter;

import behaviours.Flyable;
import behaviours.Protector;

public class Wizard {
  String name;
  Broomstick broomstick;
  private Flyable ride;
//  bringing in Interface, to be able to over-write fly method
  private Protector aide;

  public Wizard(String name, Flyable ride, Protector aide){
    this.name = name;
    this.ride = ride;
    this.aide = aide;
  }

  public String getName(){
    return this.name;
  }

  public Flyable getRide(){
    return this.ride;
  }

  public String fly(){
    return this.ride.fly();
  }

  public void setRide(Flyable ride) {
    this.ride = ride;
  }

  public void setProtector(Protector aide){
    this.aide = aide;
  }

  public String protect(){
    return this.aide.protect();
  }

}