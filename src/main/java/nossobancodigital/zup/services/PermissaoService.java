package nossobancodigital.zup.services;

import java.util.List;

import nossobancodigital.zup.entities.Permissao;

public interface PermissaoService {
	
	public Permissao buscarOuFalhar(Long permissaoId);
	
	public List<Permissao> ListarTodas();

}
