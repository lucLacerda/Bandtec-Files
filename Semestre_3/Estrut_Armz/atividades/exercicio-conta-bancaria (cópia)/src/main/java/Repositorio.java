import java.util.ArrayList;
import java.util.List;

public class Repositorio {
  // 01) Atributos
  private List<Pessoa> objetosTemaLivre;
  private PilhaObj<Operacao> pilhaOperacao;
  private FilaObj<Operacao> filaOperacao;

  // 02) Construtor, preencher conforme o enunciado
  public Repositorio() {
    this.objetosTemaLivre = new ArrayList<>(10);
    this.pilhaOperacao = new PilhaObj<>(10);
    this.filaOperacao = new FilaObj<>(10);
  }

  // 03) Método salvar
  public void salvar(Pessoa objetoAdicionar){
    objetosTemaLivre.add(objetoAdicionar);
  }

  // 04) Método deletarPorId
  public void deletarPorId(int id){
    for (int i = 0; objetosTemaLivre.size() > i; i++) {
      if(id == objetosTemaLivre.get(i).getId()) {
        objetosTemaLivre.remove(i);
        return;
      }
    }
    throw new IllegalArgumentException();
  }

  // 05) Método trocarData
  public void trocarData(int id1, int id2, boolean empilhar){
    Integer findId1 = null;
    Integer findId2 = null;

    for (int i = 0; i < objetosTemaLivre.size(); i++) {
      if(id1 == objetosTemaLivre.get(i).getId()) {
        findId1 = i;
      }
      if(id2 == objetosTemaLivre.get(i).getId()) {
        findId2 = i;
      }
    }

    if(findId1 == null || findId2 == null) {
      throw new IllegalArgumentException();
    }

    String guardaData2 = objetosTemaLivre.get(findId2).getData();
    objetosTemaLivre.get(findId2).setData(objetosTemaLivre.get(findId1).getData());
    objetosTemaLivre.get(findId1).setData(guardaData2);

    if(empilhar) {
      Operacao operacao = new Operacao(id1, id2);
      pilhaOperacao.push(operacao);
    }
  }

  // 06) Método desfazer
  public void desfazer(){
    if (pilhaOperacao.isEmpty()) {
      throw new IllegalStateException();
    }

    Operacao operacao = pilhaOperacao.pop();

    int findId1 = 0;
    int findId2 = 0;

    for(int i = 0; i < objetosTemaLivre.size(); i++) {
      if(operacao.getId01() == objetosTemaLivre.get(i).getId()) {
        findId1 = i;
      }
      if(operacao.getId02() == objetosTemaLivre.get(i).getId()) {
        findId2 = i;
      }
    }

    String guardaData2 = objetosTemaLivre.get(findId2).getData();
    objetosTemaLivre.get(findId2).setData(objetosTemaLivre.get(findId1).getData());
    objetosTemaLivre.get(findId1).setData(guardaData2);
  }

  // 07) Método agendarTrocaData
  public void agendarTrocaData(int id01, int id02){
    Operacao operacao = new Operacao(id01, id02);
    filaOperacao.insert(operacao);
  }

  // 8) Método executarAgendado
  public void executarAgendado(int qtdOperacoes){
    if(qtdOperacoes > filaOperacao.getTamanho() || qtdOperacoes < 0) {
      throw new IllegalArgumentException();
    }

    for(int i = 0; i < qtdOperacoes; i++) {
      Operacao operacao = filaOperacao.poll();
      trocarData(operacao.getId01(), operacao.getId02(), true);
    }
  }

  //GETTERS e SETTERS (Não alterar)
  public List<Pessoa> getObjetosTemaLivre() {
    return objetosTemaLivre;
  }

  public PilhaObj<Operacao> getPilhaOperacao() {
    return pilhaOperacao;
  }

  public FilaObj<Operacao> getFilaOperacao() {
    return filaOperacao;
  }
}
