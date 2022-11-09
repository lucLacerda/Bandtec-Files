public class Operacao {
  //01) Atributos
  private int id01;
  private int id02;

  //02) Construtor - complete
  public Operacao(int id01, int id02) {
    this.id01 = id01;
    this.id02 = id02;
  }

  //03) Getters e Setters
  public int getId01() {
    return id01;
  }

  public void setId01(int id01) {
    this.id01 = id01;
  }

  public int getId02() {
    return id02;
  }

  public void setId02(int id02) {
    this.id02 = id02;
  }
}
