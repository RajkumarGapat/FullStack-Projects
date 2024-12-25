package repository;



import model.SavedLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<SavedLocation, Long> {
}