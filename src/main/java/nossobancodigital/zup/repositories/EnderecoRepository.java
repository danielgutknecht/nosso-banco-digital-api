package nossobancodigital.zup.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import nossobancodigital.zup.entities.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
	
	@Query("SELECT e FROM Endereco e WHERE e.cliente.id = :clienteId")
	public List<Endereco> verificaEnderecoCliente(Long clienteId);
	
		

}
