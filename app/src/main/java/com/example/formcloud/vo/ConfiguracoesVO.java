package com.example.formcloud.vo;

public class ConfiguracoesVO {
    // Configs do Currículo
    private Boolean exibirDtaUltAtt; // exibir no curriculo data da ultima atualização
    private Boolean permitirBaixarCurriculo; // permite outras pessoas baixarem

    public ConfiguracoesVO() {

    }

    public ConfiguracoesVO(Boolean exibirDtaUltAtt, Boolean permitirBaixarCurriculo) {
        this.exibirDtaUltAtt = exibirDtaUltAtt;
        this.permitirBaixarCurriculo = permitirBaixarCurriculo;
    }

    // <editor-fold desc="Getters e Setters" defaultstate="collapsed">

    public Boolean isExibirDtaUltAtt() {
        return exibirDtaUltAtt;
    }

    public void setExibirDtaUltAtt(Boolean exibirDtaUltAtt) {
        this.exibirDtaUltAtt = exibirDtaUltAtt;
    }

    public Boolean isPermitirBaixarCurriculo() {
        return permitirBaixarCurriculo;
    }

    public void setPermitirBaixarCurriculo(Boolean permitirBaixarCurriculo) {
        this.permitirBaixarCurriculo = permitirBaixarCurriculo;
    }

    // </editor-fold>
}
