public interface CharacterFactory{
  public Character createCharacter(CharacterType character,
                                   WeaponType    weapon,
                                   String        name);
  public Character createUnarmedCharacter(CharacterType character,
                                          String        name);
}
