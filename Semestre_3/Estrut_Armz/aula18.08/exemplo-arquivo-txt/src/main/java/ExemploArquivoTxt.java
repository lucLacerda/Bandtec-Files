import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class ExemploArquivoTxt {
    public static void main(String[] args) {
        List<Aluno> lista = new ArrayList<>();

        lista.add(new Aluno("01212151", "Lucas Lacerda", "ADS", "Estrutura de Dados",
                9.0, 1));

        lista.add(new Aluno("01212152", "Jão", "ADS", "Prog Web",
                8.0, 2));

        lista.add(new Aluno("01212153", "Zé", "ADS", "Engenharia de Software",
                7.0, 3));

        lista.add(new Aluno("01212154", "Fe", "CCO", "Cálculo Computacional",
                6.0, 4));

        lista.add(new Aluno("01212155", "Don", "REDES", "Segurança da Informação",
                5.0, 5));

        System.out.println("Lista Original");

        for (Aluno a : lista) {
            System.out.println(a);
        }

        System.out.println();

//        gravaArquivoTxt(lista, "alunos.txt");

        lerArquivoTxt("alunos.txt");
    }

    public static void gravarRegistroTxt(String registro, String nomeArq) {

        BufferedWriter saida = null;

        try {
            saida = new BufferedWriter(new FileWriter(nomeArq, true));
        } catch (IOException e) {
            System.out.println("Erro ao abrir o arquivo");
            e.printStackTrace();
        }

        try {
            saida.append(registro + "\n");
            saida.close();
        } catch (IOException erro) {
            System.out.println("Erro ao gravar o arquivo");
            System.exit(1);
        }
    }

    public static void gravaArquivoTxt(List<Aluno> alunoList, String nomeArq) {

        int contaRegDados = 0;

        String header = "00NOTA20222";
        header += LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        header += "01";

        gravarRegistroTxt(header, nomeArq);

        String corpo;
        for (Aluno a : alunoList) {
            corpo = "02";
            corpo += String.format("%-5s", a.getCurso());
            corpo += String.format("%-8.8s", a.getRa());
            corpo += String.format("%-50.50s", a.getNome());
            corpo += String.format("%-40.40s", a.getDisciplina());
            corpo += String.format("%05.2f", a.getMedia());
            corpo += String.format("%03d", a.getQtdFalta());
            gravarRegistroTxt(corpo, nomeArq);
            contaRegDados++;
        }

        String trailer = "01";
        trailer += String.format("%010d", contaRegDados);
        gravarRegistroTxt(trailer, nomeArq);
    }

    public static void lerArquivoTxt(String nomeArq) {
        BufferedReader entrada = null;
        String registro, tipoRegistro;
        String ra, nome, curso, disciplina;
        Double media;
        Integer qtdFalta;
        Integer contaRegDadosLido = 0;
        Integer contaRegDadosGravado = 0;

        List<Aluno> listaLida = new ArrayList<>();

        try {
            entrada = new BufferedReader(new FileReader(nomeArq));
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao abrir o arquivo");
            e.printStackTrace();
        }

        try {
            registro = entrada.readLine();
            while (registro != null) {
                tipoRegistro = registro.substring(0, 2);

                if (tipoRegistro.equals("00")) {
                    System.out.println("Registro de Header");

                    System.out.println("Tipo do Arquivo: " + registro.substring(2, 6));
                    System.out.println("Ano e Semestre: " + registro.substring(6, 11));
                    System.out.println("Data/Hora acesso: " + registro.substring(11, 30));
                    System.out.println("Versão do Documento: " + registro.substring(30, 32));

                } else if (tipoRegistro.equals("01")) {
                    System.out.println("Registro de Trailer");
                    contaRegDadosGravado = Integer.valueOf(registro.substring(2, 12));

                    if (contaRegDadosLido == contaRegDadosGravado) {
                        System.out.println("Quantidade de registros lidos é compativel com quantidade de registro gravados");
                    } else {
                        System.out.println("Quantidade de registros lidos não é compativel com quantidade de registro gravados");
                    }

                } else if (tipoRegistro.equals("02")) {
                    System.out.println("Registro de Corpo");

                    curso = registro.substring(2, 7).trim();
                    ra = registro.substring(7, 15).trim();
                    nome = registro.substring(15, 65).trim();
                    disciplina = registro.substring(65, 105).trim();
                    media = Double.valueOf(registro.substring(105, 110).replace(',','.'));
                    qtdFalta = Integer.valueOf(registro.substring(110, 113));

                    contaRegDadosLido++;

                    // Aluno a = new Aluno (ra, nome, curso...);
                    // repository.save(a);

                    listaLida.add(new Aluno(ra, nome, curso, disciplina, media, qtdFalta));

                    if (contaRegDadosLido == contaRegDadosGravado) {
                        System.out.println("Quantidade de registros lidos é compativel com quantidade de registro gravados");
                    } else {
                        System.out.println("Quantidade de registros lidos não é compativel com quantidade de registro gravados");
                    }

                } else {
                    System.out.println("Tipo de Registro inválido");
                }

                registro = entrada.readLine();
            }
            entrada.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler");
            e.printStackTrace();
        }
    }
}

