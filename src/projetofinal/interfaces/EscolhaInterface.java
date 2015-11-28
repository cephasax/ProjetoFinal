package projetofinal.interfaces;
import java.util.List;

import javax.ejb.Local;

import projetofinal.modelo.Escolha;

@Local
public interface EscolhaInterface {

	public abstract void save(Escolha Escolha);

	public abstract Escolha update(Escolha Escolha);
	
	public abstract void delete(Escolha Escolha);

	public abstract Escolha find(int entityID);

	public abstract List<Escolha> findAll();
}
