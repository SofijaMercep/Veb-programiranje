package web.projekat.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.projekat.web.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
