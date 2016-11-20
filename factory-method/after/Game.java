public class Game{
  public static void main(String[] args){
    CharacterFactory cFactory = new TrollFactory();
    Character troll = 
      cFactory.createCharacter(WeaponType.CLUB,
                               "Lillfjant");
    cFactory = new KnightFactory();
    Character sirJames =
      cFactory.createCharacter(WeaponType.SWORD,
                               "Sir James");
    Character blackKnight =
      cFactory.createCharacter(WeaponType.UNARMED,
                               "Fistfighting Black Knight");
    cFactory = new OrchFactory();
    Character evilOrch =
      cFactory.createCharacter(WeaponType.SHOTGUN,
                               "Ugly scary Orch");
    Character unarmedOrch =
      cFactory.createUnarmedCharacter("Ugly scary unarmed Orch");
    System.out.println(troll);
    System.out.println(sirJames);
    System.out.println(blackKnight);
    System.out.println(evilOrch);
    System.out.println(unarmedOrch);
  }
}
