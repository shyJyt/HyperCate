package com.sky.utils;

import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.InputStream;

@Data
@AllArgsConstructor
@Slf4j
public class QiniuOssUtil {

    private String accessKey;
    private String secretKey;
    private String bucket;
    private String domain;

    public String upload(FileInputStream fileInputStream, String fileName) {
        log.info("上传文件：{}", fileName);

        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);
        UploadManager uploadManager = new UploadManager(new Configuration());

        try {
            Response response = uploadManager.put(fileInputStream, fileName, upToken, null, null);

            return domain + "/" + fileName;
        } catch (QiniuException e) {
            e.printStackTrace();
        }

        return null;
    }
}
