package br.com.fiap;


import br.com.fiap.domain.entity.Deposito;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        Deposito d1 =  new Deposito();
        d1.setId(1L);
        d1.setNome("São Caetano do Sul");

    }
}