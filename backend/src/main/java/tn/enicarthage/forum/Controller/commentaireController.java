package tn.enicarthage.forum.Controller;
import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.enicarthage.forum.model.Commentaire;
import tn.enicarthage.forum.service.CommentaireService;
@CrossOrigin(origins = "http://localhost:3306")
@RestController
@RequestMapping("/api")
public class commentaireController {

   

        @Autowired
        private CommentaireService commentaireService;

        @MessageMapping("/sendCommentaire")
        @SendTo("/topic/adminMessages")
        public Commentaire sendCommentaire(@Payload Commentaire commentaire) {
            LocalDateTime now = LocalDateTime.now();
            commentaire.setDateCreation(now);
            commentaireService.saveCommentaire(commentaire);
            return commentaire;
        }

        @MessageMapping("/sendReplyToClient")
        @SendTo("/topic/clientMessages")
        public Commentaire sendReplyToClient(@Payload Commentaire commentaire) {
            LocalDateTime now = LocalDateTime.now();
            commentaire.setDateCreation(now);
            commentaireService.saveCommentaire(commentaire);
            return commentaire;
        }

        @MessageMapping("/addUser")
        @SendTo("/topic/public")
        public Commentaire addUser(@Payload Commentaire commentaire, 
                                   SimpMessageHeaderAccessor headerAccessor) {
            String sender = commentaire.getUtilisateur().getNom(); 
            headerAccessor.getSessionAttributes().put("username", sender);
            return commentaire;
        }
    }

