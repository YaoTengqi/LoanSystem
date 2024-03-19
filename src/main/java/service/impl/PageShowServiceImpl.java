package service.impl;

import mapper.PageshowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageShowServiceImpl implements service.PageShowService {
    @Autowired
    PageshowMapper pageshowMapper;

    @Override
    public List<Inovice> orderQuery(String customer_id) {
        List<Inovice> list_order = pageshowMapper.findTotalOrder(customer_id);
        return list_order;
    }

    @Override
    public int getTotalPage() {
        return pageshowMapper.findTotalPage();
    }
}
