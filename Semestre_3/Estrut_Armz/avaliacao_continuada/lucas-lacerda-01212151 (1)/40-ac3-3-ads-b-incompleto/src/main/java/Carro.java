// Renomeie o nome da classe através cliquando com direito na classe e em seguida 'Refactor'
// Obs.: Não pode renomear escrevendo outro nome para classe direto nesse arquivo
public class Carro {
  //Atributos
  //Adicione os demais atributos de acordo com sua classe sem alterar id e valor
  private int id;
  private Double valor;

  private String nome;

  private Double potencia;

  private int qtdPortas;

  private String marca;

  public Carro(int id, Double valor, String nome, Double potencia, int qtdPortas, String marca) {
    this.id = id;
    this.valor = valor;
    this.nome = nome;
    this.potencia = potencia;
    this.qtdPortas = qtdPortas;
    this.marca = marca;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Double getPotencia() {
    return potencia;
  }

  public void setPotencia(Double potencia) {
    this.potencia = potencia;
  }

  public int getQtdPortas() {
    return qtdPortas;
  }

  public void setQtdPortas(int qtdPortas) {
    this.qtdPortas = qtdPortas;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  // Obs.: Esse contrutor NÃO deve ser alterado, pois é usado nos testes
  public Carro(int id, Double valor) {
    this.id = id;
    this.valor = valor;
  }

  // Crie um novo construtor (sobrecarga),
  // Esse deve ser cheio (receber todos os atributos criados na classe)

  //Complete os getters e setters sem alterar os existentes
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }
}
