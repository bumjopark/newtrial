
public class Book {
	
	
	int id;
	String title;
	String author;
	int year;
	
	Book(){}
	Book(int id){this.id = id;}
	Book(int id, String title, String author, int year){
		this.id = id;
		this.title = title;
		this.author = author;
		this.year = year;
		
	}
	
	public String printBook() {
		return "Book{ id: '" + this.id + "', 제목: " + this.title + ", 저자: " + this.author + ", 출판년도: " + this.year + "}" ;
	}

}

