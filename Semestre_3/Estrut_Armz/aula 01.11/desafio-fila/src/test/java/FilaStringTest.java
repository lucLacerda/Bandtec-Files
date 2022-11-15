import com.bandtec.desafio.fila.FilaString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class FilaStringTest {
    @Test
    public void isFullTrueQuandoFilaPreenchida() {
        FilaString filaTest = new FilaString(5);
        filaTest.insert("a");
        assertFalse(filaTest.isFull());
        filaTest.insert("b");
        assertFalse(filaTest.isFull());
        filaTest.insert("c");
        assertFalse(filaTest.isFull());
        filaTest.insert("d");
        assertFalse(filaTest.isFull());
        filaTest.insert("e");
        assertTrue(filaTest.isFull());
    }

    @Test
    public void isEmptyQuandoFilaVazia() {
        FilaString filaTest = new FilaString(8);
        assertTrue(filaTest.isEmpty());
        filaTest.insert("a");
        filaTest.insert("b");
        filaTest.insert("c");
        filaTest.insert("d");
        filaTest.insert("e");
        filaTest.insert("f");
        filaTest.insert("g");
        assertFalse(filaTest.isEmpty());
        filaTest.poll();
        assertFalse(filaTest.isEmpty());
        filaTest.poll();
        assertFalse(filaTest.isEmpty());
        filaTest.poll();
        assertFalse(filaTest.isEmpty());
        filaTest.poll();
        assertFalse(filaTest.isEmpty());
        filaTest.poll();
        assertFalse(filaTest.isEmpty());
        filaTest.poll();
        assertFalse(filaTest.isEmpty());
        filaTest.poll();
        assertTrue(filaTest.isEmpty());
    }

    @Test
    public void peekQuandoFilaRetornaA() {
        FilaString filaTest = new FilaString(3);        
        filaTest.insert("a");
        filaTest.insert("b");
        filaTest.insert("c");
        assertEquals("a", filaTest.peek());
    }

    @Test
    public void pollQuandoFilaRetornaA() {
        FilaString filaTest = new FilaString(3);        
        filaTest.insert("a");
        filaTest.insert("b");
        filaTest.insert("b");
        assertEquals(3, filaTest.getTamanho());
        assertEquals("a", filaTest.poll());
    }

    @Test
    public void pollQuandoFilaRetornaC() {
        FilaString filaTest = new FilaString(3);        
        filaTest.insert("a");
        filaTest.insert("b");
        filaTest.insert("c");
        assertEquals("a", filaTest.poll());
        assertEquals("b", filaTest.poll());
    }
    
    @Test
    public void insertLancaIllegalStateExceptionQuandoFilaCheia() {
        FilaString filaTest = new FilaString(6);        
        filaTest.insert("a");
        filaTest.insert("b");
        filaTest.insert("c");
        filaTest.insert("d");
        filaTest.insert("e");
        filaTest.insert("f");
        assertThrows(IllegalStateException.class, () -> filaTest.insert("g"));
    }

    @Test
    public void insertQuandoFilaRetornaA() {
        FilaString filaTest = new FilaString(6);        
        filaTest.insert("a");
        assertEquals("a", filaTest.peek());
        filaTest.insert("b");
        assertEquals("a", filaTest.peek());
        filaTest.insert("c");
        assertEquals("a", filaTest.peek());
        filaTest.insert("d");
        assertEquals("a", filaTest.peek());
    }
    
}
