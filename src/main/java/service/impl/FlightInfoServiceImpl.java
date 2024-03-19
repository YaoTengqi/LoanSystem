package service.impl;

import mapper.FlightInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FlightInfoServiceImpl implements com.atguigu.demo05.service.FlightInfoService {
    @Autowired
    FlightInfoMapper flightInfoMapper;

    @Override
    public ArrayList<FlightInfo> FlightInfoQueryS(String startPos, String endPos) {
        return flightInfoMapper.FlightInfoQuery(startPos, endPos);
    }
}
