package controller;

import service.impl.ReserveServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Random;

@Controller
public class ReserveController {
    @Autowired
    ReserveServiceImpl reserveService;

    //    air_id=111&type=经济舱&nation=1&name=1&id=1&tel=1
    @GetMapping("/reserve")
    public String bookTicket(@RequestParam("air_id") String air_id,
                             @RequestParam("type") String typre,
                             @RequestParam("nation") String nation,
                             @RequestParam("name") String name,
                             @RequestParam("tel") String tel,
                             HttpSession session) {
        //生成随机订单号
        int length = 10;
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer orderID = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            orderID.append(base.charAt(number));
        }
        String id = orderID.toString();
        String userId = (String) session.getAttribute("userId");
        SeatSelect seatSelect = new SeatSelect(id, new Date(), userId, " ", air_id, "B2-03", typre, 500, 500, 0);

        reserveService.insertReserveInfoS(seatSelect);
        return "支付成功";
    }
}
