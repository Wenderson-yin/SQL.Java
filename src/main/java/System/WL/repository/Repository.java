package System.WL.repository;

import System.WL.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Cliente, Long> {
}
