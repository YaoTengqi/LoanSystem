package Bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Contract {
    private String Contract_ID;
    private String Sales_ID;
    private String Clients_ID;
    @JsonFormat(pattern = "yyyy-mm-dd", timezone = "GMT+8")
    private Date Contract_Time;
    private float Contract_Amount;
    private String Client_Intention;
    private Boolean Lending_Status;
}
