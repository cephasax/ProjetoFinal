package projetofinal.negocio;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import projetofinal.modelo.Pessoa;

@ManagedBean(name = "PessoaMB")
@SessionScoped
public class PessoaMB implements Serializable {
	private static final long serialVersionUID = -329216827348989761L;

	private Pessoa pessoa;
	
	
	
}
