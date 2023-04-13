package com.macro.mall.mapper;

import com.macro.mall.model.OrmUser;
import com.macro.mall.model.OrmUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrmUserMapper {
    long countByExample(OrmUserExample example);

    int deleteByExample(OrmUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrmUser row);

    int insertSelective(OrmUser row);

    List<OrmUser> selectByExample(OrmUserExample example);

    OrmUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") OrmUser row, @Param("example") OrmUserExample example);

    int updateByExample(@Param("row") OrmUser row, @Param("example") OrmUserExample example);

    int updateByPrimaryKeySelective(OrmUser row);

    int updateByPrimaryKey(OrmUser row);
}