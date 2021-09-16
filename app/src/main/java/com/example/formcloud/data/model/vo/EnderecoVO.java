package com.example.formcloud.data.model.vo;

public class EnderecoVO {
    private String tipoLogradouro;
    private String nomeLogradouro;
    private int numeroLogradouro;
    private String bairroLogradouro;
    private String cepLogradouro;
    private String complementoLogradouro;
    private Boolean trabalhoAtual;

    public EnderecoVO() {

    }

    public EnderecoVO(String tipoLogradouro, String nomeLogradouro, int numeroLogradouro,
                      String bairroLogradouro, String cepLogradouro, String complementoLogradouro, Boolean trabalhoAtual) {
        this.tipoLogradouro = tipoLogradouro;
        this.nomeLogradouro = nomeLogradouro;
        this.numeroLogradouro = numeroLogradouro;
        this.bairroLogradouro = bairroLogradouro;
        this.cepLogradouro = cepLogradouro;
        this.complementoLogradouro = complementoLogradouro;
        this.trabalhoAtual = trabalhoAtual;
    }

    // <editor-fold desc="Getters e Setters" defaultstate="collapsed">

    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getNomeLogradouro() {
        return nomeLogradouro;
    }

    public void setNomeLogradouro(String nomeLogradouro) {
        this.nomeLogradouro = nomeLogradouro;
    }

    public int getNumeroLogradouro() {
        return numeroLogradouro;
    }

    public void setNumeroLogradouro(int numeroLogradouro) {
        this.numeroLogradouro = numeroLogradouro;
    }

    public String getBairroLogradouro() {
        return bairroLogradouro;
    }

    public void setBairroLogradouro(String bairroLogradouro) {
        this.bairroLogradouro = bairroLogradouro;
    }

    public String getCepLogradouro() {
        return cepLogradouro;
    }

    public void setCepLogradouro(String cepLogradouro) {
        this.cepLogradouro = cepLogradouro;
    }

    public String getComplementoLogradouro() {
        return complementoLogradouro;
    }

    public void setComplementoLogradouro(String complementoLogradouro) {
        this.complementoLogradouro = complementoLogradouro;
    }

    public Boolean isTrabalhoAtual() {
        return trabalhoAtual;
    }

    public void setTrabalhoAtual(Boolean trabalhoAtual) {
        this.trabalhoAtual = trabalhoAtual;
    }

    // </editor-fold>
}
