package Day15;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Member {

	String id;
	String password;
	String name;
	String email;
	String phone;

	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String id, String password, String name, String email, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public static void signup() {

		System.out.println("----> 회원가입");
		System.out.print("ID : ");
		String id = Day15_01.scan.next();
		System.out.print("Password : ");
		String password = Day15_01.scan.next();
		System.out.print("Name : ");
		String name = Day15_01.scan.next();
		System.out.print("Email : ");
		String email = Day15_01.scan.next();
		System.out.print("Phone : ");
		String phone = Day15_01.scan.next();

		Member temp = new Member(id, password, name, email, phone);
		Day15_01.memberList.add(temp);
		temp.sendMail(0);
	}

	public void sendMail(int type) {
		// SMTP : 간이 우편 전송 프로토콜
		// POP3 : 포스트 오피스 프로토콜

		// 1. 설정
		String host = "smtp.naver.com";
		String user = "yangz_@naver.com";
		String password = "did12140408";

		Properties properties = new Properties();
		// 설정 클래스
		properties.put("mail.smtp.host", host);
		// .put(key, value) => 한쌍

		properties.put("mail.smtp.port", 587); // 네이버 : 587
		properties.put("mail.smtp.auth", "true");

		// 2. 인증 확인 [인증된 회원 => 세션]
		Session session = Session.getDefaultInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);
			}
		});

		// 3. 메일 작성

		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user)); // 보내는 사람
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(this.email));
			if(type == 1 ) {
				message.setSubject(this.name + "님의 ID");
				message.setText("ID : "+this.id);
			}else if(type == 2){
				message.setSubject(this.name + "님의 Password");
				message.setText("Password : "+this.password);
			}else {
				message.setSubject(this.name + "님 가입을 환영합니다.");
				message.setText("메일 내용");
			}
			
			Transport.send(message); // 메일 전송
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void findId() {
		System.out.println("----> 아이디 찾기");
		System.out.print("Name : ");
		String name = Day15_01.scan.next();
		System.out.print("Email : ");
		String email = Day15_01.scan.next();
		
		for(Member temp : Day15_01.memberList) {
			if(temp.name.equals(name) && temp.email.equals(email)) {
				temp.sendMail(1);
				System.out.println("----> 이메일로 아이디를 발송했습니다");
				return;
			}
		}
		System.out.println("----> 동일한 회원정보가 없습니다");
	}
	
	public void findPassword() {
		System.out.println("----> 비밀번호 찾기");
		System.out.print("ID : ");
		String id = Day15_01.scan.next();
		System.out.print("Email : ");
		String email = Day15_01.scan.next();
		
		for(Member temp : Day15_01.memberList) {
			if(temp.id.equals(id) && temp.email.equals(email)) {
				temp.sendMail(2);
				System.out.println("이메일로 패스워드를 발송했습니다");
				return;
			}
		}
		System.out.println("----> 동일한 회원정보가 없습니다");
	}
}
