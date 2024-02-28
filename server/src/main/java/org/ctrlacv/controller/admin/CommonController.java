package org.ctrlacv.controller.admin;

import org.ctrlacv.constant.MessageConstant;
import org.ctrlacv.result.Result;
import org.ctrlacv.utils.QiniuOssUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("/admin/common")
@Api(tags = "公共接口")
@Slf4j
public class CommonController {
    @Autowired
    private QiniuOssUtil qiniuOssUtil;

    @PostMapping("/upload")
    @ApiOperation("上传文件")
    public Result<String> upload(MultipartFile file) {
        log.info("上传文件：{}", file);

        try {
            String originalFilename = file.getOriginalFilename();
            String extension = originalFilename.substring(originalFilename.lastIndexOf("."));
            String fileName = UUID.randomUUID().toString() + extension;
            FileInputStream fileInputStream = (FileInputStream) file.getInputStream();
            String filePath = qiniuOssUtil.upload(fileInputStream, fileName);
            log.info("上传文件成功：{}", filePath);
            return Result.success(filePath);
        } catch (IOException e) {
            log.error("上传文件失败", e);
        }

        return Result.error(MessageConstant.UPLOAD_FAILED);
    }
}
