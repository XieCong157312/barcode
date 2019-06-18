package com.sbs.barcode.mapper;

import com.sbs.barcode.pojo.TicketMain;
import com.sbs.barcode.pojo.TicketMainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TicketMainMapper {
    int countByExample(TicketMainExample example);

    int deleteByExample(TicketMainExample example);

    int deleteByPrimaryKey(String barcode);

    int insert(TicketMain record);

    int insertSelective(TicketMain record);

    List<TicketMain> selectByExample(TicketMainExample example);

    TicketMain selectByPrimaryKey(String barcode);

    int updateByExampleSelective(@Param("record") TicketMain record, @Param("example") TicketMainExample example);

    int updateByExample(@Param("record") TicketMain record, @Param("example") TicketMainExample example);

    int updateByPrimaryKeySelective(TicketMain record);

    int updateByPrimaryKey(TicketMain record);
}