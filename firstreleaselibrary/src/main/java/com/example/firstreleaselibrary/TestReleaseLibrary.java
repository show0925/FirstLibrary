package com.example.firstreleaselibrary;

import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;

public class TestReleaseLibrary {
    private static final HiLogLabel label = new HiLogLabel(HiLog.LOG_APP, 0x011010, "测试网络图片加载");

    public void test(){
        HiLog.info(label, "发布库调试成功");
    }
}
