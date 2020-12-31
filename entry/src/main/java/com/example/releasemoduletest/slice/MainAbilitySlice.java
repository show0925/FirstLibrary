package com.example.releasemoduletest.slice;

import com.example.releasemoduletest.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;

//import com.example.firstreleaselibrary.*;
import ohos.hiviewdfx.HiLog;

public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);

        HiLog.info(null, "开始测试远程maven依赖库");

        //TestReleaseLibrary test = new TestReleaseLibrary();
        //test.test();
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
