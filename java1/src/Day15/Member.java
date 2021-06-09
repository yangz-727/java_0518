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

		System.out.println("----> ȸ������");
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
		// SMTP : ���� ���� ���� ��������
		// POP3 : ����Ʈ ���ǽ� ��������

		// 1. ����
		String host = "smtp.naver.com";
		String user = "yangz_@naver.com";
		String password = "did12140408";

		Properties properties = new Properties();
		// ���� Ŭ����
		properties.put("mail.smtp.host", host);
		// .put(key, value) => �ѽ�

		properties.put("mail.smtp.port", 587); // ���̹� : 587
		properties.put("mail.smtp.auth", "true");

		// 2. ���� Ȯ�� [������ ȸ�� => ����]
		Session session = Session.getDefaultInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);
			}
		});

		// 3. ���� �ۼ�

		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user)); // ������ ���
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(this.email));
			if(type == 1 ) {
				message.setSubject(this.name + "���� ID");
				message.setText("ID : "+this.id);
			}else if(type == 2){
				message.setSubject(this.name + "���� Password");
				message.setText("Password : "+this.password);
			}else {
				message.setSubject(this.name + "�� ������ ȯ���մϴ�.");
				message.setText("���� ����");
			}
			
			Transport.send(message); // ���� ����
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void findId() {
		System.out.println("----> ���̵� ã��");
		System.out.print("Name : ");
		String name = Day15_01.scan.next();
		System.out.print("Email : ");
		String email = Day15_01.scan.next();
		
		for(Member temp : Day15_01.memberList) {
			if(temp.name.equals(name) && temp.email.equals(email)) {
				temp.sendMail(1);
				System.out.println("----> �̸��Ϸ� ���̵� �߼��߽��ϴ�");
				return;
			}
		}
		System.out.println("----> ������ ȸ�������� �����ϴ�");
	}
	
	public void findPassword() {
		System.out.println("----> ��й�ȣ ã��");
		System.out.print("ID : ");
		String id = Day15_01.scan.next();
		System.out.print("Email : ");
		String email = Day15_01.scan.next();
		
		for(Member temp : Day15_01.memberList) {
			if(temp.id.equals(id) && temp.email.equals(email)) {
				temp.sendMail(2);
				System.out.println("�̸��Ϸ� �н����带 �߼��߽��ϴ�");
				return;
			}
		}
		System.out.println("----> ������ ȸ�������� �����ϴ�");
	}
}
