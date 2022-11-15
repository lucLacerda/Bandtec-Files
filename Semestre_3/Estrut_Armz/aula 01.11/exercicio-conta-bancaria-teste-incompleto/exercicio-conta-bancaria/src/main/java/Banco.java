public class Banco {

  // Atributos
  PilhaObj<Operacao> pilhaOperacao = new PilhaObj(10);
  FilaObj<Operacao> filaOperacao = new FilaObj(10);
  // Contador de operações empilhadas
  Integer contadorOperacao = 0;

  // Métodos

  /* Método debitar - recebe o valor a ser debitado e o objeto conta bancária
     Se o débito ocorreu com sucesso, cria um objeto Operacao com os valores adequados
     e empilha a operação para poder ser desfeita. Atualiza contadorOperacao.
   */
  public void debitar(Double valor, ContaBancaria conta) {

  }

  /* Método depositar - recebe o valor a ser debitado e o objeto conta bancária
     Executa o depósito, cria um objeto Operacao com os valores adequados
     e empilha a operação para poder ser desfeita. Atualiza contadorOperacao.
   */
  public void depositar(Double valor, ContaBancaria conta) {

  }

  /* Método desfazerOperacao - recebe a quantidade de operações a serem desfeitas
     Se essa quantidade for inválida, lança IllegalArgumentException
     Senão, "desfaz" a quantidade de operações passadas como argumento
     e atualiza o contadorOperacao
   */
  public void desfazerOperacao(Integer qtdOperacaoDesfeita) {

  }


  /* Método agendarOperacao - recebe o tipo da operaçõa, o valor e o objeto conta bancária
     Se um dos argumentos for inválido, lança IllegalArgumentException.
     Senão, cria um objeto Operacao e insere esse objeto na fila.
  */
  public void agendarOperacao(String tipoOperacao, Double valor, ContaBancaria conta) {

  }

  /* Método executarOperacoesAgendadas
     Se não houver operações na fila, exibe mensagem de que não há operações agendadas.
     Senão, esvazia a fila, executando cada uma das operações agendadas.
  */
  public void executarOperacoesAgendadas() {

  }

  // Gettens
  public PilhaObj<Operacao> getPilhaOperacao() {
    return null;
  }

  public FilaObj<Operacao> getFilaOperacao() {
    return null;
  }

  public Integer getContadorOperacao() {
    return null;
  }
}
