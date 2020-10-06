package nossobancodigital.zup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nossobancodigital.zup.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
