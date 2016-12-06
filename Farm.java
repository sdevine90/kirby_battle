import java.util.*;

public class Farm {
  
  private String name;
  private ArrayList<Edible> battle;


  public Farm(String name){
    this.name = name;
    this.battle = new ArrayList<Edible>();
  }

  public String getName(){
    return this.name;

  }

  public int brosCount(){
   return battle.size();
  }

  public void smash(Edible bros){
  battle.add(bros);
  }

  public Edible dance(){
    if (brosCount() > 0 ) {
      return battle.remove(0);
    }
      return null;
  }
 
}