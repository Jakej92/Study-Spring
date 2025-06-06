package com.app.filetest.domain.vo;


import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class FileVO {
    @EqualsAndHashCode.Include
    private Long id;
    private String filePath;
    private String fileName;
    private String fileSize;
    private String createDate;
    private String updateDate;
}
