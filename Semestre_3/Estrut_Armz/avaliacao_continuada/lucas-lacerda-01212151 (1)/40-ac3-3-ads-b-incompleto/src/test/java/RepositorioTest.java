import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepositorioTest {

  @Test
  @DisplayName("salvar - Deve inserir o objeto na lista")
  public void salvar(){
    Carro temaLivreObjetoTest = new Carro(1, 10.00);

    Repositorio repositorioTest = new Repositorio();

    repositorioTest.salvar(temaLivreObjetoTest);

    assertEquals(1, repositorioTest.getObjetosTemaLivre().size());
    assertEquals(1, repositorioTest.getObjetosTemaLivre().get(0).getId());
    assertEquals(10.00, repositorioTest.getObjetosTemaLivre().get(0).getValor());
  }

  @Test
  @DisplayName("salvar - Não deve alterar a Pilha")
  public void salvarPilha(){
    Carro temaLivreObjetoTest = new Carro(1, 10.0);

    Repositorio repositorioTest = new Repositorio();

    repositorioTest.salvar(temaLivreObjetoTest);

    assertTrue(repositorioTest.getPilhaOperacao().isEmpty());
    assertEquals(0, repositorioTest.getContadorOperacoesPilha());
  }

  @Test
  @DisplayName("salvar - Não deve alterar a Fila")
  public void salvarFila(){
    Carro temaLivreObjetoTest = new Carro(1, 10.0);

    Repositorio repositorioTest = new Repositorio();

    repositorioTest.salvar(temaLivreObjetoTest);

    assertTrue(repositorioTest.getFilaIds().isEmpty());
  }

  @Test
  @DisplayName("deletarPorId - Deve remover objeto da lista")
  public void deletarPorId(){
    Carro temaLivreObjetoTest01 = new Carro(1, 10.0);
    Carro temaLivreObjetoTest02 = new Carro(2, 20.0);
    Carro temaLivreObjetoTest03 = new Carro(3, 30.0);

    Repositorio repositorioTest = new Repositorio();

    repositorioTest.salvar(temaLivreObjetoTest01);
    repositorioTest.salvar(temaLivreObjetoTest02);
    repositorioTest.salvar(temaLivreObjetoTest03);

    repositorioTest.deletarPeloId(1);

    assertEquals(2, repositorioTest.getObjetosTemaLivre().size());
    assertEquals(2, repositorioTest.getObjetosTemaLivre().get(0).getId());
    assertEquals(20.0, repositorioTest.getObjetosTemaLivre().get(0).getValor());
  }

  @Test
  @DisplayName("deletarPorId - Deve retornar IllegalArgumentException caso id informado não exista na lista")
  public void deletarPorIdException(){
    Repositorio repositorioTest = new Repositorio();
    assertThrows(IllegalArgumentException.class, () -> repositorioTest.deletarPeloId(100));
  }

  @Test
  @DisplayName("aumentarValorPeloId - Deve alterar valor de acordo com id")
  public void aumentarValorPeloId(){
    Carro temaLivreObjetoTest01 = new Carro(1, 10.0);
    Carro temaLivreObjetoTest02 = new Carro(2, 20.0);

    Repositorio repositorioTest = new Repositorio();

    repositorioTest.salvar(temaLivreObjetoTest01);
    repositorioTest.salvar(temaLivreObjetoTest02);

    repositorioTest.aumentarValorPeloId(1,40.0);

    assertEquals(50.0, repositorioTest.getObjetosTemaLivre().get(0).getValor());
    assertEquals(1, repositorioTest.getObjetosTemaLivre().get(0).getId());
  }

  @Test
  @DisplayName("aumentarValorPeloId - Deve retornar IllegalArgumentException caso o id não exista na lista")
  public void aumentarValorPeloIdIdNulo(){
    Carro temaLivreObjetoTest01 = new Carro(1, 10.0);
    Carro temaLivreObjetoTest02 = new Carro(2, 20.0);

    Repositorio repositorioTest = new Repositorio();

    repositorioTest.salvar(temaLivreObjetoTest01);
    repositorioTest.salvar(temaLivreObjetoTest02);

    assertThrows(IllegalArgumentException.class, () -> repositorioTest.aumentarValorPeloId(100,40.0));
  }

  @Test
  @DisplayName("aumentarValorPeloId - Deve empilhar operação")
  public void aumentarValorPeloIdEmpilha(){
    Carro temaLivreObjetoTest01 = new Carro(1, 10.0);
    Carro temaLivreObjetoTest02 = new Carro(2, 20.0);

    Repositorio repositorioTest = new Repositorio();

    repositorioTest.salvar(temaLivreObjetoTest01);
    repositorioTest.salvar(temaLivreObjetoTest02);

    repositorioTest.aumentarValorPeloId(1, 40.0);

    assertEquals(0, repositorioTest.getPilhaOperacao().getTopo());
    assertEquals(1,repositorioTest.getPilhaOperacao().peek().getId());
    assertEquals(40.0,repositorioTest.getPilhaOperacao().peek().getValorDeAumento());
    assertFalse(repositorioTest.getPilhaOperacao().isEmpty());
    assertEquals(1, repositorioTest.getContadorOperacoesPilha());
  }

  @Test
  @DisplayName("desfazer - Deve diminuir o valor aumentado de acordo com id do topo da pilha")
  public void desfazer(){
    Carro temaLivreObjetoTest01 = new Carro(1, 10.0);
    Carro temaLivreObjetoTest02 = new Carro(2, 20.0);
    Carro temaLivreObjetoTest03 = new Carro(3, 30.0);
    Carro temaLivreObjetoTest04 = new Carro(4, 40.0);

    Repositorio repositorioTest = new Repositorio();

    repositorioTest.salvar(temaLivreObjetoTest01);
    repositorioTest.salvar(temaLivreObjetoTest02);
    repositorioTest.salvar(temaLivreObjetoTest03);
    repositorioTest.salvar(temaLivreObjetoTest04);

    repositorioTest.aumentarValorPeloId(1, 40.0);
    repositorioTest.aumentarValorPeloId(2, 10.0);
    repositorioTest.aumentarValorPeloId(3, 5.0);

    repositorioTest.desfazer(2);

    assertEquals(50.0, repositorioTest.getObjetosTemaLivre().get(0).getValor());
    assertEquals(20.0, repositorioTest.getObjetosTemaLivre().get(1).getValor());
    assertEquals(30.0, repositorioTest.getObjetosTemaLivre().get(2).getValor());
  }

  @Test
  @DisplayName("desfazer - Deve retornar IllegalStateException caso pilha esteja vazia")
  public void desfazerException(){
    Repositorio repositorioTest = new Repositorio();
    assertThrows(IllegalStateException.class, () -> repositorioTest.desfazer(1));
  }

  @Test
  @DisplayName("desfazer - Deve retornar IllegalArgumentException caso qtdOperacoesADesfazer seja negativo")
  public void desfazerQtdOperacoesADesfazerNegativo(){
    Carro temaLivreObjetoTest01 = new Carro(1, 10.0);
    Carro temaLivreObjetoTest02 = new Carro(2, 20.0);
    Carro temaLivreObjetoTest03 = new Carro(3, 30.0);
    Carro temaLivreObjetoTest04 = new Carro(4, 40.0);

    Repositorio repositorioTest = new Repositorio();

    repositorioTest.salvar(temaLivreObjetoTest01);
    repositorioTest.salvar(temaLivreObjetoTest02);
    repositorioTest.salvar(temaLivreObjetoTest03);
    repositorioTest.salvar(temaLivreObjetoTest04);

    repositorioTest.aumentarValorPeloId(1, 40.0);
    repositorioTest.aumentarValorPeloId(2, 10.0);
    repositorioTest.aumentarValorPeloId(3, 5.0);

    assertThrows(IllegalArgumentException.class, () -> repositorioTest.desfazer(-1));
  }

  @Test
  @DisplayName("desfazer - Deve retornar IllegalArgumentException caso qtdOperacoesADesfazer seja maior que contadorOperacoesPilha")
  public void desfazerQtdOperacoesADesfazerMaiorQuePilha(){
    Carro temaLivreObjetoTest01 = new Carro(1, 10.0);
    Carro temaLivreObjetoTest02 = new Carro(2, 20.0);

    Repositorio repositorioTest = new Repositorio();

    repositorioTest.salvar(temaLivreObjetoTest01);
    repositorioTest.salvar(temaLivreObjetoTest02);

    repositorioTest.aumentarValorPeloId(1, 40.0);
    repositorioTest.aumentarValorPeloId(2, 10.0);

    assertThrows(IllegalArgumentException.class, () -> repositorioTest.desfazer(3));
  }

  @Test
  @DisplayName("desfazer - Deve decrementar contadorOperacoesPilha caso operação seja desfeita")
  public void desfazerDiminuiPilha(){
    Carro temaLivreObjetoTest01 = new Carro(1, 10.0);
    Carro temaLivreObjetoTest02 = new Carro(2, 20.0);
    Carro temaLivreObjetoTest03 = new Carro(3, 30.0);

    Repositorio repositorioTest = new Repositorio();

    repositorioTest.salvar(temaLivreObjetoTest01);
    repositorioTest.salvar(temaLivreObjetoTest02);
    repositorioTest.salvar(temaLivreObjetoTest03);

    repositorioTest.aumentarValorPeloId(1, 40.0);
    repositorioTest.aumentarValorPeloId(2, 10.0);
    repositorioTest.aumentarValorPeloId(3, 5.0);

    repositorioTest.desfazer(2);

    assertEquals(1, repositorioTest.getContadorOperacoesPilha());
  }

  @Test
  @DisplayName("agendarDeletarPorId - Deve inserir id na Fila")
  public void agendaTrocaData(){
    Carro temaLivreObjetoTest01 = new Carro(1, 10.0);
    Carro temaLivreObjetoTest02 = new Carro(2, 20.0);

    Repositorio repositorioTest = new Repositorio();

    repositorioTest.agendarDeletarPorId(1);
    repositorioTest.agendarDeletarPorId(2);

    assertEquals(1, repositorioTest.getFilaIds().peek());
    assertEquals(2, repositorioTest.getFilaIds().getTamanho());
    assertFalse(repositorioTest.getFilaIds().isEmpty());
  }

  @Test
  @DisplayName("agendaTrocaData - Não deve alterar lista")
  public void agendaTrocaDataLista(){
    Carro temaLivreObjetoTest01 = new Carro(1,10.0);

    Repositorio repositorioTest = new Repositorio();

    repositorioTest.agendarDeletarPorId(1);

    assertEquals(0, repositorioTest.getObjetosTemaLivre().size());
    assertTrue(repositorioTest.getObjetosTemaLivre().isEmpty());
  }

  @Test
  @DisplayName("executarAgendado - Deve deletar o primeiro id da Fila")
  public void executarAgendado(){
    Carro temaLivreObjetoTest01 = new Carro(1, 10.0);
    Carro temaLivreObjetoTest02 = new Carro(2, 20.0);
    Carro temaLivreObjetoTest03 = new Carro(3, 30.0);
    Carro temaLivreObjetoTest04 = new Carro(4, 40.0);
    Carro temaLivreObjetoTest05 = new Carro(5, 50.0);

    Repositorio repositorioTest = new Repositorio();
    repositorioTest.salvar(temaLivreObjetoTest01);
    repositorioTest.salvar(temaLivreObjetoTest02);
    repositorioTest.salvar(temaLivreObjetoTest03);
    repositorioTest.salvar(temaLivreObjetoTest04);
    repositorioTest.salvar(temaLivreObjetoTest05);

    repositorioTest.agendarDeletarPorId(3);
    repositorioTest.agendarDeletarPorId(4);

    repositorioTest.executarAgendado();

    assertEquals(4, repositorioTest.getObjetosTemaLivre().get(2).getId());
    assertEquals(40.0, repositorioTest.getObjetosTemaLivre().get(2).getValor());

    assertEquals(5, repositorioTest.getObjetosTemaLivre().get(3).getId());
    assertEquals(50.0, repositorioTest.getObjetosTemaLivre().get(3).getValor());
  }

  @Test
  @DisplayName("executarAgendado - Deve retirar da fila ao executar")
  public void executarAgendadoFila(){
    Carro temaLivreObjetoTest01 = new Carro(1, 10.0);
    Carro temaLivreObjetoTest02 = new Carro(2, 20.0);
    Carro temaLivreObjetoTest03 = new Carro(3, 30.0);
    Carro temaLivreObjetoTest04 = new Carro(4, 40.0);
    Carro temaLivreObjetoTest05 = new Carro(5, 50.0);

    Repositorio repositorioTest = new Repositorio();
    repositorioTest.salvar(temaLivreObjetoTest01);
    repositorioTest.salvar(temaLivreObjetoTest02);
    repositorioTest.salvar(temaLivreObjetoTest03);
    repositorioTest.salvar(temaLivreObjetoTest04);
    repositorioTest.salvar(temaLivreObjetoTest05);

    repositorioTest.agendarDeletarPorId(3);
    repositorioTest.agendarDeletarPorId(4);

    repositorioTest.executarAgendado();

    assertEquals(4, repositorioTest.getFilaIds().peek());
    assertFalse(repositorioTest.getFilaIds().isEmpty());
    assertEquals(1,repositorioTest.getFilaIds().getTamanho());
  }

  @Test
  @DisplayName("executarAgendado - Deve retornar IllegalStateException caso fila esteja vazia")
  public void executarAgendadoException(){
    Repositorio repositorioTest = new Repositorio();
    assertThrows(IllegalStateException.class, () -> repositorioTest.executarAgendado());
  }

}
