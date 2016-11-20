import java.util.List;
public class Game{
  public static void main(String[] args){
    CharacterFactory cFactory = new KnightFactory();
    Character player =
      cFactory.createUnarmedCharacter("Sir Playsalot");
    GameEntitiesFactory gef = new NightmareEntitiesFactory();
    List<Character>    opponents = gef.createBadGuys();
    List<WeaponBehavior> weapons = gef.createWeapons();
    int weaponIndex=0;
    System.out.print(player);
    System.out.println(" enters the woods");
    for(Character c : opponents){
      System.out.println("<<<Oh no, not another one!");
      System.out.println(player + " meets " + c + " who attacks!");     
      while(c.health()>0){
        c.fight(player);
        sleep(200);
        player.fight(c);
        sleep(200);
        player.fight(c);
        sleep(200);
        player.fight(c);
        sleep(500);
      }
      System.out.println(c + " is now dead!!!!!!!!");
      sleep(3000);
      System.out.println("==============================");
      System.out.println(player + " finds a magic potion and drinks it");
      player.takeDamage(-100);
      if(weaponIndex < weapons.size()){
        System.out.println(player + " finds " +
                           weapons.get(weaponIndex)
                           + " and upgrades his weapon!");
        player.changeWeapon(weapons.get(weaponIndex));
        weaponIndex++;
      }
    }
    System.out.println("===========GAME OVER=============");
    System.out.println("Final score: " + player);
  }
  static void sleep(int millis){
    try{
      Thread.currentThread().sleep(millis);
    }catch(InterruptedException e){}
  }
}
