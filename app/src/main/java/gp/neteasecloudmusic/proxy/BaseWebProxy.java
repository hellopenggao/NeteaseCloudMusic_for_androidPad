package gp.neteasecloudmusic.proxy;

import android.webkit.WebView;

/**
 * Created by hellogaopeng on 2016/4/7.
 */
public abstract class BaseWebProxy {
    protected WebView mWebView;

    public BaseWebProxy(WebView w) {
        mWebView = w;
    }

    public WebView getmWebView() {
        return mWebView;
    }

    /**
     * play music
     */
    public abstract void musicPlay();

    /**
     * play music from a time
     *
     * @param beginTime play music from the time
     */
    public abstract void musicPlay(int beginTime);

    /**
     * pause music
     */
    public abstract void musicPause();

    /**
     * position on
     *
     * @param position position music on the time
     */
    public abstract void musicPositionOn(int position);
    /**
     *
     */
}
