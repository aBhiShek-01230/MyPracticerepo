import org.junit.*;
public class GreetTest{
  @Test
  public void test(){
    Greet greet = new Greet();
    Assert.assertEquals("Hello", greet.says());
  }
}