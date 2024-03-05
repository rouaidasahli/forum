package tn.enicarthage.forum.service;

import tn.enicarthage.forum.domaine.Utilisateur;

public interface UtilisateurService {
	void registerUser(Utilisateur user);
	Utilisateur getUserByUsername(String username);

}
