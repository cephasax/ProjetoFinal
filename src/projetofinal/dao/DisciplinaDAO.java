package projetofinal.dao;

import javax.ejb.Stateless;

import projetofinal.modelo.Disciplina;


@Stateless
public class DisciplinaDAO extends GenericDAO<Disciplina> {

	public DisciplinaDAO() {
		super(Disciplina.class);
	    }

	public void delete(Disciplina disciplina) {
		super.delete(disciplina.getIdDisciplina(), Disciplina.class);
	}

}
