package Book;

public class Main {

	public static void main(String args[])
	{
	Dictionary d = new Dictionary("English dictionary", "Murfy",2012,1500,52500);	
	TextBook t = new TextBook ("Java", "Jill",2014,23,3);
	ChildrenBook c = new ChildrenBook("alice in wonderland", "‎Lewis Carroll", 1865, 75);
	//ChildrenBook c2 = new ChildrenBook();
	Magazine b = new Magazine("Tatler","No",2015,224,"fashion");
	LiteraryObject  x = b;
	Series s = b;
	b.definition();
	b.haveSeries();
	b.putMagazine();
	System.out.println(b.edition()+"\n----------");
	t.putTextbook();
	System.out.println(t.edition()+"\n----------");
	d.putDictionary();
	System.out.println(d.edition()+"\n----------");
	c.putLiteraryObject();
	c.ChildrenIllus();
	System.out.println(c.edition()+"\n----------");
	}
}
