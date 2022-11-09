import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilaTest {
  @Test
  @DisplayName("isFull - Deve retornar true quando fila estiver cheia")
  public void isFullTrueQuandoFilaCheia() {
    FilaObj<Integer> filaTest = new FilaObj(3);

    filaTest.insert(10);
    filaTest.insert(20);
    filaTest.insert(30);

    assertTrue(filaTest.isFull());
  }

  @Test
  @DisplayName("isFull - Deve retornar false quando fila não estiver cheia")
  public void isFullTrueQuandoFilaNaoCheia() {
    FilaObj<Integer> filaTest = new FilaObj(5);

    filaTest.insert(10);
    filaTest.insert(20);
    filaTest.insert(30);
    assertFalse(filaTest.isFull());
  }

  @Test
  @DisplayName("isFull - Deve retornar false quando fila estiver vazia")
  public void isFullTrueQuandoFilaVazia() {
    FilaObj<Integer> filaTest = new FilaObj(5);
    assertFalse(filaTest.isFull());
  }

  @Test
  @DisplayName("isEmpty - Deve retornar true quando fila estiver vazia")
  public void isEmptyQuandoFilaVazia() {
    FilaObj<Integer> filaTest = new FilaObj(5);
    assertTrue(filaTest.isEmpty());
  }

  @Test
  @DisplayName("isEmpty - Deve retornar false quando fila não estiver vazia")
  public void isEmptyQuandoFilaNaoVazia() {
    FilaObj<Integer> fila = new FilaObj(8);
    fila.insert(10);
    fila.insert(20);
    fila.insert(30);
    assertFalse(fila.isEmpty());
  }

  @Test
  @DisplayName("isEmpty - Deve retornar false quando fila estiver cheia")
  public void isEmptyQuandoFilaCheia() {
    FilaObj<Integer> fila = new FilaObj(3);
    fila.insert(10);
    fila.insert(20);
    fila.insert(30);
    assertFalse(fila.isEmpty());
  }

  @Test
  @DisplayName("peek - Deve retornar primeiro elemento")
  public void peek() {
    FilaObj<Integer> pilhaTest = new FilaObj(6);
    pilhaTest.insert(10);
    pilhaTest.insert(20);
    pilhaTest.insert(30);
    assertEquals(10, pilhaTest.peek());
  }

  @Test
  @DisplayName("peek - Deve retornar null quando fila vazia")
  public void peekFilaVazia() {
    FilaObj<Integer> pilhaTest = new FilaObj(3);
    assertEquals(null, pilhaTest.peek());
  }

  @Test
  @DisplayName("pool - Deve primeiro elemento")
  public void poolRetorno() {
    FilaObj<Integer> filaTest = new FilaObj(3);
    filaTest.insert(10);
    filaTest.insert(20);
    filaTest.insert(30);
    assertEquals(10, filaTest.poll());
  }

  @Test
  @DisplayName("pool - Deve decrementar tamanho")
  public void poolTamanho() {
    FilaObj<Integer> filaTest = new FilaObj(3);
    filaTest.insert(10);
    filaTest.insert(20);
    filaTest.insert(30);
    filaTest.poll();
    assertEquals(2, filaTest.getTamanho());
  }

  @Test
  @DisplayName("pool - Deve mover os elementos após remover o primeiro")
  public void poolMoverElementos() {
    FilaObj<Integer> filaTest = new FilaObj(3);
    filaTest.insert(10);
    filaTest.insert(20);
    filaTest.insert(30);

    assertEquals(10, filaTest.poll());
    assertEquals(20, filaTest.poll());
    assertEquals(30, filaTest.poll());
  }

  @Test
  @DisplayName("insert - Deve lançar IllegalStateException quando fila cheia")
  public void insertLancaIllegalStateExceptionQuandoFilaCheia() {
    FilaObj<Integer> filaTest = new FilaObj(6);
    filaTest.insert(30);
    filaTest.insert(40);
    filaTest.insert(50);
    filaTest.insert(60);
    filaTest.insert(70);
    filaTest.insert(80);
    assertThrows(IllegalStateException.class, () -> filaTest.insert(90));
  }

  @Test
  @DisplayName("insert - Deve aumentar tamanho")
  public void insertQuandoFilaRetornaDez() {
    FilaObj<Integer> filaTest = new FilaObj(6);
    filaTest.insert(10);
    filaTest.insert(20);
    filaTest.insert(30);
    filaTest.insert(40);
    assertEquals(4, filaTest.getTamanho());
  }
}
