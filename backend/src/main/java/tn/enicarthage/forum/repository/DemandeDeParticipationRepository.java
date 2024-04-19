package tn.enicarthage.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
	import tn.enicarthage.forum.model.DemandeDeParticipation;
	

public class DemandeDeParticipationRepository {
	public interface demandeDeParticipationRepository extends JpaRepository<DemandeDeParticipation, Long> {
	}
}
