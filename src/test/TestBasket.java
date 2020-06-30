package test;
import java.util.List;
import org.junit.Test;
import main.Basket;


public class TestBasket{
	

	@Test
	public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded(){
		
		//Arrange
		//You will need a Basket object
		Basket ggBasket = new Basket();
		
		//Call getBooksInBasket() method of your Basket object and store the returned Book list
		//Act
		List<Book> bookList= ggBasket.getBooksInBasket();
		
		//Assert
		//The size of the Book list should be equal to zero			
		assertThat(bookList.size(), is(0));
		
		//Test code
   }
	private boolean is(int i) {
		// TODO Auto-generated method stub
		return false;
	}
	private void assertThat(int size, boolean b) {
		// TODO Auto-generated method stub
		
	}
	
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook(){
		//Arrange
		Basket ggBasket = new Basket();
		Book myBook = new Book();
		
		//Act
		List<Book> bookList1 = ggBasket.addBook(myBook);
		
		//Assert
		assertThat(bookList1.size(),is(1));
		
	}
	
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithTwoBooks(){
		//Arrange
		Basket ggBasket = new Basket();
		Book myBook = new Book();
		Book hisBook = new Book();
		
		//Act
		List<Book> bookList2 = ggBasket.addBook(myBook, hisBook);
		
		//Assert
		assertThat(bookList2.size(),is(2));
		
	}
	
}
		
		
		
			
		
			

		

