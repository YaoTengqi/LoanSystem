package mapper;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

@Mapper
public interface ContractMapper {
    public void signContract(String Contract_ID, String Sales_ID, String Clients_ID, Date Contract_Time,
                             float Contract_Amount, String Client_Intention, Boolean Lending_Status);

}
