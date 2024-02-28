package com.sky.controller.admin;

import com.sky.constant.RedisKeyConstant;
import com.sky.result.Result;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

@RestController("adminShopController")
@RequestMapping("/admin/shop")
@ApiOperation("店铺相关接口")
@Slf4j
public class ShopController {

    @Autowired
    private RedisTemplate redisTemplate;

    @PutMapping("/{status}")
    @ApiOperation("设置店铺状态")
    public Result setStatus(@PathVariable Integer status) {
        log.info("设置店铺状态为：{}", status == 1 ? "营业中" : "休息中");
        redisTemplate.opsForValue().set(RedisKeyConstant.SHOP_STATUS, status);
        return Result.success();
    }

    @GetMapping("/status")
    @ApiOperation("获取店铺状态")
    public Result<Integer> getStatus() {
        Integer status = (Integer) redisTemplate.opsForValue().get(RedisKeyConstant.SHOP_STATUS);
        log.info("获取店铺状态为：{}", status == 1 ? "营业中" : "休息中");
        return Result.success(status);
    }
}
