package nossobancodigital.zup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nossobancodigital.zup.entities.Permissao;

@Repository
public interface PermissaoRepository extends JpaRepository<Permissao, Long> {

}
