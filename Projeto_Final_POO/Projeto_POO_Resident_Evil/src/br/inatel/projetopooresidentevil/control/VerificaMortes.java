package br.inatel.projetopooresidentevil.control;
import br.inatel.projetopooresidentevil.model.*;
import br.inatel.projetopooresidentevil.exception.*;

public class VerificaMortes {

    public VerificaMortes(Personagem p, RaccoonCity raccoonCity)
    {
        if (p.getVida() <= 0)
        {
            System.out.println("O(a) " + p.getNome() + " morreu.");
            raccoonCity.lista.remove(p);
        }
    }
}
