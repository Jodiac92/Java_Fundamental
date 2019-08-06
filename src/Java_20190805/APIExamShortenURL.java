package Java_20190805;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import bonus.Utility;

public class APIExamShortenURL {
	public static void main(String[] args) {
        String clientId = "4zfi1sdjTu7D2mjfLZVW";
        String clientSecret = "Z0kkdg9pyD";
        String oriURL = "https://blog.naver.com/PostView.nhn?blogId=harloveysj&logNo=221460034406&redirect=Dlog&widgetTypeCall=true&directAccess=false";
        String url = Utility.getShortenURL(clientId, clientSecret, oriURL);
        
        //System.out.println(url);
        if(Utility.isQrcode(url, 300, 300)) {
        System.out.println("QR 코드 이미지 생성");
		}else {
        	System.out.println("QR 코드 이미지 실패");
        }
	}
}


