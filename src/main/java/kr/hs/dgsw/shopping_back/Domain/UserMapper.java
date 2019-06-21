package kr.hs.dgsw.shopping_back.Domain;


import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface UserMapper {

    Long add(HashMap<String, Object> map);
    User findUser(HashMap<String, Object> map);
}
