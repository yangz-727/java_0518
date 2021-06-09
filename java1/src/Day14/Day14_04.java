package Day14;

import java.util.Properties;
//mail�� ����Ʈ
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Day14_04 {
	
	
	
	public static void main(String[] args) {
	
		//�̸��� api : 
			// ���� ���� �������� : SMTP
			// �ٿ�ε� : ���̺귯�� �߰� 
		// java���� ���� ������ naver
		
		String host = "smtp.naver.com"; //���� ȸ�� ȣ��Ʈ��
		String user = "id@naver.com"; //������ ���̵�
		String password =""; // ������ �н�����
		
		Properties properties = new Properties(); // ����
		
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", 587); //port : ���� ȸ�� smtp ��Ʈ
		properties.put("mail.smtp.auth", true);	// ���� �˻�
		
		//����Ȯ��
		Session session = Session.getDefaultInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);
			}
		
		});
		
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user)); // ������ ���
			message.addRecipient(Message.RecipientType.TO, new InternetAddress("�޴� ��� �̸���")); // �޴� ���
			message.setSubject("�ڹٿ��� ���� ������"); // ���� ����
			message.setText("���ϳ��� : �ȳ��ϼ���"); // ���� ����
			
			Transport.send(message); //���� ����
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	
}
