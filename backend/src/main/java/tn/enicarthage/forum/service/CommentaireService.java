package tn.enicarthage.forum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enicarthage.forum.model.Commentaire;
import tn.enicarthage.forum.model.Utilisateur;
import tn.enicarthage.forum.repository.CommentaireRepository;

@Service
public class CommentaireService {

    @Autowired
    private CommentaireRepository commentaireRepository;

    
    //Creates a new commentaire by saving it to the database 
    public Commentaire createCommentaire(Commentaire commentaire) {
        return commentaireRepository.save(commentaire);
    }

    
    //Retrieves a list of commentaires associated with a specific utilisateur based on the utilisateur's ID.
    public List<Commentaire> getCommentairesByUtilisateur(Long utilisateurId) {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setId(utilisateurId);
        List<Commentaire> findByUtilisateur = (List<Commentaire>) commentaireRepository.findByUtilisateur(utilisateur);
		return findByUtilisateur;
    }

    
    //saves the Commentaire entity but does not return anything .
    // It's assumed that the save operation is successful and doesn't need further processing.
    public void saveCommentaire(Commentaire commentaire) {
        commentaireRepository.save(commentaire);
    }
}
