package projetofinal.dao;
import javax.ejb.Stateless;

import projetofinal.modelo.Curso;

@Stateless
public class CursoDAO extends GenericDAO<Curso> {

	public CursoDAO() {
		super(Curso.class);
	    }

	public void delete(Curso curso) {
		super.delete(curso.getIdCurso(), Curso.class);
	}

}
