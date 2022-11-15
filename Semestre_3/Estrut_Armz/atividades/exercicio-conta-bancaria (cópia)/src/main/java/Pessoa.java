  // 01) Renomeie o nome da classe através cliquando com direito na classe e em seguida 'Refactor'
  // Obs.: Não pode renomear escrevendo outro nome para classe direto nesse arquivo

  public class Pessoa {
  // 02) Atributos, adicione os demais atributos de acordo com sua classe sem alterar id e data
  private int id;
  private String data;
  private String nome;
  private Double altura;
  private int idade;


  // Obs.: Esse contrutor NÃO deve ser alterado, pois é usado nos testes
  public Pessoa(int id, String data) {
    this.id = id;
    this.data = data;
  }
  // 03) Crie um novo construtor (sobrecarga),
  // Esse deve ser cheio (receber todos os atributos criados na classe)
    public Pessoa(int id, String data, String nome, Double altura, int idade) {
      this.id = id;
      this.data = data;
      this.nome = nome;
      this.altura = altura;
      this.idade = idade;
    }

    // 04) Getters e Setters
    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public String getData() {
      return data;
    }

    public void setData(String data) {
      this.data = data;
    }

    public String getNome() {
      return nome;
    }

    public void setNome(String nome) {
      this.nome = nome;
    }

    public Double getAltura() {
      return altura;
    }

    public void setAltura(Double altura) {
      this.altura = altura;
    }

    public int getIdade() {
      return idade;
    }

    public void setIdade(int idade) {
      this.idade = idade;
    }
  }
