package com.app.filetest.mapper;

import com.app.filetest.domain.vo.FileVO;
import com.app.filetest.domain.vo.SendMessageFileVO;
import com.app.filetest.domain.vo.SendMessageVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SendMessageMapper {

    // 보낸 메시지 저장
    void insertSendMessage(SendMessageVO sendMessageVO);

    // 보낸 메시지 조회
    SendMessageVO selectSendMessageById(Long messageId);

    // 보낸 메시지 목록 조회
    List<SendMessageVO> selectSendMessagesBySenderId(Long senderId);

    // 보낸 메시지 삭제
    void deleteSendMessageById(Long messageId);


}
