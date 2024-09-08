package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.Set;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;
    private Set<Dev> devsInscritos = new HashSet<>();
    
    public abstract double calcularXp();

    public void adicionarDev(Dev dev) {
        this.devsInscritos.add(dev);
    }

    public void excluirDev(Dev dev) {
        this.devsInscritos.remove(dev);
    }

    public String pesquisarDev(Dev dev) {
        for(Dev devInscrito : devsInscritos) {
            if(devInscrito.equals(dev)) {
                return "Dev inscrito!";
            }
        }
        return "Dev não inscrito!";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
