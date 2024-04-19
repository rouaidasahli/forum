package tn.enicarthage.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
	import tn.enicarthage.forum.model.Pack;
	

	
public class PackRepository {
	public interface packRepository extends JpaRepository<Pack, Long> {
	}
}
