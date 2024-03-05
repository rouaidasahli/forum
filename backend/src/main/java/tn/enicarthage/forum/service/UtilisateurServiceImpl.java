package tn.enicarthage.forum.service;
import org.springframework.stereotype.Service;

import tn.enicarthage.forum.domaine.Utilisateur;
import tn.enicarthage.forum.repository.UtilisateurRepository;

@Service
public class UtilisateurServiceImpl implements UtilisateurService{
	  private final UtilisateurRepository userRepository;

	    public UtilisateurServiceImpl(UtilisateurRepository userRepository) {
	        this.userRepository = userRepository;    }

    @Override
    public void registerUser(Utilisateur user) {
        // Logic for user registration, e.g., validation, password hashing, etc.
        userRepository.save(user);
    }

    @Override
    public Utilisateur getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }



}
