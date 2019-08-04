/**
 * FileName: VlcPlayer
 * Author:   lenovo
 * Date:     2019/8/4 20:40
 * Description:
 * History:
 */
package com.tryc.designpattern.structuretype.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVle(String fileName) {
        System.out.println("Playing vlc file.Name:" + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
