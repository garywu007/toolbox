package com.gw.toolbox.heartbeat;

import org.jsoup.Connection;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Heart {
    
	public void demoHtmlUnit(String url) throws Exception {
		Connection con = Jsoup.connect(url);// 获取连接
		con.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36");// 配置模拟浏览器
		Response rs = con.execute();// 获取响应
		Document d1 = Jsoup.parse(rs.body());// 转换为Dom树
		String successCheck = d1.getElementsByTag("body").first().html();
	}
}
