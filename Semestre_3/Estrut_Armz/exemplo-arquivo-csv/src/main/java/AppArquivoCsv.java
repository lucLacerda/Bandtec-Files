import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AppArquivoCsv {

    public static void gravaArquivoCsv(ListaObj<Produto> lista,
                                       String nomeArq) {
        FileWriter arq = null;   // objeto que representa o arquivo de gravação
        Formatter saida = null;  // objeto usado para gravar no arquivo
        Boolean deuRuim = false;
        nomeArq += ".csv";      // Acrescenta a extensão .csv ao nome do arquivo

        // Bloco para abrir o arquivo
        try {
            arq = new FileWriter(nomeArq);  // cria ou abre o arquivo
            saida = new Formatter(arq);
        }
        catch (IOException erro) {
            System.out.println("Erro ao abrir o arquivo");
            System.exit(1);
        }

        // Bloco para gravar o arquivo
        try {
            // saida.format("ID;NOME;VALOR;ESTOQUE\n");
            for (int i = 0; i < lista.getTamanho(); i++) {
                Produto p = lista.getElemento(i);
                saida.format("%d;%s;%.2f;%d\n",p.getId(),p.getNome(),
                        p.getValorUnitario(),p.getQuantidadeEstoque());
            }
        }
        catch (FormatterClosedException erro) {
            System.out.println("Erro ao gravar o arquivo");
            deuRuim = true;
        }
        finally {
            saida.close();
            try {
                arq.close();
            }
            catch (IOException erro) {
                System.out.println("Erro ao fechar o arquivo");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }

    public static void leExibeArquivoCsv(String nomeArq) {
        FileReader arq = null;  // objeto que representa o arquivo de leitura
        Scanner entrada = null; // objeto usado para ler do arquivo
        Boolean deuRuim = false;
        nomeArq += ".csv";

        // Bloco para abrir o arquivo
        try {
            arq = new FileReader(nomeArq);
            entrada = new Scanner(arq).useDelimiter(";|\\n");
        }
        catch (FileNotFoundException erro) {
            System.out.println("Arquivo não encontrado");
            System.exit(1);
        }

        // Bloco para ler o arquivo
        try {
            System.out.printf("%-6S %-14S %16S %7S\n", "código",
                    "nome", "valor do produto", "estoque");
            while (entrada.hasNext()) {
                int id = entrada.nextInt();
                String nome = entrada.next();
                Double valor = entrada.nextDouble();
                int qtdEstoque = entrada.nextInt();
                System.out.printf("%06d %-14s %16.2f %7d\n", id, nome,
                        valor, qtdEstoque);
            }
        }
        catch (NoSuchElementException erro) {
            System.out.println("Arquivo com problemas");
            deuRuim = true;
        }
        catch (IllegalStateException erro) {
            System.out.println("Erro na leitura do arquivo");
            deuRuim = true;
        }
        finally {
            entrada.close();
            try {
                arq.close();
            }
            catch (IOException erro) {
                System.out.println("Erro ao fechar o arquivo");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }

    }




    public static void main(String[] args) {

        ListaObj<Produto> lista = new ListaObj(10);

        lista.adiciona(new Produto(100,"Mouse sem fio",
                80.0,50));
        lista.adiciona(new Produto(200,"Teclado USB",
                150.0,20));
        lista.adiciona(new Produto(300,"Monitor",
                1500.0,15));
        lista.adiciona(new Produto(400,"Pendrive 500GB",
                55.0,100));
        lista.adiciona(new Produto(500,"Lanterna",
                20.0,1000));

        lista.exibe();
        gravaArquivoCsv(lista, "produto");
        leExibeArquivoCsv("produto");
    }
}
