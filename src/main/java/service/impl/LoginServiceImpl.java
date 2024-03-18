package service.impl;

import Bean.Customer;
import mapper.CustormerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements com.atguigu.demo05.service.LoginService {
    @Autowired
    CustormerMapper custormerMapper;

    public Customer getCustByid(String id) {
        return custormerMapper.getCust(id);
    }
}
