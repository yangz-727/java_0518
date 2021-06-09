package Day09;

public class Book {
	String ISBN;
	String title;
	String author;
	boolean state;
	String loanId;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String ISBN, String title, String author) {
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
		this.state = true;
	}
	
	
	public void addBook() {
		//�������
		
		//�ߺ�����
		while(true) {
			int sw = 0;
			
			System.out.println("----> �������");
			System.out.print("ISBN : ");
			String ISBN = Day09_02.scan.next();
			
			if(ISBN.equals("N")) return;
			
			
			for(Book temp : Day09_02.bookList) {
				//��ü �� ��ŭ �ݺ�
				if(temp.ISBN.equals(ISBN)){
					System.out.println("----> ������ ISBN�� �ֽ��ϴ�.");
					sw=1;
					break;
				}
			}
			
			if(sw==0) {
				System.out.print("title : ");
				String title = Day09_02.scan.next();
				System.out.print("author : ");
				String author = Day09_02.scan.next();
				Day09_02.bookList.add(new Book(ISBN,title,author));
				return;
			}
		}
	}
	public void deleteBook() {
		//��������
	}
	public void getList() {
		//�������
		
		System.out.println("----> �������");
		System.out.println("ISBN\t\t������\t\t����\t\t�뿩����");
		for(Book temp : Day09_02.bookList) {
			//��ü �� ��ŭ �ݺ�
			System.out.println(temp.ISBN+"\t\t"+temp.title+"\t\t"+temp.author+"\t\t"+temp.state);
		}
		
	}
	public void updateBook(){
		//��������
	}
	public void loanBook(String id) {
		//�����뿩
		
		System.out.println("----> �����뿩");
		System.out.print("������ : ");
		String title = Day09_02.scan.next();
		
		for(Book temp : Day09_02.bookList) {
			//��ü �� ��ŭ �ݺ�
			if(temp.title.equals(title)) {
				if(temp.state) {
					System.out.println("----> �뿩 ����");
					System.out.println("----> 1.�뿩 2.���");
					System.out.print("���� : ");
					int select = Day09_02.scan.nextInt();
					if(select == 1) {
						System.out.println("----> "+temp.title+" ������ �뿩�մϴ�");
						temp.state = false;
						temp.loanId = id;
						
					}else if(select ==2) {
						return;
					}
				}else {
					System.out.println("----> �뿩 �Ұ���");
				}
			}
		}
		
		
		
	}
	public void returnBook(String id) {
		//�����ݳ�
		System.out.println("----> �����ݳ�");
		System.out.print("������ : ");
		String title = Day09_02.scan.next();
		
		for(Book temp : Day09_02.bookList) {
			//��ü �� ��ŭ �ݺ�
			if(temp.title.equals(title)) {
				if(!temp.state) {
					System.out.println("----> �ݳ� ����");
					if(temp.loanId.equals(id)) {
						System.out.println("----> 1.�ݳ� 2.���");
						System.out.print("���� : ");
						int select = Day09_02.scan.nextInt();
						if(select == 1) {
							System.out.println("----> "+temp.title+" ������ �ݳ��մϴ�");
							temp.state = true;
							temp.loanId = null;
							
						}else if(select ==2) {
							return;
						}
					}else {
						System.out.println("----> �ݳ� ������ �����ϴ�");
					}
					
				}else {
					System.out.println("----> �뿩 �Ұ���");
				}
			}
		}
		
	}
	
}
