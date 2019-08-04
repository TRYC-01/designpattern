/**
 * FileName: Mp4Player
 * Author:   lenovo
 * Date:     2019/8/4 20:41
 * Description:
 * History:
 */
package com.tryc.designpattern.structuretype.adapter;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVle(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 filen.Name:" + fileName);
    }
}
