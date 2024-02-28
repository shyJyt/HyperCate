package org.ctrlacv.service;

import org.ctrlacv.dto.CategoryDTO;
import org.ctrlacv.dto.CategoryPageQueryDTO;
import org.ctrlacv.entity.Category;
import org.ctrlacv.result.PageResult;
import java.util.List;

public interface CategoryService {

    /**
     * 新增分类
     * 
     * @param categoryDTO
     */
    void save(CategoryDTO categoryDTO);

    /**
     * 分页查询
     * 
     * @param categoryPageQueryDTO
     * @return
     */
    PageResult<Category> pageQuery(CategoryPageQueryDTO categoryPageQueryDTO);

    /**
     * 根据id删除分类
     * 
     * @param id
     */
    void deleteById(Long id);

    /**
     * 修改分类
     * 
     * @param categoryDTO
     */
    void update(CategoryDTO categoryDTO);

    /**
     * 启用、禁用分类
     * 
     * @param status
     * @param id
     */
    void startOrStop(Integer status, Long id);

    /**
     * 根据类型查询分类
     * 
     * @param type
     * @return
     */
    List<Category> list(Integer type);
}
