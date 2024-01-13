package ma.fstt.marketplace.Controllers;

import ma.fstt.marketplace.Services.StoreService;
import ma.fstt.marketplace.persistence.Article;
import ma.fstt.marketplace.persistence.Fournisseur;
import ma.fstt.marketplace.persistence.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stores")
public class StoreController {

    private final StoreService storeService;

    @Autowired
    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping
    public ResponseEntity<List<Store>> getAllStores() {
        List<Store> stores = storeService.getAllStores();
        return ResponseEntity.ok(stores);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Store> getStoreById(@PathVariable Long id) {
        Store store = storeService.getStoreById(id);
        if (store != null) {
            return ResponseEntity.ok(store);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Store> createStore(@RequestBody Store store) {
        Store createdStore = storeService.saveStore(store);
        return ResponseEntity.ok(createdStore);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Store> updateStore(@PathVariable Long id, @RequestBody Store store) {
        if (storeService.getStoreById(id) != null) {
            store.setIdStore(id);
            Store updatedStore = storeService.saveStore(store);
            return ResponseEntity.ok(updatedStore);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStore(@PathVariable Long id) {
        if (storeService.getStoreById(id) != null) {
            storeService.deleteStore(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/all-with-articles")
    public List<Store> getAllStoresWithArticles() {
        return storeService.getAllStoresWithArticles();
    }
}


