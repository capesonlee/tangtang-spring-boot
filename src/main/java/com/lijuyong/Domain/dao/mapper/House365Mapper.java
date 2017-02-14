package com.lijuyong.Domain.dao.mapper;

import com.lijuyong.Domain.dao.model.LinkDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by john on 2017/2/12.
 */
@Mapper
public interface House365Mapper {
    List<LinkDO> listUrl();
    List<LinkDO> findUrls(String urlId);
}
