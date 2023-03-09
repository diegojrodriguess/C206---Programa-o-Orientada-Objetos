package br.inatel.projetopooresidentevil.exception;

public class CampanhaErradaException extends Throwable {
    public CampanhaErradaException()
    {
        System.err.println("NUMERO DE CAMPANHA INEXISTENTE, JOGUE NOVAMENTE!");
    }
}
