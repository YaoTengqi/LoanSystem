package Bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Loan_Result {
    private String Result_ID;
    @JsonFormat(pattern = "yyyy-mm-dd", timezone = "GMT+8")
    private Date Result_Time;
    private float Result_Amount;
}
