package nossobancodigital.zup.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nossobancodigital.zup.endpoint.exceptions.PermissaoNaoEncontradaException;
import nossobancodigital.zup.entities.Permissao;
import nossobancodigital.zup.repositories.PermissaoRepository;


@Service
public class PermissaoServiceImplement implements PermissaoService {

	@Autowired
	private PermissaoRepository permissaoRepository;
	
	public Permissao buscarOuFalhar(Long permissaoId) {
		return permissaoRepository.findById(permissaoId)
			.orElseThrow(() -> new PermissaoNaoEncontradaException(permissaoId));
	}
	
	public List<Permissao> ListarTodas() {
		return permissaoRepository.findAll();
	}
	
}
