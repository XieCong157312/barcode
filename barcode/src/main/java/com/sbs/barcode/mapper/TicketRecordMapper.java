package com.sbs.barcode.mapper;

import com.sbs.barcode.pojo.TicketRecord;
import com.sbs.barcode.pojo.TicketRecordExample;
import com.sbs.barcode.pojo.TicketRecordKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TicketRecordMapper {
    int countByExample(TicketRecordExample example);

    int deleteByExample(TicketRecordExample example);

    int deleteByPrimaryKey(TicketRecordKey key);

    int insert(TicketRecord record);

    int insertSelective(TicketRecord record);

    List<TicketRecord> selectByExample(TicketRecordExample example);

    TicketRecord selectByPrimaryKey(TicketRecordKey key);

    int updateByExampleSelective(@Param("record") TicketRecord record, @Param("example") TicketRecordExample example);

    int updateByExample(@Param("record") TicketRecord record, @Param("example") TicketRecordExample example);

    int updateByPrimaryKeySelective(TicketRecord record);

    int updateByPrimaryKey(TicketRecord record);
}