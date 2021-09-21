package com.example.formcloud.enums;

public enum Usuario {

    PADRAO(1, "Usuário padrão"),
    ADMIN(2, "Usuário administrador");

    private final Integer id;
    private final String definicao;

    Usuario(Integer id, String definicao) {
        this.id = id;
        this.definicao = definicao;
    }

    public Integer getId() {
        return id;
    }

    public String getDefinicao() {
        return definicao;
    }

}
