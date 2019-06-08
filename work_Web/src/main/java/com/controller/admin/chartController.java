package com.controller.admin;

import com.hcf.service.AdminService;
import com.hcf.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/admin/echart")
public class chartController {

    @Autowired
    private StatisticsService statisticsService;

    @RequestMapping("/chart")
    public String chart() { return "manage/echart/chart"; }
    @RequestMapping("/orderChart")
    public String orderChart() { return "manage/echart/orderChart"; }
    @RequestMapping("/goodsChart")
    public String goodsChart() { return "manage/echart/goodsChart"; }

    @RequestMapping("/getColumn")
    @ResponseBody
    public List<String> getColumn()
    {
        return statisticsService.getAllStatistics();
    }

    @RequestMapping("/getOrderStoreAndCarteen")
    @ResponseBody
    public List<String> getOrderStoreAndCarteen()
    {
        return statisticsService.getOrderStoreAndCarteen();
    }

    @RequestMapping("/getGoodsData")
    @ResponseBody
    public String getGoodsData()
    {
        return statisticsService.getGoodsName_Star_cmtnum();
    }
}
