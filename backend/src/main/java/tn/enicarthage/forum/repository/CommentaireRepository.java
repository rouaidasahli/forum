package tn.enicarthage.forum.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
	import tn.enicarthage.forum.model.Commentaire;
import tn.enicarthage.forum.model.Utilisateur;
	

	
public interface CommentaireRepository extends JpaRepository<Commentaire, Long> {
    List<Commentaire> findByUtilisateur(Utilisateur utilisateur);
    Optional<Commentaire> findById(Long id);

}

