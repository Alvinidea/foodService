package com.controller;


import com.hcf.pojo.TbUser;
import com.hcf.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/excel")
public class ExcelController {

    @Autowired
    private ExcelService excelService;
    @RequestMapping("/importMemExcel")
    @ResponseBody
    public List<TbUser> importMemExcel(@RequestParam("file")MultipartFile multipartFile, HttpSession session)
    {
        excelService.upload(multipartFile,session,"111111","user");
        List<TbUser> users = excelService.read(session);
        return users;
    }
}
