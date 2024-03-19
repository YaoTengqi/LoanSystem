package Bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Audit_Log {
    private String Audit_ID;
    @JsonFormat(pattern = "yyyy-mm-dd", timezone = "GMT+8")
    private Date Audit_Time;
    private String Financial_Product;
    private String Bank_Information;

}
