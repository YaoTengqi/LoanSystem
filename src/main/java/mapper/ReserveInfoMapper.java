package mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReserveInfoMapper {
    public void insertReserveInfo( SeatSelect seatSelect);
}
