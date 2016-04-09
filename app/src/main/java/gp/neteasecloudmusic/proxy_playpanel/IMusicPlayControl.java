package gp.neteasecloudmusic.proxy_playpanel;

/**
 * Created by hellogaopeng on 2016/4/7.
 */
public interface IMusicPlayControl {
    /**
     * play music
     */
     void musicPlay();

    /**
     * play music from a time
     *
     * @param beginTime play music from the time
     */
     void musicPlay(int beginTime);

    /**
     * pause music
     */
     void musicPause();

    /**
     * position on
     *
     * @param position position music on the time
     */
     void setMusicPositionOn(int position);

    /**
     * previous music
     */
     void previousMusic();

    /**
     * next music
     */
     void nextMusic();

     void setVolume(int volume);
     void setPlayMode(int mode);
     void collectCurrentMusic();

}
