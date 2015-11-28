package projetofinal.interfaces;

import java.util.List;

import javax.ejb.Local;

import projetofinal.modelo.Disciplina;

@Local
public interface DisciplinaInterface {

	public abstract void save(Disciplina Disciplina);

	public abstract Disciplina update(Disciplina Disciplina);
	
	public abstract void delete(Disciplina Disciplina);

	public abstract Disciplina find(int entityID);

	public abstract List<Disciplina> findAll();
}
