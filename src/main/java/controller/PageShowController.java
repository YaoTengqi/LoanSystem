package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class PageShowController {
    @Autowired
    PageShowServiceImpl pageShowService;


    @RequestMapping("/订单管理.html")
    public String pageQuery(ModelMap map, HttpSession session) {
        String userId = (String) session.getAttribute("userId");
        List<Inovice> invoice_list = pageShowService.orderQuery(userId);//返回某一用户所有的订单

        map.addAttribute("invoice_list", invoice_list);

        return "订单管理";
    }
}
