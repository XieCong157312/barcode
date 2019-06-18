package com.sbs.barcode.mapper;

import com.sbs.barcode.pojo.TicketFlag;
import com.sbs.barcode.pojo.TicketFlagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TicketFlagMapper {
    int countByExample(TicketFlagExample example);

    int deleteByExample(TicketFlagExample example);

    int deleteByPrimaryKey(String flagId);

    int insert(TicketFlag record);

    int insertSelective(TicketFlag record);

    List<TicketFlag> selectByExample(TicketFlagExample example);

    TicketFlag selectByPrimaryKey(String flagId);

    int updateByExampleSelective(@Param("record") TicketFlag record, @Param("example") TicketFlagExample example);

    int updateByExample(@Param("record") TicketFlag record, @Param("example") TicketFlagExample example);

    int updateByPrimaryKeySelective(TicketFlag record);

    int updateByPrimaryKey(TicketFlag record);
}