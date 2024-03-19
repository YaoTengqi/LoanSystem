package service.impl;

import mapper.ReserveInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReserveServiceImpl implements service.ReserveService
{
    @Autowired
    ReserveInfoMapper reserveInfoMapper;

    @Override
    public void insertReserveInfoS(SeatSelect seatSelect) {
        reserveInfoMapper.insertReserveInfo(seatSelect);
    }
}
