/**
 * FileName: AudioPlayer
 * Author:   lenovo
 * Date:     2019/8/4 20:48
 * Description: 实现MediaPlayer接口的实现类
 * History:
 */
package com.tryc.designpattern.structuretype.adapter;

public class AudioPlayer implements MediaPlayer{
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if ("mp3".equalsIgnoreCase(audioType)) {
            System.out.println("Playing mp3 file.Name:" + fileName);
        } else if ("vlc".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType)) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media." + audioType + "format not supporteed");
        }
    }
}
