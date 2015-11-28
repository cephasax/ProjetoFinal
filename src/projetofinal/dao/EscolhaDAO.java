package projetofinal.dao;
import javax.ejb.Stateless;

import projetofinal.modelo.Escolha;

@Stateless
public class EscolhaDAO extends GenericDAO<Escolha> {

	public EscolhaDAO() {
		super(Escolha.class);
	    }

	public void delete(Escolha escolha) {
		super.delete(escolha.getIdEscolha(), Escolha.class);
	}

}
