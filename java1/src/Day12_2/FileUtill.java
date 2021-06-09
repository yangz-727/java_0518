package Day12_2;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;
import java.io.Reader;
import java.util.ArrayList;

public class FileUtill {

	// ����Ʈ�� ���Ͽ� �����ϴ� �޼ҵ�
	public static void writeFile(String dir,String fileName, ArrayList<User> userList) throws Exception {
								//���ϰ��			//���ϸ� 			//��������Ʈ
		
		File filePath = new File(dir);
		
		// 1. ���� ��� ���� Ȯ��
		if(filePath.exists()) { // �ش� ��� ������ ������
			filePath.mkdir(); // ���� ���� �޼ҵ�
		}
		
		// 2. ���� ��üȭ
		File file = new File(dir,fileName);
							//���, ���ϸ�
		OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file));
		
		
		// 3. ���� ����
			//for(int i=0;i<userList.size();i++) {}
		for(User temp : userList) {
			
			// 1. ȸ�������� �ϳ��� ���ڿ��� ��� [�ʵ� ���� , ȸ����\n]
			String outString = temp.getId() +","+temp.getPassword()+","+temp.getName()+"\n";
			// 2. ȸ�� ���Ͼ���
			byte[] byteArr = outString.getBytes();
			outputStream.write(byteArr);//���Ͼ���
		}
		// 4. ��Ʈ�� �ʱ�ȭ
		outputStream.close();
	}
	
	// ������ �о�ͼ� ����Ʈ�� �����ϴ� �޼ҵ�
	public static ArrayList<User> readReader(Reader reader) throws Exception {
		
		BufferedReader bufferedReader = new BufferedReader(reader);
		
		ArrayList<User> userlist = new ArrayList<User>();
		
		String line;
		// �о����
		while((line = bufferedReader.readLine())!=null) {
					//.readLine() : ���پ� �о���� [\n] ����
					//.read() : �� ���ھ� �о����
			//�о�� �� ����
			
			String[] str = line.split(","); //�о�� ������ , �������� ����
			//user ��ü�� ���
			User temp = new User(str[0], str[1], str[2]);
			
			//��ü�� ����Ʈ ���
			userlist.add(temp);
		}
		
		//����Ʈ ��ȯ
		bufferedReader.close(); //���� �ݱ�
		return userlist;
		
	}
	
	//���� �о���� �޼ҵ�
	public static ArrayList<User> readFile(File file) throws Exception {
		FileReader fileReader = new FileReader(file);
		ArrayList<User> userlist = new ArrayList<>();
		
		userlist = readReader(fileReader);
		fileReader.close();
		return userlist;
		
	}
	
}
