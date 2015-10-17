package Book;

interface Series //interface
{
	void haveSeries();
}

abstract class LiteraryObject { //abstraction
	
	private String title;
	private String author;
	protected int pages;
	private int year_of_edition;
	public LiteraryObject()
	{
		
	}
	public LiteraryObject(String title, String author, int year_of_edition, int pages)
	{
		System.out.println("Constructor");
		this.title = title;
		this.author = author;
		this.year_of_edition = year_of_edition;
		this.pages = pages;
	}
	
	public int getPages()
	{
		return pages;
	}
	public String getTitle()
	{
		return title;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public int getYearofedition()
	{
		return year_of_edition;
	}
	public void definition()
	{
		System.out.println("This is a Literary Object");
	}
	
	public void putLiteraryObject()
	{
		System.out.println("Author: "+getAuthor()+" Title: "+getTitle()+" Year: "+getYearofedition()+ " Pages: "+getPages());
	}
	
	abstract String edition();

}

class Book extends LiteraryObject
{
	String edition(){
		return "General edition";
	}	
}
class Illustration
{
	private String artists;
	private String name_of_illustration;
	public Illustration()
	{
		
	}
	public Illustration(String artists, String name_of_illustration)
	{
		
		this.artists=artists;
		this.name_of_illustration=name_of_illustration;

	}
	
	public String getArtists()
	{
		return artists;
	}
	public String getNameOfIllustration()
	{
		return name_of_illustration;
	}
	public void information()
	{
		System.out.println("Artists: "+getArtists()+" Name: "+getNameOfIllustration());
	}
}
class ChildrenBook extends LiteraryObject
{
	public ChildrenBook()
	{
		
	}
	
	public ChildrenBook (String title, String author, int year_of_edition,int pages)
	{
		super(title, author, year_of_edition, pages); //use parent constructor
	}
	
	String edition(){
		return "Children edition";
	}
	
	public void ChildrenIllus()
	{
	Illustration ChildrenIllustration = new Illustration("Walt Disney","Alice");
	ChildrenIllustration.information();
	}
}

class Dictionary extends LiteraryObject 
{
	private int definitions;
	
	public Dictionary (String title, String author, int year_of_edition,int pages, int definitions)
	{
		super(title, author, year_of_edition, pages); //use parent constructor
		setDefinitions(definitions);
		
	}
	public void setDefinitions(int newDefinitions)
	{
		definitions=newDefinitions;
	}
	
	public int getDefinitions()
	{
		return definitions;
	}
	
	public double computeRatio()
	{
		return definitions/pages;
	}
	
	void putDictionary()
	{
		putLiteraryObject(); //via inheritance
		System.out.println(" Definitions: "+ getDefinitions()+ " Ratio: "+computeRatio());
	}
	
	String edition(){
		return "Edition for all";
	}
}

class TextBook extends LiteraryObject 
{
	private int level;
	
	public TextBook (String title, String author, int year_of_edition,int pages, int level)
	{
		super(title, author, year_of_edition, pages); //use parent constructor
		setLevel(level);
		
	}
	public void setLevel(int level_n)
	{
		if (level_n>=1 && level_n<=10)
		{
			level = level_n;
		}
	}
	
	void putTextbook()
	{
		putLiteraryObject(); //via inheritance 
		System.out.println(" Level: "+ level);
	}
	
	String edition(){
		return "Edition for students";
	}
}

class Magazine extends LiteraryObject  implements Series //inheritance + IS-A
{
	private String type;
	
	public Magazine (String title, String author, int year_of_edition,int pages, String type)
	{
		super(title, author, year_of_edition, pages); //use parent constructor
		setType(type);
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setType(String newType)
	{
		type = newType;
	}
	void putMagazine()
	{
		putLiteraryObject(); //via inheritance
		System.out.println(" Type: "+getType() );
	}
	public void definition()
	{
		System.out.println("You also can subcribe");
		super.definition(); //overriding
	}
	
	public void haveSeries()
	{
		System.out.println("This is series of magazines");
	}
	
	String edition(){
		return "Edition for adults";
	}
	
}




