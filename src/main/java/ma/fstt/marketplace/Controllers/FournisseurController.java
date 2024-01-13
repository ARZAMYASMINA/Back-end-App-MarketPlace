package ma.fstt.marketplace.Controllers;
import ma.fstt.marketplace.Services.FournisseurService;
import ma.fstt.marketplace.persistence.Fournisseur;
import ma.fstt.marketplace.persistence.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fournisseurs")
public class FournisseurController {

    private final FournisseurService fournisseurService;

    @Autowired
    public FournisseurController(FournisseurService fournisseurService) {
        this.fournisseurService = fournisseurService;
    }

    @GetMapping
    public ResponseEntity<List<Fournisseur>> getAllFournisseurs() {
        List<Fournisseur> fournisseurs = fournisseurService.getAllFournisseurs();
        return ResponseEntity.ok(fournisseurs);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fournisseur> getFournisseurById(@PathVariable Long id) {
        Fournisseur fournisseur = fournisseurService.getFournisseurById(id);
        if (fournisseur != null) {
            return ResponseEntity.ok(fournisseur);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Fournisseur> createFournisseur(@RequestBody Fournisseur fournisseur) {
        Fournisseur createdFournisseur = fournisseurService.saveFournisseur(fournisseur);
        return ResponseEntity.ok(createdFournisseur);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Fournisseur> updateFournisseur(@PathVariable Long id, @RequestBody Fournisseur fournisseur) {
        if (fournisseurService.getFournisseurById(id) != null) {
            fournisseur.setIdFournisseur(id);
            Fournisseur updatedFournisseur = fournisseurService.saveFournisseur(fournisseur);
            return ResponseEntity.ok(updatedFournisseur);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFournisseur(@PathVariable Long id) {
        if (fournisseurService.getFournisseurById(id) != null) {
            fournisseurService.deleteFournisseur(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}

