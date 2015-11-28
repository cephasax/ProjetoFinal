package projetofinal.dao;

import javax.ejb.Stateless;

import projetofinal.modelo.Pessoa;

@Stateless
public class PessoaDAO extends GenericDAO<Pessoa> {

	public PessoaDAO() {
		super(Pessoa.class);
	    }
	    
	    public void delete(Pessoa pessoa) {
	        super.delete(pessoa.getIdPessoa(), Pessoa.class);
	    }

}
