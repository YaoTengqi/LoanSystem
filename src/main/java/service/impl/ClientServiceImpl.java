package service.impl;

import Bean.Client;
import mapper.ClientMapper;
import org.springframework.stereotype.Service;
import service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {
    ClientMapper clientMapper;

    @Override
    public void addClient(Client client) {
        clientMapper.addClient(client);
    }
}
