package example;

public class Hello {

  private final Integer totalTimes;

  public Hello(Integer num1, Integer num2, Integer num3) {
    this.totalTimes = num1 + num2 + num3;
  }

  String hello(String user) {
    return "Hello " + user + " " + this.totalTimes + " times!";
  }
}
