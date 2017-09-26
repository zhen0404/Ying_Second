package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016081500253379";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC5vZcaDcaY1EcrBSNN3rwVvxyEhGlXF0//XTphhSaGBqHHwsrhEmFurr2BJkgecgn2Krx7syaUmhIj3qJ3wKLd+34yAej4hZEpCgNhBmn1dUWfsA/oIyzxeA8b9lQpQndueVj8sIv1ue73Neu5O70cKn0aZQw4/rVKYa5lYbxnrgvjG0LO6e0nz27IFckeZt3IjQqfH3Pv/z0VtvWoVcvhz713KYMerJVW/5uPOOkk9BZBDVX8QUqSdCUsAxrT9932+oPes/8RqO4irvNW1H/CnVuBkKljR6Ah/023V4Z6+NxyltMYl4mXBIIhsw8Z+bwra4FAnKiBZYPaB5ySVkZlAgMBAAECggEAOcJ3Zqa6B3Sb3Qjv/ZsyKiEQITV7/JVHT0YSjZj2bd9KF/C/XlZ07hJw4+SfsLgN2PtZOa5wZO20jmsBYvQIsbcveyWU6RPAHF78xgNUl/wr9oitqaamp0CKkkt7yIje0v/xaEMOgw+a/E1MTIIDQOsFlFuv/VlXzxWpQeWuzR6O95qh0N0qEs6D+nyMAZj/OvaSNNAEG7+OBHgQr+tppWs8dUiPrmAxv1oYOgCsAnFaKdmednp53ENdGmHHHfvTMxVPi1sNYprX1w/giQ7I8Fqq6NW9Efm/mHy/pcf90hx4QMoiljhsQHoqMCvyNKDR37NrKlEztY7y94Uo8w9n0QKBgQDd10ZtQomsgzeTy36Qf8vYQPR8Dg5+uFKoQ6VG6ij6DaOW7TeLe7ihNY8quJN7HPA+JyF6bPJcoOcRakzItnnv5MKLnRgcvzIF3nVN1sphTIFGUzlUW+BJ88hnhhq4IdY6DdaJIbs54+pQM32nCVr924sXGg0W5FryHZowP9ZMtwKBgQDWV0egft9v0tybNnd8LC8vSLdkkb3kCVooI73oueco8Zrq/dkvK8XG0KWOLjZpnu9WIGfb9eXC/+fnUWCvEnODqk4LcQ7i531B+xJPN5gjMfth3JV2McZ7SKOg30q6oCdHCB503o3lxWlZJIwZn+6aIPtCiRZaAeaJah+86bvhwwKBgAusvacYXlh222Dqz7FZGGg8GuHAd6DRoH/8d2FBB4EJYLebqlWr4C6TvAIajqBnCHms44Um4KZhTWfMOVhCyi4G0vo3/UHeCgrnBzNef24ZcaA61wSKhUY/DyfrldJk7XpGqiizXsAQL4+i9hTpWCGOAUbo9xFiWSruxeOOKIAHAoGBAIufUU5QNzZ9siz9XvopQhdYE/bUJVFdcjhBiB0ItHbsY5D+CTL8HZp0IdQrcFB/MsL02xLi7GeJEcSSMxv4Nf0nvC0h2aOfTe3kIjouKdGLZoiKC2Zx6Cw41jYeHmzRlKRluolAzEhHv2dNMmIi12fZYjMmX8QEBuuukLwbucLHAoGATFHZpBOfWviedZW0BkphFLUZj7qVt5goSL+lDX6s0AHcmklQAkh0ZfEpNdUno03xz4cQh5q26UdC5NwHV8PEOFsLLusQZFr1msdVh6mydB631T9nHCCqUsUVF6H49Rj78gsRkmKA81VeNjO0i/AHkYpYdFviDJiE61SuG+le4lM=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwHjlbEzbSoQRF1a9dyOVfdUralmFKiR+76VLSMI/3Ch6NEwGXnF+7tYaBLCSd2X9aRU4WqK+q2sArdDUhh+3xjkMta1v38PzOxXupezwgJeJXt4QNUj/8JTM5gwEKazfac2RaUO76thdFe6UyvOpaK3g3ZgCMSpL7McmGEyPnjfhmkvo5GS9FkqDksR7luYeSuzZtvPjy0gI41iI+A8Rzbeb1JpFJY6QijmcSkkAaMFhBE8r6GQqybxkdzESsdGO+FBODs/O+4CF7rxP71mOdmaqHNEsqT3KbfzNJz+oP6T+k/S4zfXLv5N+B74b/V8xlkB7VwaXzMIefECaBqh+dQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8085/Ying_Second/money/notify_url";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8085/Ying_Second/money/return_url";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

