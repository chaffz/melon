package cn.isnap.melon.service.impl;

import cn.isnap.melon.dao.CarBrandMapper;
import cn.isnap.melon.model.CarBrand;
import cn.isnap.melon.service.ICarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author XIAOXIN
 * @date Created on 2017/7/6 15:41
 */
@Service("carService")
public class CarServiceImpl implements ICarService {
    @Resource
    public CarBrandMapper carBrandMapper = null;

    public String getDefaultId() {
        CarBrand brand = carBrandMapper.selectByPrimaryKey((short) 100);
        if (brand != null) {
            return brand.getTitle();
        }
        return null;
    }
}
