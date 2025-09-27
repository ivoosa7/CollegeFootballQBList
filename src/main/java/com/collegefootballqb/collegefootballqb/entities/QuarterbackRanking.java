package com.collegefootballqb.collegefootballqb.entities;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class QuarterbackRanking implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String nome;
    private Integer numeroCamisa;
    private String experiencia;

    private LocalDate dataClassificacao;
    private Integer semana;
    private Integer rankingPosicao;

    private Double ratingQB;
    private Integer jardasPassadas;
    private Integer touchdowns;
    private Integer jardasCorridas;
    private Integer touchdownsCorridos;
    private Integer inteceptacoes;
    private Integer passesTentados;
    private Integer passesCompletos;
    private Double porcentagemPassesConcluidos;
    private Integer sacksRecebidos;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getNumeroCamisa() {
        return numeroCamisa;
    }
    public void setNumeroCamisa(Integer numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }
    public String getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
    public LocalDate getDataClassificacao() {
        return dataClassificacao;
    }
    public void setDataClassificacao(LocalDate dataClassificacao) {
        this.dataClassificacao = dataClassificacao;
    }
    public Integer getSemana() {
        return semana;
    }
    public void setSemana(Integer semana) {
        this.semana = semana;
    }
    public Integer getRankingPosicao() {
        return rankingPosicao;
    }
    public void setRankingPosicao(Integer rankingPosicao) {
        this.rankingPosicao = rankingPosicao;
    }
    public Double getRatingQB() {
        return ratingQB;
    }
    public void setRatingQB(Double ratingQB) {
        this.ratingQB = ratingQB;
    }
    public Integer getJardasPassadas() {
        return jardasPassadas;
    }
    public void setJardasPassadas(Integer jardasPassadas) {
        this.jardasPassadas = jardasPassadas;
    }
    public Integer getTouchdowns() {
        return touchdowns;
    }
    public void setTouchdowns(Integer touchdowns) {
        this.touchdowns = touchdowns;
    }
    public Integer getJardasCorridas() {
        return jardasCorridas;
    }
    public void setJardasCorridas(Integer jardasCorridas) {
        this.jardasCorridas = jardasCorridas;
    }
    public Integer getTouchdownsCorridos() {
        return touchdownsCorridos;
    }
    public void setTouchdownsCorridos(Integer touchdownsCorridos) {
        this.touchdownsCorridos = touchdownsCorridos;
    }
    public Integer getInteceptacoes() {
        return inteceptacoes;
    }
    public void setInteceptacoes(Integer inteceptacoes) {
        this.inteceptacoes = inteceptacoes;
    }
    public Integer getPassesTentados() {
        return passesTentados;
    }
    public void setPassesTentados(Integer passesTentados) {
        this.passesTentados = passesTentados;
    }
    public Integer getPassesCompletos() {
        return passesCompletos;
    }
    public void setPassesCompletos(Integer passesCompletos) {
        this.passesCompletos = passesCompletos;
    }
    public Double getPorcentagemPassesConcluidos() {
        return porcentagemPassesConcluidos;
    }
    public void setPorcentagemPassesConcluidos(Double porcentagemPassesConcluidos) {
        this.porcentagemPassesConcluidos = porcentagemPassesConcluidos;
    }
    public Integer getSacksRecebidos() {
        return sacksRecebidos;
    }
    public void setSacksRecebidos(Integer sacksRecebidos) {
        this.sacksRecebidos = sacksRecebidos;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        QuarterbackRanking other = (QuarterbackRanking) obj;
        if (id != other.id)
            return false;
        return true;
    }

    
}
