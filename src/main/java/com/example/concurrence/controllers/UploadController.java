package com.example.concurrence.controllers;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by cuiyy on 2018/1/10.
 */
@Controller
public class UploadController {

    @ResponseBody
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public void Upload(MultipartFile file) throws IOException {
        FileUtils.writeByteArrayToFile(new File("e:/ftp_Holder/" + file.getOriginalFilename()), file.getBytes());
    }
    @RequestMapping(value = "/upload",method = RequestMethod.GET)
    public String index() {
        return "upload";
    }
}
