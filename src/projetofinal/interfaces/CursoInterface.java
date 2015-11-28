package projetofinal.interfaces;

import java.util.List;

import javax.ejb.Local;

import projetofinal.modelo.Curso;

@Local
public interface CursoInterface {

	public abstract void save(Curso Curso);

	public abstract Curso update(Curso Curso);
	
	public abstract void delete(Curso Curso);

	public abstract Curso find(int entityID);

	public abstract List<Curso> findAll();
}
