package tn.enicarthage.forum.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.enicarthage.forum.domaine.Utilisateur;
import tn.enicarthage.forum.service.UtilisateurService;
@CrossOrigin(origins = "http://localhost:3306")
@RestController
@RequestMapping("/User")
public class utilisateurController {
    private final UtilisateurService userService ;

    public utilisateurController(UtilisateurService userService) {
        this.userService = userService;
    }

    @PostMapping(path="/signup")
    public ResponseEntity<String> signUp(@RequestBody (required=true) Utilisateur user) {
        userService.registerUser(user);
        return ResponseEntity.ok("User registered successfully");
    }
}
