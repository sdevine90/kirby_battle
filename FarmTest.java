import static org.junit.Assert.*;
import org.junit.*;

public class FarmTest{
  Farm farm;
  Kirby kirby;


  @Before 
  public void before(){
    farm = new Farm("Super Smash Bros");
    kirby = new Kirby();
  } 

  @Test 
  public void hasName(){
    assertEquals("Super Smash Bros", farm.getName());
  }

  @Test
  public void battleStartsEmpty(){
    assertEquals(0, farm.brosCount());
  }

  @Test
  public void canSmashKirby(){
    farm.smash(kirby);
    assertEquals(1, farm.brosCount());
  }

  @Test 
  public void canDance(){
    farm.smash(kirby);
    Edible bros = farm.dance();
    Kirby original = (Kirby)bros;
    assertEquals("jiggling", original.jiggle());
  }
}