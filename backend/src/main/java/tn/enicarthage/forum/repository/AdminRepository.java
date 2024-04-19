package tn.enicarthage.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
	import tn.enicarthage.forum.model.Admin;
	

public class AdminRepository {
	public interface adminRepository extends JpaRepository<Admin, Long> {
	}
}
