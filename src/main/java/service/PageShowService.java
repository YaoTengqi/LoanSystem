package service;

import java.util.List;

public interface PageShowService {
    List<Inovice> orderQuery(String customer_id);

    public int getTotalPage();
}
