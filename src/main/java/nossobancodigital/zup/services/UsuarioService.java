package nossobancodigital.zup.services;

import java.util.List;

import nossobancodigital.zup.entities.Usuario;

public interface UsuarioService {
	
	public Usuario salvar(Usuario usuario);
	
	public void alterarSenha(Long usuarioId, String senhaAtual, String novaSenha);
	
	public void desassociarGrupo(Long usuarioId, Long grupoId);
	
	public void associarGrupo(Long usuarioId, Long grupoId);
	
	public Usuario buscarOuFalhar(Long usuarioId);
	
	public List<Usuario> listarTodos();
}
