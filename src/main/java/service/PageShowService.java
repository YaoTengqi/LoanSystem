package service;

import Bean.Inovice;
import Bean.SeatSelect;

import java.util.List;

public interface PageShowService {
    List<Inovice> orderQuery(String customer_id);

    public int getTotalPage();
}
