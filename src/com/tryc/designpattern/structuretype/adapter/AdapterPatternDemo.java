/**
 * FileName: AdapterPatternDemo
 * Author:   lenovo
 * Date:     2019/8/4 20:52
 * Description: 使用AudioPlayer播放不同类型的音频格式
 * History:
 */
package com.tryc.designpattern.structuretype.adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");

    }
}
