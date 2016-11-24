package ua.kas.second;

public class Book {

	Author author = new Author();
	Content content = new Content();
	Title title = new Title();

	public void set(String author_set, String title_set, String content_set) {
		author.setAuthor(author_set);
		title.setTitle(title_set);
		content.setContent(content_set);
	}

	public void show() {
		author.show();
		title.show();
		content.show();
	}
}
