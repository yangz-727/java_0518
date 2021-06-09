package Day14;

import java.util.Properties;
//mail로 임포트
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Day14_04 {
	
	
	
	public static void main(String[] args) {
	
		//이메일 api : 
			// 메일 전송 프로토콜 : SMTP
			// 다운로드 : 라이브러리 추가 
		// java에서 메일 보내기 naver
		
		String host = "smtp.naver.com"; //메일 회사 호스트명
		String user = "id@naver.com"; //관리자 아이디
		String password =""; // 관리자 패스워드
		
		Properties properties = new Properties(); // 설정
		
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", 587); //port : 메일 회사 smtp 포트
		properties.put("mail.smtp.auth", true);	// 인증 검사
		
		//인증확인
		Session session = Session.getDefaultInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);
			}
		
		});
		
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user)); // 보내는 사람
			message.addRecipient(Message.RecipientType.TO, new InternetAddress("받는 사람 이메일")); // 받는 사람
			message.setSubject("자바에서 메일 보내기"); // 메일 제목
			message.setText("메일내용 : 안녕하세요"); // 메일 내용
			
			Transport.send(message); //메일 전송
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	
}
