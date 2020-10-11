package nossobancodigital.zup.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import nossobancodigital.zup.entities.Documento;

@Repository
public interface DocumentoRepository extends JpaRepository<Documento, Long> {
		
	

}
