package controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstudanteController {
	
	//verificar integrante por id
	
	@RequestMapping(value = "/integrante", method = RequestMethod.GET)
	public String listarIntegrantes() {
		
		return "todas as contas cadastradas";
	}
	
	@RequestMapping(value="/integrante/{identificador}", method = RequestMethod.GET)
	public String obterInformacaoIntegrante(@PathVariable String identificador) {
		
		if(identificador != null) {
		
	
		}
		return identificador;
	}

}
