package com.ZengXiangRui.UploadProvider.services.impl;

import com.ZengXiangRui.UploadProvider.services.UploadService;
import org.springframework.stereotype.Service;

@Service
public class UploadServiceImpl implements UploadService {

    @Override
    public String UploadAliPay() {
        return "hello word";
    }
}
