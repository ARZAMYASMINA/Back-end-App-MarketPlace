package ma.fstt.marketplace.Services;

import ma.fstt.marketplace.persistence.Client;

import java.util.List;

public interface ClientService {

    List<Client> getAllClients();

    Client getClientById(Long id);

    Client saveClient(Client client);

    void deleteClient(Long id);

}
