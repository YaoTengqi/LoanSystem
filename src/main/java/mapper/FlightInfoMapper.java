package mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface FlightInfoMapper
{
   public ArrayList<FlightInfo> FlightInfoQuery(String startPos, String endPos );
}
