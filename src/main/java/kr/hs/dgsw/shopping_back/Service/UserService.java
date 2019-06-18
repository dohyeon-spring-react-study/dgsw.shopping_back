package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Domain.User;

public interface UserService {
    Long add(User user);
    User findById(String account);
}
