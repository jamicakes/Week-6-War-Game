package warCardGame;

import java.util.List;

public enum Suit {
  HEART("♥"), DIAMOND("♦"), CLUB("♣"), SPADE("♠");

private static final List<Suit> suits = List.of(
    Suit.HEART, Suit.DIAMOND, Suit.CLUB, Suit.SPADE
);
private final String display;

private Suit(String display) {
  this.display = display;
}

public static Iterable<Suit> all() {
  return(suits);
}

@Override
public String toString() {
  return display;
  }
}