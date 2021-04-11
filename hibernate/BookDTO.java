package hibernate;

import java.io.Serializable;

public class BookDTO implements Comparable<BookDTO>,Cloneable,Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BookDTO() {
		// TODO Auto-generated constructor stub
	}	
	
	public BookDTO(int bookid, String bookname, String bookauthor, float bookprice)
	{
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookauthor = bookauthor;
		this.bookprice = bookprice;
	}
	
	
	@Override
	public String toString() {
		return "BookDTO [bookid=" + bookid + ", bookname=" + bookname + ", bookauthor=" + bookauthor + ", bookprice="
				+ bookprice + ", comment=" + comment + "]";
	}

	public BookDTO getClone()
	{
		try
		{
			return (BookDTO)super.clone();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
	}
	private int bookid;
	private String bookname;
	private String bookauthor;
	private float bookprice;
	private Comment comment;
	
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookauthor() {
		return bookauthor;
	}
	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}
	public float getBookprice() {
		return bookprice;
	}
	public void setBookprice(float bookprice) {
		this.bookprice = bookprice;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookauthor == null) ? 0 : bookauthor.hashCode());
		result = prime * result + bookid;
		result = prime * result + ((bookname == null) ? 0 : bookname.hashCode());
		result = prime * result + Float.floatToIntBits(bookprice);
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookDTO other = (BookDTO) obj;
		if (bookauthor == null) {
			if (other.bookauthor != null)
				return false;
		} else if (!bookauthor.equals(other.bookauthor))
			return false;
		if (bookid != other.bookid)
			return false;
		if (bookname == null) {
			if (other.bookname != null)
				return false;
		} else if (!bookname.equals(other.bookname))
			return false;
		if (Float.floatToIntBits(bookprice) != Float.floatToIntBits(other.bookprice))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(BookDTO o) {
		return this.bookname.compareTo(o.bookname);
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}
	
}
