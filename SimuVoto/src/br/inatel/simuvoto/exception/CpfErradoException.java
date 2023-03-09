package br.inatel.simuvoto.exception;

public class CpfErradoException extends Exception{
    public CpfErradoException()
    {
        System.err.println("FOI DIGITADO O CPF DE FORMA ERRADA, VOCE TERA QUE REINICIAR O SISTEMA E DIGITAR CORRETAMENTE!");
    }
}
