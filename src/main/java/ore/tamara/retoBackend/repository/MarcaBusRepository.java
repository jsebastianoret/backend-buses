package ore.tamara.retoBackend.repository;

import ore.tamara.retoBackend.model.MarcaBus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaBusRepository extends JpaRepository<MarcaBus, Long> {
}
