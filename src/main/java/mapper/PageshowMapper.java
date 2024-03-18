package mapper;

import Bean.Inovice;
import Bean.SeatSelect;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PageshowMapper {
    public int findTotalCount(String order_id);

    public List<SeatSelect> findByPage(String order_id, int begin, int end);

    public int findTotalPage();

    public List<Inovice> findTotalOrder(String customer_id);

}
