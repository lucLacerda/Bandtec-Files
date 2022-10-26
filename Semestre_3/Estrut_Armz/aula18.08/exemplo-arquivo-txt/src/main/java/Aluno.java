public class Aluno {
    private String ra;
    private String nome;
    private String curso;
    private String disciplina;
    private Double media;
    private Integer qtdFalta;

    public Aluno(String ra, String nome, String curso, String disciplina, Double media, Integer qtdFalta) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
        this.disciplina = disciplina;
        this.media = media;
        this.qtdFalta = qtdFalta;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public Integer getQtdFalta() {
        return qtdFalta;
    }

    public void setQtdFalta(Integer qtdFalta) {
        this.qtdFalta = qtdFalta;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Aluno{");
        sb.append("ra='").append(ra).append('\'');
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", curso='").append(curso).append('\'');
        sb.append(", disciplina='").append(disciplina).append('\'');
        sb.append(", media=").append(media);
        sb.append(", qtdFalta=").append(qtdFalta);
        sb.append('}');
        return sb.toString();
    }
}

