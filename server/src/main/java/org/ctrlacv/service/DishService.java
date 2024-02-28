package org.ctrlacv.service;

import org.ctrlacv.dto.DishDTO;
import org.ctrlacv.dto.DishPageQueryDTO;
import org.ctrlacv.result.PageResult;

import java.util.List;

public interface DishService {

    public void saveWithFlavor(DishDTO dishDTO);

    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    void deleteBatch(List<Long> ids);
}
