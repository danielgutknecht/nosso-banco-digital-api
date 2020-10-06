package nossobancodigital.zup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nossobancodigital.zup.entities.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{

}
