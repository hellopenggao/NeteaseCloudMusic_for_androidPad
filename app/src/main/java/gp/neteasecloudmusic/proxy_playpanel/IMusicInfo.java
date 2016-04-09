package gp.neteasecloudmusic.proxy_playpanel;

/**
 * Created by hellogaopeng on 2016/4/8.
 */
public interface IMusicInfo {
    enum Apple{
        red,green
    }
    String getMusicName();
    String getMusicAuthor();
    String getMusicCoverUrl();
    String getMusicID();
    String getMusicTotalTime();
    String getMusicCurrentTime();
}
