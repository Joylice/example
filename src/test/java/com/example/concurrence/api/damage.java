package com.example.concurrence.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.Random;

/**
 * Created by cuiyy on 2018/1/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class damage {
    String[] bridgeName = new String[]{"石首大桥", "棋盘洲大桥", "a大桥", "b大桥"};
    String[] partName = new String[]{"a主梁", "b主梁", "c主梁", "d主梁"};
    String[] assemblyUnitName = new String[]{"a支座", "b支座", "c支座", "d支座"};
    String[] componentName = new String[]{"a桥墩", "b桥墩", "c桥墩", "d桥墩"};
    String[] subcomponentName = new String[]{"a墩台基出", "b墩台基础", "c墩台基础", "d墩台基础"};
    String[] damageType = new String[]{"墩台裂缝a", "墩台裂缝b", "墩台裂缝c", "墩台裂缝d"};
    String[] damageDesc = new String[]{"细微裂缝d若干", "细微裂缝c若干", "细微裂缝b若干", "细微裂缝a若干"};
    String[] finder = new String[]{"张大", "李而", "张三", "李四"};
    String[] picUrls = new String[]{"url1", "url2", "url3", "url4"};

    @Test
    public void damageAPI() {
        Random random = new Random();
        Integer var = random.nextInt(4);
        System.out.println("随机数：" + var);
        ApiServiceService apiServiceService = new ApiServiceService();
        ApiService apiService = apiServiceService.getApiServicePort();
        String status = apiService.saveDamage(bridgeName[var], partName[var],
                assemblyUnitName[var], componentName[var], subcomponentName[var],
                damageType[var], damageDesc[var], 0, 0, null
                , finder[var], picUrls[var]);
        System.out.println("返回状态码：" + status);
    }
}
