package Projeto;

import java.util.Comparator;

public class ComparadorUsuarioReputacaoMaior implements Comparator<Usuario>{
	
	/**
	 * Compara 2 Usuarios pela reputacao maior
	 * 
	 * @return representacoes em inteiro para os casos de comparacao
	 */
	public int compare(Usuario u1, Usuario u2) {

		if (u1.getReputacao() > u2.getReputacao()) 
			return -1;
        if (u1.getReputacao() < u2.getReputacao()) 
        	return 1;
        return 0;	
	}
}