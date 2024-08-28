package com.ZengXiangRui.UploadProvider.controller;

import com.ZengXiangRui.UploadProvider.component.JsonComponent;
import com.ZengXiangRui.UploadProvider.services.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("all")
@RestController
@RequestMapping("/api/upload")
public class UploadController {

    @Autowired
    UploadService uploadService;

    @Autowired
    JsonComponent jsonComponent;

    @PostMapping("/alipay")
    private String uploadAliPay() {
        return jsonComponent.objectToJson("hello");
    }
}
