import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class EtudiantController {
    private List<Etudiant> etudiants = new ArrayList<>();

    // Page d'inscription
    @GetMapping("/inscription")
    public String afficherPageInscription(Model model) {
        model.addAttribute("etudiant", new Etudiant());
        return "inscription";
    }

    // Soumettre le formulaire d'inscription
    @PostMapping("/inscription")
    public String soumettreInscription(@ModelAttribute Etudiant etudiant) {
        etudiants.add(etudiant);
        return "redirect:/list";
    }

    // Afficher la liste des inscrits
    @GetMapping("/list")
    public String afficherListeInscrits(Model model) {
        model.addAttribute("etudiants", etudiants);
        return "list";
    }

    // Rechercher les inscrits par classe et date
    @GetMapping("/recherche")
    public String rechercherInscrits(@RequestParam("classe") String classe,
                                     @RequestParam("date") String date,
                                     Model model) {
        List<Etudiant> resultats = etudiants.stream()
                .filter(etudiant -> etudiant.getClasse().equals(classe))
                // Si l'étudiant a une date d'inscription, vous pouvez ajouter une condition ici
                .collect(Collectors.toList());

        model.addAttribute("etudiants", resultats);
        return "list";
    }
}
