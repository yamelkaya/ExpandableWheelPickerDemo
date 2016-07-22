package io.centaurea.expandablewheelpickerdemo;

import android.content.Context;
import android.util.AttributeSet;

import com.aigestudio.wheelpicker.WheelPicker;

/**
 * Created by Natasha on 22.07.16.
 */
public class CustomizedWheelPicker extends WheelPicker {
    public CustomizedWheelPicker(Context context) {
        super(context);
        setDefaults();
    }

    public CustomizedWheelPicker(Context context, AttributeSet attributeSet){
        super(context,attributeSet);
        setDefaults();
    }

    private void setDefaults(){
        setCurved(true);
        setItemTextColor(0xFF888888);
        setSelectedItemTextColor(0xFF333333);
        setItemSpace(27);
        setItemTextSize(54);
        setAtmospheric(true);
    }
}
