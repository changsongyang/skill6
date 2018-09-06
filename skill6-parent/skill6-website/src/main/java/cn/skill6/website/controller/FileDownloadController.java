package cn.skill6.website.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileUploadException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.skill6.common.entity.vo.ResponseJson;
import cn.skill6.service.basic.FileDownloadSvc;

/**
 * 文件存储控制器
 *
 * @author 何明胜
 * @version 1.0.1
 * @since 2018年9月4日 下午9:49:27
 */
@RestController
public class FileDownloadController {

  @Autowired
  @Qualifier("fileDownloadSvcImpl")
  private FileDownloadSvc fileDownloadSvc;

  @PostMapping(value = "/file")
  public ResponseJson uploadFile(HttpServletRequest request)
      throws IOException, FileUploadException {

    return fileDownloadSvc.uploadFile(request);
  }
}
