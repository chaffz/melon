package cn.isnap.melon.service;

import java.util.List;
import java.util.Map;

/**
 * user service interface
 *
 * @author XIAOXIN
 * @date Created on 2017/6/15 10:54
 */
public interface ICarService {
    String getDefaultId();
    Map<String, List<Map>> getCarBrands();
}
