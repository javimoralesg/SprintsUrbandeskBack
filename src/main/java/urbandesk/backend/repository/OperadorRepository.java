package urbandesk.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import urbandesk.backend.domain.user.Operador;

import java.util.List;

@Repository
public interface OperadorRepository extends JpaRepository<Operador, Long> {

    @Query("SELECT o FROM Operador o WHERE o.cargaActual < o.cargaMaxima ORDER BY o.cargaActual ASC, o.id ASC")
    List<Operador> findOperadoresDisponiblesOrdenados();
}
