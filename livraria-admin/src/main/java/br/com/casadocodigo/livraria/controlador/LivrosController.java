package br.com.casadocodigo.livraria.controlador;

import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.casadocodigo.livraria.modelo.Estante;
import br.com.casadocodigo.livraria.modelo.Livro;
import br.com.casadocodigo.livraria.persistencia.UmaEstanteQualquer;

@Resource
public class LivrosController {

	public void formulario() {
	}

	public void salva(Livro livro) {
		Estante estante = new UmaEstanteQualquer();
		estante.guarda(livro);
	}

	public List<Livro> lista() {
		Estante estante = new UmaEstanteQualquer();
		return estante.todosOsLivros();
	}
}
