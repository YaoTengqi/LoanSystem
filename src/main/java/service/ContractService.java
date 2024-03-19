package service;

import java.util.Date;

public interface ContractService {
    public void signContract(String Contract_ID, String Sales_ID, String Clients_ID, Date Contract_Time,
                             float Contract_Amount, String Client_Intention, Boolean Lending_Status);
}
