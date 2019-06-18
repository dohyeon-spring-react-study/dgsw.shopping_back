package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Domain.User;
import kr.hs.dgsw.shopping_back.Domain.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserServiceImpl implements  UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Long add(User user) {
        HashMap map = new HashMap<String, Object>();
        map.put("account", user.getAccount());
        map.put("password", user.getPassword());
        map.put("name", user.getName());
        map.put("callnumber", user.getCallnumber());
        map.put("phonenumber", user.getPhonenumber());
        map.put("zipcode", user.getZipcode());
        map.put("address", user.getAddress());
        map.put("email", user.getEmail());
        map.put("mileage", user.getMileage());
        return userMapper.add(map);
    }

    @Override
    public User findById(String account) {
        return userMapper.findById(account);
    }
}
