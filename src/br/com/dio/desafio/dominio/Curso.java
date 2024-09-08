package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria = 0;
    private int cargaHorariaConcluida = 0;
    private int porcentagemConcluido = 0;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int calcularPorcentagem() {
        this.porcentagemConcluido = (cargaHorariaConcluida / cargaHoraria) * 100;
        return porcentagemConcluido;
    }

    public Curso() {
    }


    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getPorcentagemConcluido() {
        return this.porcentagemConcluido;
    }

    public void setCargaHorariaConcluida(int cargaHorariaConcluida) {
        this.cargaHorariaConcluida = cargaHorariaConcluida;
    }

    public int getCargaHorariaConcluida() {
        return this.cargaHorariaConcluida;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
