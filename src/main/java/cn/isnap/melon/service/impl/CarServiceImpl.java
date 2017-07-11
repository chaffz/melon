package cn.isnap.melon.service.impl;

import cn.isnap.melon.dao.CarBrandMapper;
import cn.isnap.melon.model.CarBrand;
import cn.isnap.melon.service.ICarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author XIAOXIN
 * @date Created on 2017/7/6 15:41
 */
@Service("carService")
public class CarServiceImpl implements ICarService {
    @Resource
    public CarBrandMapper carBrandMapper = null;

    @Override
    public Map<String, List<Map>> getCarBrands() {
        Map<String, List<Map>> result = new HashMap<>();
        List brands = carBrandMapper.getAllBrands();
        for (Object obj :
                brands) {
            Map dict = (Map)obj;
            String pinyin = dict.get("pinyin").toString();
            dict.remove("pinyin");

            if (result.containsKey(pinyin)) {
                result.get(pinyin).add(dict);
            }
            else {
                List list = new ArrayList();
                list.add(dict);
                result.put(pinyin, list);
            }
        }
        return result;
    }

    public String getDefaultId() {
        CarBrand brand = carBrandMapper.selectByPrimaryKey((short) 100);
        if (brand != null) {
            return brand.getTitle();
        }
        return null;
    }
}
