package nossobancodigital.zup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nossobancodigital.zup.entities.ImageFile;

@Repository
public interface ImageFileRepository extends JpaRepository<ImageFile, Long> {

}
