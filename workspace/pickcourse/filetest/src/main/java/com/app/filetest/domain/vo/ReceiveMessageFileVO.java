package com.app.filetest.domain.vo;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ReceiveMessageFileVO {

    @EqualsAndHashCode.Include
    private Long id;

    private Long receiveMessageId;
    private Long fileId;
}
