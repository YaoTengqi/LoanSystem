package controller;

import Bean.Client;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.impl.ClientServiceImpl;

@Controller
public class SaveClientController {
    ClientServiceImpl clientService;

    // save clients information
    @RequestMapping
    public String saveClientsInformation(@RequestParam(value = "Name") String Name,
                                         @RequestParam(value = "Gender") Boolean Gender,
                                         @RequestParam(value = "ID") String ID,
                                         @RequestParam(value = "Phone_Number") String Phone_Number) {

        if (Name.equals(null) || Gender.equals(null) || ID.equals(null) || Phone_Number.equals(null)) {
            //需要全体信息
        } else {
            Client client = new Client(Name, Gender, ID, Phone_Number);
            clientService.addClient(client);//将client对象录入数据库
        }
        return "success";//返回录入成功页面
    }

}
