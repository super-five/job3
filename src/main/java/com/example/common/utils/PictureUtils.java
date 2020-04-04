package com.example.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.ByteArrayBody;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class PictureUtils {
	public static void main(String[] args) throws ClientProtocolException, IOException, InterruptedException {
		String url = "http://47.99.154.241:8080/job/goods/upload";
//        String basePath = "F:\\img\\";
		String path = "F:\\workspaces_own\\other\\picture\\bed\\bed_20200404133655.jpg";
		uploadImage(url, "asfd", path);
	}

	public static String uploadImage(String path, String base64String, String imageFilePath)
			throws ClientProtocolException, IOException {
		// 1. 创建上传需要的元素类型
		// 1.1 装载本地上传图片的文件
		File imageFile = new File(imageFilePath);
		FileBody imageFileBody = new FileBody(imageFile);
		// 1.2 装载经过base64编码的图片的数据
//        String imageBase64Data = base64String;
//        ByteArrayBody byteArrayBody = null;
//        if (StringUtils.isNotEmpty(imageBase64Data)) {
//            byte[] byteImage = Base64.decodeBase64(imageBase64Data);
//            byteArrayBody = new ByteArrayBody(byteImage, "image_name");
//        }
		// 1.3 装载上传字符串的对象
		StringBody name = new StringBody("admin", ContentType.TEXT_PLAIN);
		// 2. 将所有需要上传元素打包成HttpEntity对象
//        HttpEntity reqEntity = MultipartEntityBuilder.create().addPart("name", name).addPart("img", imageFileBody).addPart("file2", byteArrayBody).build();
		HttpEntity reqEntity = (HttpEntity) MultipartEntityBuilder.create().addPart("name", name)
				.addPart("img", imageFileBody).build();
		// 3. 创建HttpPost对象，用于包含信息发送post消息
		HttpPost httpPost = new HttpPost(path);
		httpPost.setEntity(reqEntity);
		// 4. 创建HttpClient对象，传入httpPost执行发送网络请求的动作
		CloseableHttpClient httpClient = HttpClients.createDefault();
		CloseableHttpResponse response = httpClient.execute(httpPost);
		// 5. 获取返回的实体内容对象并解析内容
		HttpEntity resultEntity = response.getEntity();
		String responseMessage = "";
		try {
			if (resultEntity != null) {
				InputStream is = resultEntity.getContent();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				StringBuffer sb = new StringBuffer();
				String line = "";
				while ((line = br.readLine()) != null) {
					sb.append(line);
				}
				responseMessage = sb.toString();
				System.out.println("响应内容为：" + responseMessage);
			}
			EntityUtils.consume(resultEntity);
		} finally {
			if (null != response) {
				response.close();
			}
		}
		return responseMessage;
	}

}