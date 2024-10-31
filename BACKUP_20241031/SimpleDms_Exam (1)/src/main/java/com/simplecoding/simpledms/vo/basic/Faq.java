package com.simplecoding.simpledms.vo.basic;

import lombok.*;

/**
 * @author : KTE
 * @fileName : Faq
 * @since : 24. 10. 25.
 * description :
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Faq {
//    TODO: 대/소문자 단축키 : ctrl + shift + u
//    TODO: 줄복사 단축키    : ctrl + d
    private Integer fno;   // 기본키
    private String  title;
    private String  content;
}
