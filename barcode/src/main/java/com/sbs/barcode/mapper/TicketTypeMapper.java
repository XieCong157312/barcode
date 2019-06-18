package com.sbs.barcode.mapper;

import com.sbs.barcode.pojo.TicketType;
import com.sbs.barcode.pojo.TicketTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TicketTypeMapper {
    int countByExample(TicketTypeExample example);

    int deleteByExample(TicketTypeExample example);

    int deleteByPrimaryKey(String ticketTypeId);

    int insert(TicketType record);

    int insertSelective(TicketType record);

    List<TicketType> selectByExample(TicketTypeExample example);

    TicketType selectByPrimaryKey(String ticketTypeId);

    int updateByExampleSelective(@Param("record") TicketType record, @Param("example") TicketTypeExample example);

    int updateByExample(@Param("record") TicketType record, @Param("example") TicketTypeExample example);

    int updateByPrimaryKeySelective(TicketType record);

    int updateByPrimaryKey(TicketType record);
}