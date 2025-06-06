package com.app.filetest.domain.vo;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class SendMessageFileVO {

    @EqualsAndHashCode.Include
    private Long id;

    private Long sendMessageId;
    private Long fileId;



}
