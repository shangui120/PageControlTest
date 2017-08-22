package com.lanou.mapper;

import com.lanou.bean.Message;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dllo on 17/8/22.
 */
@Repository
public interface MessageMapper {
    @Select("select *from message")
    List<Message> findMessage();
}
