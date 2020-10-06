package nossobancodigital.zup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import nossobancodigital.zup.entities.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {

}
