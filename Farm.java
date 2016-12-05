public class Farm {
  private String name;

  private Kirby[] battle;


  public Farm(String name){
    this.name = name;
    this.battle = new Kirby[4];
  }

  public String getName(){
    return this.name;

  }

  public int brosCount(){
    int count = 0;
    for (Kirby kirby : battle){
      if (kirby != null){
        count++;
      }
    }
    return count;
  }

  public void smash(Kirby kirby){
    if (battleFull()){
      return;
    }
    int brosCount = brosCount();
    battle[brosCount] = kirby;
  }

  public boolean battleFull(){
    return brosCount() == battle.length;
  }

}