package tn.enicarthage.forum.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.enicarthage.forum.model.Utilisateur;
import tn.enicarthage.forum.repository.UtilisateurRepository;
@CrossOrigin(origins = "http://localhost:3306")
@RestController
@RequestMapping("/api/users")
public class utilisateurController {
	 @Autowired
	    private UtilisateurRepository utilisateurRepository;

	    @PostMapping
	    public Utilisateur createUtilisateur(@RequestBody Utilisateur utilisateur) {
	        return utilisateurRepository.save(utilisateur);
	    }

	    @GetMapping("/{username}")
	    public Utilisateur getUtilisateurByUsername(@PathVariable String username) {
	        return utilisateurRepository.findByUsername(username);
	    }
	}

