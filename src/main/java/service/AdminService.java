package service;

import Bean.AdminFlight;
import Bean.AdminView;
import Bean.Aircom;

import java.util.List;

public interface AdminService {
    public List<AdminView> getCustInfo(String airp_id, String start_time, String cust_name, String aircom_id);

    public List<AdminView> getAllCustInfo();

    public List<AdminFlight> getAllFilghtInfo();

    public List<AdminFlight> getFlightInfo(String airp_id, String start_pos, String dest_pos, String start_time, String aircom_id);

    public void changeCustInfo();

    public List<Aircom> getAircom();
}
