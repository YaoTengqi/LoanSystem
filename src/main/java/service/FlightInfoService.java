package service;

import Bean.FlightInfo;

import java.util.ArrayList;

public interface FlightInfoService {
    public ArrayList<FlightInfo> FlightInfoQueryS(String startPos, String endPos );
}
