public class SimpleCharacterFactory implements CharacterFactory{
  private static WeaponFactory weaponFactory 
    = new SimpleWeaponFactory();



  public Character createCharacter(CharacterType character,
                                   WeaponType weapon,
                                   String name){    
    switch(character){
    case TROLL:
      return new Troll(name, weaponFactory.createWeapon(weapon));
    case KNIGHT:
      return new Knight(name, weaponFactory.createWeapon(weapon));
    case ORCH:
      return new Orch(name, weaponFactory.createWeapon(weapon));
    default:
      return null; // can't happen
    }
  }
  public Character createUnarmedCharacter(CharacterType character,
                                          String name){    
    return createCharacter(character, WeaponType.UNARMED, name);
  }
}
