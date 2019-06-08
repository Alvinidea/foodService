package com.hcf.service;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public interface PicService {

    public int setStoreInfo_Pic(String storeid,String address);

    public int upload(MultipartFile multipartFile, HttpSession session,String id,String type);

    public String uploads(MultipartFile[] multipartFile, HttpSession session,String id,String type);
}
