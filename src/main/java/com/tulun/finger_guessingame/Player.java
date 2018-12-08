package com.tulun.finger_guessingame;

import lombok.*;

/**
 * @author:liguozheng
 * @Date:2018/12/8
 * @time:12:57
 * @description:
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Player {

    private String name;
    private int score;
    private String inPut;
}
