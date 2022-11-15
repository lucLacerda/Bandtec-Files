import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Repositorio {
    //Atributos - não é necessário adicionar novos
    private List<Carro> objetosTemaLivre;
    private PilhaObj<Operacao> pilhaOperacao;
    private FilaObj<Integer> filaIds;
    private int contadorOperacoesPilha;

    //Construtor (completar)
    public Repositorio() {
        objetosTemaLivre = new ArrayList<>(10);
        pilhaOperacao = new PilhaObj<>(10);
        filaIds = new FilaObj<>(10);
        contadorOperacoesPilha = 0;
    }

    //Métodos (completar)
    public void salvar(Carro objetoAdicionar) {
        objetosTemaLivre.add(objetoAdicionar);
    }

    public void deletarPeloId(int id) {
        for (int i = 0; objetosTemaLivre.size() > i; i++) {
            if (id == objetosTemaLivre.get(i).getId()) {
                objetosTemaLivre.remove(i);
                return;
            }
        }
        throw new IllegalArgumentException();

    }

    public void aumentarValorPeloId(int id, Double valor) {

        for (Carro carro : objetosTemaLivre) {
            if (id == carro.getId()) {
                carro.setValor(carro.getValor() + valor);

                Operacao operacao = new Operacao(carro.getId(), valor);
                pilhaOperacao.push(operacao);
                contadorOperacoesPilha++;
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public void diminuirValorPeloId(int id, Double valor) {

        for (Carro carro : objetosTemaLivre) {
            if (id == carro.getId()) {
                carro.setValor(carro.getValor() - valor);

                Operacao operacao = new Operacao(carro.getId(), valor);
                pilhaOperacao.push(operacao);

                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public void desfazer(int qtdOperacoesADesfazer) {
        if (pilhaOperacao.isEmpty() ){
            throw new IllegalStateException();
        } else if (contadorOperacoesPilha < qtdOperacoesADesfazer || qtdOperacoesADesfazer < 0) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < qtdOperacoesADesfazer; i++) {
            Operacao operacao = pilhaOperacao.pop();
            contadorOperacoesPilha --;
                aumentarValorPeloId(operacao.getId(), operacao.getValorDeAumento());

                contadorOperacoesPilha --;

        }
    }

    public void agendarDeletarPorId(int id) {
        if (filaIds.isFull()) {
            throw new IllegalArgumentException();
        }
            filaIds.insert(id);
    }

    public void executarAgendado() {
        if (filaIds.isEmpty()) throw new IllegalStateException();

        deletarPeloId(filaIds.poll());

        filaIds.peek();
    }

    //GETTERS e SETTERS (não remover)
    public List<Carro> getObjetosTemaLivre() {
        return objetosTemaLivre;
    }

    public void setObjetosTemaLivre(List<Carro> objetosTemaLivre) {
        this.objetosTemaLivre = objetosTemaLivre;
    }

    public PilhaObj<Operacao> getPilhaOperacao() {
        return pilhaOperacao;
    }

    public void setPilhaOperacao(PilhaObj<Operacao> pilhaOperacao) {
        this.pilhaOperacao = pilhaOperacao;
    }

    public FilaObj<Integer> getFilaIds() {
        return filaIds;
    }

    public void setFilaIds(FilaObj<Integer> filaIds) {
        this.filaIds = filaIds;
    }

    public int getContadorOperacoesPilha() {
        return contadorOperacoesPilha;
    }

    public void setContadorOperacoesPilha(int contadorOperacoesPilha) {
        this.contadorOperacoesPilha = contadorOperacoesPilha;
    }
}
