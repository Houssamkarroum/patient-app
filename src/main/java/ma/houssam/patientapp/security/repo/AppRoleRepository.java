package ma.houssam.patientapp.security.repo;

import ma.houssam.patientapp.security.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole, String> {
}
