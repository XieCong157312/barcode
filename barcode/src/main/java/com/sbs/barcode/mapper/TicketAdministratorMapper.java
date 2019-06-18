package com.sbs.barcode.mapper;

import com.sbs.barcode.pojo.TicketAdministrator;
import com.sbs.barcode.pojo.TicketAdministratorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TicketAdministratorMapper {
    int countByExample(TicketAdministratorExample example);

    int deleteByExample(TicketAdministratorExample example);

    int deleteByPrimaryKey(String userCode);

    int insert(TicketAdministrator record);

    int insertSelective(TicketAdministrator record);

    List<TicketAdministrator> selectByExample(TicketAdministratorExample example);

    TicketAdministrator selectByPrimaryKey(String userCode);

    int updateByExampleSelective(@Param("record") TicketAdministrator record, @Param("example") TicketAdministratorExample example);

    int updateByExample(@Param("record") TicketAdministrator record, @Param("example") TicketAdministratorExample example);

    int updateByPrimaryKeySelective(TicketAdministrator record);

    int updateByPrimaryKey(TicketAdministrator record);
}