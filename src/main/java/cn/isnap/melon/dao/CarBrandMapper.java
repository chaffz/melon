package cn.isnap.melon.dao;

import cn.isnap.melon.model.CarBrand;

public interface CarBrandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_brand
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Short id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_brand
     *
     * @mbggenerated
     */
    int insert(CarBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_brand
     *
     * @mbggenerated
     */
    int insertSelective(CarBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_brand
     *
     * @mbggenerated
     */
    CarBrand selectByPrimaryKey(Short id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_brand
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CarBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_brand
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CarBrand record);
}