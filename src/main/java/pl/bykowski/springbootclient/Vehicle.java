package pl.bykowski.springbootclient;





public class Vehicle {


  private int id;

  private String brand;

  private String model;

  private String color;

  public Vehicle() {
  }

  public Vehicle(String brand, String model, String color) {
    this.brand = brand;
    this.model = model;
    this.color = color;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
