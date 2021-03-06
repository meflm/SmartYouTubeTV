package com.liskovsoft.smartyoutubetv.flavors.exoplayer.youtubeinfoparser;

import android.net.Uri;
import com.liskovsoft.smartyoutubetv.flavors.exoplayer.youtubeinfoparser.parser.items.YouTubeGenericInfo;

import java.io.InputStream;

public abstract class OnMediaFoundCallback {
    public void onVideoFound(InputStream mpdContent){}
    public void onLiveFound(Uri hlsUrl){}
    public void onInfoFound(YouTubeGenericInfo info){}
}
