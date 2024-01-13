package ma.fstt.marketplace.Services;

import ma.fstt.marketplace.persistence.Store;

import java.util.List;

public interface StoreService {

    List<Store> getAllStores();

    Store getStoreById(Long id);

    Store saveStore(Store store);

    void deleteStore(Long id);
    List<Store> getAllStoresWithArticles();

}
