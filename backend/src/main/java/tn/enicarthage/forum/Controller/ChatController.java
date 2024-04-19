package tn.enicarthage.forum.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import tn.enicarthage.forum.model.Commentaire;
import tn.enicarthage.forum.model.Utilisateur;

import tn.enicarthage.forum.service.CommentaireService;
import tn.enicarthage.forum.service.UtilisateurService;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    @Autowired
    private CommentaireService commentaireService;

    @Autowired
    private UtilisateurService utilisateurService;

    @GetMapping("/chat")
    public String chat() {
        return "chat";
    }

    @PostMapping("/api/commentaires")
    @ResponseBody
    public Commentaire createCommentaire(@RequestBody Commentaire commentaire) {
        return commentaireService.createCommentaire(commentaire);
    }

    @GetMapping("/api/commentaires/{utilisateurId}")
    @ResponseBody
    public List<Commentaire> getCommentairesByUtilisateur(@PathVariable Long utilisateurId) {
        return commentaireService.getCommentairesByUtilisateur(utilisateurId);
    }

    @PostMapping("/api/users")
    @ResponseBody
    public Utilisateur createUtilisateur(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.createUtilisateur(utilisateur);
    }

    @GetMapping("/api/users/{username}")
    @ResponseBody
    public Utilisateur getUtilisateurByUsername(@PathVariable String username) {
        return utilisateurService.getUtilisateurByUsername(username);
    }
}
