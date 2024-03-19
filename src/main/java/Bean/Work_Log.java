package Bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Work_Log {
    private String Sales_ID;
    private String Log_ID;
    private int Valid_Calls;
    private int Intent_Clients;
    private int Interviewed_Clients;
}
