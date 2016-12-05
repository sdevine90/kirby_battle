import static org.junit.Assert.assertEquals;
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
  public void cannotSmashKirbyWhenBattleFull(){
    for (int i = 0; i < 4; i++){
      farm.smash(kirby);
    }
    assertEquals(4, farm.brosCount());
  }
}