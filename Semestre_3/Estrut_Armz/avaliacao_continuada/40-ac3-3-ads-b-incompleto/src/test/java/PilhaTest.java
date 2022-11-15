import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PilhaTest {
  @Test
  @DisplayName("isFull - Deve retornar true quando pilha estiver cheia")
  public void isFullTrueQuandoPilhaCheia() {
    PilhaObj<Integer> pilhaTest = new PilhaObj(3);

    pilhaTest.push(10);
    pilhaTest.push(20);
    pilhaTest.push(30);

    assertTrue(pilhaTest.isFull());
  }

  @Test
  @DisplayName("isFull - Deve retornar false quando pilha não estiver cheia")
  public void isFullTrueQuandoPilhaNaoCheia() {
    PilhaObj<Integer> pilhaTest = new PilhaObj(5);

    pilhaTest.push(10);
    pilhaTest.push(20);
    pilhaTest.push(30);
    assertFalse(pilhaTest.isFull());
  }

  @Test
  @DisplayName("isFull - Deve retornar false quando pilha estiver vazia")
  public void isFullTrueQuandoPilhaVazia() {
    PilhaObj<Integer> pilhaTest = new PilhaObj(5);

    pilhaTest.push(10);
    pilhaTest.push(20);
    pilhaTest.push(30);
    assertFalse(pilhaTest.isFull());
  }

  @Test
  @DisplayName("isEmpty - Deve retornar true quando pilha estiver vazia")
  public void isEmptyQuandoPilhaVazia() {
    PilhaObj<Integer> pilhaTest = new PilhaObj(8);
    assertTrue(pilhaTest.isEmpty());
  }

  @Test
  @DisplayName("isEmpty - Deve retornar false quando pilha não estiver vazia")
  public void isEmptyQuandoPilhaNaoVazia() {
    PilhaObj<Integer> pilhaTest = new PilhaObj(8);
    pilhaTest.push(10);
    pilhaTest.push(20);
    pilhaTest.push(30);
    assertFalse(pilhaTest.isEmpty());
  }

  @Test
  @DisplayName("isEmpty - Deve retornar false quando pilha estiver cheia")
  public void isEmptyQuandoPilhaCheia() {
    PilhaObj<Integer> pilhaTest = new PilhaObj(3);
    pilhaTest.push(10);
    pilhaTest.push(20);
    pilhaTest.push(30);
    assertFalse(pilhaTest.isEmpty());
  }

  @Test
  @DisplayName("peek - Deve retornar elemento do topo")
  public void peekRetornaTopo() {
    PilhaObj<Integer> pilhaTest = new PilhaObj(6);
    pilhaTest.push(10);
    pilhaTest.push(20);
    pilhaTest.push(30);
    assertEquals(30, pilhaTest.peek());
  }

  @Test
  @DisplayName("peek - Deve retornar elemento do topo quando pilha cheia")
  public void peekRetornaTopoPilhaCheia() {
    PilhaObj<Integer> pilhaTest = new PilhaObj(3);
    pilhaTest.push(10);
    pilhaTest.push(20);
    pilhaTest.push(30);
    assertEquals(30, pilhaTest.peek());
  }

  @Test
  @DisplayName("peek - Deve retornar null quando pilha vazia")
  public void peekRetornaPilhaVazia() {
    PilhaObj<Integer> pilhaTest = new PilhaObj(3);
    assertEquals(null, pilhaTest.peek());
  }

  @Test
  @DisplayName("pop - Deve retornar elemento do topo")
  public void popRetornaTopo() {
    PilhaObj<Integer> pilhaTest = new PilhaObj(6);
    pilhaTest.push(10);
    pilhaTest.push(20);
    pilhaTest.push(30);
    assertEquals(30, pilhaTest.pop());
  }

  @Test
  @DisplayName("pop - Deve decrementar topo")
  public void popDecrementaTopo() {
    PilhaObj<Integer> pilhaTest = new PilhaObj(6);
    pilhaTest.push(10);
    pilhaTest.push(20);
    pilhaTest.push(30);
    pilhaTest.pop();
    assertEquals(1, pilhaTest.getTopo());
  }

  @Test
  @DisplayName("push  - Deve lançar IllegalStateException quando pilha cheia ")
  public void pushLancaIllegalStateExceptionQuandoPilhaCheia() {
    PilhaObj<Integer> pilhaTest = new PilhaObj(6);
    pilhaTest.push(30);
    pilhaTest.push(40);
    pilhaTest.push(50);
    pilhaTest.push(60);
    pilhaTest.push(70);
    pilhaTest.push(80);
    assertThrows(IllegalStateException.class, () -> pilhaTest.push(90));
  }

  @Test
  @DisplayName("push - Insere elemento no vetor")
  public void pushInsereElemento() {
    PilhaObj<Integer> pilhaTest = new PilhaObj(6);

    pilhaTest.push(10);
    pilhaTest.push(20);
    pilhaTest.push(30);

    assertEquals(30, pilhaTest.peek());
  }

  @Test
  @DisplayName("push - Aumenta topo")
  public void pushAumentaTopo() {
    PilhaObj<Integer> pilhaTest = new PilhaObj(6);

    pilhaTest.push(10);
    pilhaTest.push(20);
    pilhaTest.push(30);

    assertEquals(2, pilhaTest.getTopo());
  }
}
