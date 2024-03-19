package Bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Migrate_Log {
    private String Migrate_ID;
    private String Sales_ID;
    private String Client_ID;
    private String Migrate_Information;
}
