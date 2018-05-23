package com.example.demo.util;

import com.example.demo.vo.CityList;
import com.sun.media.jfxmedia.events.BufferListener;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by WU on 2018/5/23.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class XmlBuilderTest {

    @Test
    public void getXmlTest() throws Exception {
        ClassPathResource cityList = new ClassPathResource("citylist.xml");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(cityList.getInputStream(), "utf-8"));
        StringBuffer stringBuffer = new StringBuffer();
        String line ="";
        while ((line=bufferedReader.readLine())!=null){
            stringBuffer.append(line);
        }
        CityList list   = (CityList)XmlBuilder.xmlStrToOject(CityList.class, stringBuffer.toString());
        list.getCityList().forEach(city -> {
            System.out.println(city.getCityName());
        });
    }
}
