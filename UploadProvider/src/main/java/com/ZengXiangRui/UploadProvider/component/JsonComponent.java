package com.ZengXiangRui.UploadProvider.component;

import com.google.gson.Gson;
import org.springframework.stereotype.Component;

@Component
public class JsonComponent {
    private Gson gson = new Gson();

    public String objectToJson(Object object) {
        return gson.toJson(object);
    }
}
