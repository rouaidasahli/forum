package tn.enicarthage.forum.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import tn.enicarthage.forum.model.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    Utilisateur findByUsername(String username);
}
