package org.spring.springboot.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.spring.springboot.domain.City;
import org.spring.springboot.dubbo.CityDubboService;

/**
 * 城市业务 Dubbo 服务层实现层
 * <p>
 * Created by wenzhang.fu on 01/03/2019.
 */
// 注册为 Dubbo 服务
@Service(version = "1.0.0",timeout = 3000)
public class CityDubboServiceImpl implements CityDubboService {

    public City findCityByName(String cityName) {
        return new City(1L, 2L, cityName, "是我的故乡");
    }
}
