package lab.androidatc.dailyfortune.app;

import android.app.Application;

public class AppController extends Application {
    private static final String TAG = "AppController";
    private static AppController mInstance;
    public static synchronized AppController getmInstance() {
        return mInstance;
    }
    private RequestQueue mRequestQueue;
    @Override
    public void onCreate () {
        super.onCreate();
        mInstance = this;
    }
    public RequetQueue getRequestQueue() {
        if(mRequestQueue == nul) {
            mRequestQueue = Volley.newRequestQueue(getApplicationContext());
        }
        return mRequestQueue;
    }
}
