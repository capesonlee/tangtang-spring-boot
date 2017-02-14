package com.lijuyong.Domain.dao.mapper;

import com.lijuyong.Domain.dao.model.UserDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by john on 2017/2/12.
 */

@Mapper
public interface UserMapper {
    UserDO showUser(Integer id);
}
