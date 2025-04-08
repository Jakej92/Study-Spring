package com.app.filetest.mapper;

import com.app.filetest.domain.dto.ReceiveMessageDTO;
import com.app.filetest.domain.vo.FileVO;
import com.app.filetest.domain.vo.ReceiveMessageFileVO;
import com.app.filetest.domain.vo.ReceiveMessageVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ReceiveMessageMapper {

    // 받은 메시지 저장
    void insertReceiveMessage(ReceiveMessageVO receiveMessageVO);

    // 받은 메시지 조회
    List<ReceiveMessageDTO> selectReceiveMessagesByReceiverId(Long receiverId);

    // 받은 메시지 삭제
    void deleteReceiveMessageById(Long messageId);

}
