package me.youchai.reactnative.jaq;

import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import com.alibaba.wireless.security.jaq.JAQException;
import com.alibaba.wireless.security.jaq.SecurityInit;

public class RNJaqModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RNJaqModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNJaq";
    }

    @ReactMethod
    public void init() {
        //初始化
        try {
            SecurityInit.Initialize(getApplicationContext());
        } catch (JAQException e) {
            Log.e("JAQ", "errorCode =" + e.getErrorCode());
        }
        SecurityInit.Initialize(reactContext);
    }

    @ReactMethod
    public String encryptText(String text) {
        return text;
    }
}
