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
		//도서등록
		
		//중복제거
		while(true) {
			int sw = 0;
			
			System.out.println("----> 도서등록");
			System.out.print("ISBN : ");
			String ISBN = Day09_02.scan.next();
			
			if(ISBN.equals("N")) return;
			
			
			for(Book temp : Day09_02.bookList) {
				//객체 수 만큼 반복
				if(temp.ISBN.equals(ISBN)){
					System.out.println("----> 동일한 ISBN이 있습니다.");
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
		//도서삭제
	}
	public void getList() {
		//도서목록
		
		System.out.println("----> 도서목록");
		System.out.println("ISBN\t\t도서명\t\t저자\t\t대여여부");
		for(Book temp : Day09_02.bookList) {
			//객체 수 만큼 반복
			System.out.println(temp.ISBN+"\t\t"+temp.title+"\t\t"+temp.author+"\t\t"+temp.state);
		}
		
	}
	public void updateBook(){
		//도서변경
	}
	public void loanBook(String id) {
		//도서대여
		
		System.out.println("----> 도서대여");
		System.out.print("도서명 : ");
		String title = Day09_02.scan.next();
		
		for(Book temp : Day09_02.bookList) {
			//객체 수 만큼 반복
			if(temp.title.equals(title)) {
				if(temp.state) {
					System.out.println("----> 대여 가능");
					System.out.println("----> 1.대여 2.취소");
					System.out.print("선택 : ");
					int select = Day09_02.scan.nextInt();
					if(select == 1) {
						System.out.println("----> "+temp.title+" 도서를 대여합니다");
						temp.state = false;
						temp.loanId = id;
						
					}else if(select ==2) {
						return;
					}
				}else {
					System.out.println("----> 대여 불가능");
				}
			}
		}
		
		
		
	}
	public void returnBook(String id) {
		//도서반납
		System.out.println("----> 도서반납");
		System.out.print("도서명 : ");
		String title = Day09_02.scan.next();
		
		for(Book temp : Day09_02.bookList) {
			//객체 수 만큼 반복
			if(temp.title.equals(title)) {
				if(!temp.state) {
					System.out.println("----> 반납 가능");
					if(temp.loanId.equals(id)) {
						System.out.println("----> 1.반납 2.취소");
						System.out.print("선택 : ");
						int select = Day09_02.scan.nextInt();
						if(select == 1) {
							System.out.println("----> "+temp.title+" 도서를 반납합니다");
							temp.state = true;
							temp.loanId = null;
							
						}else if(select ==2) {
							return;
						}
					}else {
						System.out.println("----> 반납 권한이 없습니다");
					}
					
				}else {
					System.out.println("----> 대여 불가능");
				}
			}
		}
		
	}
	
}
