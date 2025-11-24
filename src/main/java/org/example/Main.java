package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ConsultaCep consultaCep = new ConsultaCep();
        Endereco novoEndereco = consultaCep.buscaEndereco("01001000");
        System.out.println(novoEndereco);
    }
}