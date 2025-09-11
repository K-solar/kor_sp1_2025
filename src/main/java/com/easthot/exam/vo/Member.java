package com.easthot.exam.vo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class Member {

    private String loginId;
    private String loginPw;
    private String nickName;
    private String email;
    private String phone;
    private String address;

}
