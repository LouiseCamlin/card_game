public enum ValueType {
  ONE(1),
  TWO(2);

  private final int value;

  private ValueType(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

}