import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AppArquivoCsv {

    public static void main(String[] args) {

        ListaObj<Remedio> listaObj = new ListaObj<>(10);


        Scanner leitor = new Scanner(System.in);


        int opcaoDigitada;

        do {
            System.out.println("\nEscolha os próximos passos: ");
            System.out.println("1- Adicionar remedio");
            System.out.println("2- Sair");
            System.out.println("3- Gravar CSV");
            System.out.println("4- Ler CSV");

            opcaoDigitada = leitor.nextInt();

            switch (opcaoDigitada) {
                case 1:
                    adicionarRemedio(listaObj);
                    break;

                case 2:
                    System.out.println("Até logo");
                    break;

                case 3:
                    gravaArquivosCsv(listaObj, "arquivo-csv");
                    break;

                case 4:
                    leExibeArquivoCsv("arquivo-csv");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcaoDigitada != 2);
    }

    public static void gravaArquivosCsv(ListaObj<Remedio> lista, String nomeArq) {

        FileWriter arq = null;
        Formatter saida = null;
        boolean deuRuim = false;
        nomeArq += ".csv";

        try {
            arq = new FileWriter(nomeArq);
            saida = new Formatter(arq);

        } catch (IOException e) {
            System.out.println("Erro ao abrir o arquivo");
            System.exit(1);
        }

        try {
            for (int i = 0; i < lista.getTamanho(); i++) {
                Remedio p = lista.getElemento(i);
                saida.format("%d;%s;%.2f;%s;%d\n", p.getIdadeMinIndicada(), p.getNome(), p.getPreco(), p.getMarca(), p.getEstoque());
            }
        } catch (FormatterClosedException e) {
            System.out.println("Erro ao abrir o arquivo");
            deuRuim = true;
            System.exit(1);
        } finally {
            saida.close();
            try {
                arq.close();
            } catch (IOException e) {
                System.out.println("Erro ao fechar o arquivo");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }

    public static void leExibeArquivoCsv(String nomeArq) {
        FileReader arq = null;
        Scanner entrada = null;

        boolean deuRuim = false;
        nomeArq += ".csv";

        try {
            arq = new FileReader(nomeArq);
            entrada = new Scanner(arq).useDelimiter(";|\n");

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
            System.exit(1);

        }

        try {
            System.out.printf("%-14S %-14S %10S %15S %7S\n", "idade indicada", "nome", "valor", "marca", "estoque");
            while (entrada.hasNext()) {
                int idadeMinIndicada = entrada.nextInt();
                String nome = entrada.next();
                Double valor = entrada.nextDouble();
                String marca = entrada.next();
                int qtdEstoque = entrada.nextInt();
                System.out.printf("%-14d %-14s %10.2f %15S %7d\n", idadeMinIndicada, nome, valor, marca, qtdEstoque);
            }
        } catch (NoSuchElementException e) {
            System.out.println("Não existem elementos no documento");
            deuRuim = true;
        } catch (IllegalStateException e) {
            System.out.println("Erro na leitura do arquivo");
            deuRuim = true;

        } finally {
            entrada.close();
            try {
                arq.close();
            } catch (IOException e) {
                System.out.println("Erro ao fechar o arquivo");
                deuRuim = true;
            }
        }
        if (deuRuim) System.exit(1);
    }

    public static void adicionarRemedio(ListaObj<Remedio> listaObj) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Vamos adicionar seu remédio:");

        System.out.println("Digite a idade minima indicada:");
        int idadeIndicada = leitor.nextInt();

        System.out.println("Digite o nome:");
        String nome = leitor.next();

        System.out.println("Digite o preço:");
        double preco = leitor.nextDouble();

        System.out.println("Digite o estoque");
        int estoque = leitor.nextInt();

        System.out.println("Digite a marca:");
        String marca = leitor.next();

        listaObj.adiciona(new Remedio(idadeIndicada, nome, preco, estoque, marca));

    }
}
