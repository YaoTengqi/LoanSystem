package Bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inovice {
    private String order_id;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    private Date select_date;
    private String customer_id;
    private String agency_id;
    private String airp_id;
    private String seat_id;
    private String seat_level;
    private float payment;
    private float payment_real;
    private int state;

    private String start_pos;
    private String dest_pos;
}
