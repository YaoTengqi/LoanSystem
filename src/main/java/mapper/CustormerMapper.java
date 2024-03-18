package mapper;

import Bean.Customer;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustormerMapper {
    public Customer getCust(String Id);

    public Customer getCustByCode(String code);

    public void addCust(String id, String email, String passwd, String active_code);

    public void updateState(String id);
}
