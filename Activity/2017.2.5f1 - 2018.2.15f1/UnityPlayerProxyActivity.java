package com.unity3d.player;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * @deprecated Use UnityPlayerActivity instead.
 */
public class UnityPlayerProxyActivity extends Activity
{
    @Override protected void onCreate (Bundle savedInstanceState)
    {
        Log.w("Unity", "UnityPlayerProxyActivity has been deprecated, please update your AndroidManifest to use UnityPlayerActivity instead");
        super.onCreate(savedInstanceState);
    }
}
