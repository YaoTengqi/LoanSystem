package Bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Sales extends Employee {
    private int Performance;
    private String Area;
}
