package nossobancodigital.zup.services;

import java.util.List;

import nossobancodigital.zup.entities.Grupo;

public interface GrupoService {
	
	public Grupo salvar(Grupo grupo);
	
	public void excluir(Long grupoId);
	
	public void desassociarPermissao(Long grupoId, Long permissaoId);
	
	public void associarPermissao(Long grupoId, Long permissaoId);
	
	public Grupo buscarOuFalhar(Long grupoId);
	
	public List<Grupo> listarTodos();

}
