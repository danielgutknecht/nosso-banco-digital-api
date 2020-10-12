package nossobancodigital.zup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import nossobancodigital.zup.entities.Grupo;


@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Long> {

}
