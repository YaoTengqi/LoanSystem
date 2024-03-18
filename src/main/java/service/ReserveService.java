package service;

import Bean.SeatSelect;
import org.springframework.stereotype.Service;

@Service
public interface ReserveService {
    public void insertReserveInfoS(SeatSelect seatSelect);
}

