package br.com.fuctura.biblioteca.enums;

public enum Tamanho {

    PEQUENO(0),
    MEDIO(1),
    GRANDE(2);

    private Integer codigo;

    private Tamanho(Integer codigo) {

        this.codigo = codigo;
    }


}
