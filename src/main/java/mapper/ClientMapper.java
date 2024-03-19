package mapper;

import Bean.Client;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ClientMapper {
    public void addClient(Client client);
}
