package com.example.demo.controller;

import com.example.demo.service.CityDataService;
import com.example.demo.service.WeatherDataService;
import com.example.demo.vo.City;
import com.example.demo.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hbl on 2018/5/22.
 */
@RestController
public class indexController {

    @RequestMapping("/index")
    public String indexTest(){
        return  "index" ;
    }

    @Autowired
    private WeatherDataService weatherDataService;

    @Autowired
    private CityDataService cityDataService;

//    @GetMapping("/cityId/{cityId}") 由于tomcat高版本对url 有严格的要求 故不适用
    @GetMapping("/cityId")
//    public WeatherResponse getWeatherByCityId(@PathVariable("cityId") String cityId) {
    public WeatherResponse getWeatherByCityId(String cityId) {
        return weatherDataService.getDataByCityId(cityId);
    }

    @RequestMapping("/cityName")
//    @GetMapping("/cityName/{cityName}")
//    public WeatherResponse getWeatherByCityName(@PathVariable("cityName") String cityName) {
    public WeatherResponse getWeatherByCityName(String cityName) {
        return weatherDataService.getDataByCityName(cityName);
    }

    @RequestMapping("/cityNamePath/{cityName}")
    public WeatherResponse getWeatherByCityNamePath(@PathVariable("cityName") String cityName) {
        return weatherDataService.getDataByCityName(cityName);
    }

    @GetMapping("/citys")
    public List<City> getWeatherByCityName() throws Exception {
        return  cityDataService.listCity();
    }


}