package service.impl;

import mapper.ContractMapper;
import org.springframework.stereotype.Service;
import service.ContractService;

import java.util.Date;

@Service
public class ContractServiceImpl implements ContractService {
    ContractMapper contractMapper;

    @Override
    public void signContract(String Contract_ID, String Sales_ID, String Clients_ID, Date Contract_Time, float Contract_Amount, String Client_Intention, Boolean Lending_Status) {
        contractMapper.signContract(Contract_ID, Sales_ID, Clients_ID, Contract_Time,
                                    Contract_Amount, Client_Intention, Lending_Status);
    }
}
