package TreeTraversal;

public class Knoten<T> {

	T zeichen;
	Knoten<T> link;
	Knoten<T> recht;

	public Knoten(T zeichen) {
		this.zeichen = zeichen;
	}

	// Postorder (links, rechts, mitte)
	public void postOrder(Knoten<T> mitte) {
		if (mitte == null) {
			return;
		}
		postOrder(mitte.link);
		postOrder(mitte.recht);
		System.out.print(mitte.zeichen);
	} 

	
	// Inorder (links, mitte, rechts)
	public void inOrder(Knoten<T> mitte) {
		if (mitte == null) {
			return;
		}
		inOrder(mitte.link);
		System.out.print(mitte.zeichen);
		inOrder(mitte.recht);
	}

	// Preorder (mitte, links, rechts)
	public void preOrder(Knoten<T> mitte) {
		if (mitte == null) {
			return;
		}
		System.out.print(mitte.zeichen);
		preOrder(mitte.link);
		preOrder(mitte.recht);
	}

	public static void main(String[] args) {
		Knoten<String> mitte = new Knoten<>("r");
		mitte.link = new Knoten<>("a");
		mitte.link.link = new Knoten<>("c");
		mitte.link.link.link = new Knoten<>("e");
		mitte.link.link.recht = new Knoten<>("f");
		mitte.link.link.recht.link = new Knoten<>("g");
		mitte.link.link.recht.link.link = new Knoten<>("i");
		mitte.link.link.recht.recht = new Knoten<>("h");

		mitte.link.recht = new Knoten<>("d");
		mitte.link.recht.link = new Knoten<>("j");
		mitte.link.recht.link.link = new Knoten<>("k");
		mitte.link.recht.link.link.recht = new Knoten<>("l");

		mitte.recht = new Knoten<>("b");
		mitte.recht.link = new Knoten<>("m");
		mitte.recht.link.link = new Knoten<>("o");
		mitte.recht.link.link.recht = new Knoten<>("q");

		mitte.recht.link.recht = new Knoten<>("p");
		mitte.recht.link.recht.link = new Knoten<>("s");
		mitte.recht.link.recht.recht = new Knoten<>("t");
		mitte.recht.link.recht.recht.link = new Knoten<>("u");

		mitte.recht.recht = new Knoten<>("n");
		mitte.recht.recht.link = new Knoten<>("v");
		mitte.recht.recht.link.recht = new Knoten<>("x");

		mitte.recht.recht.recht = new Knoten<>("w");
		mitte.recht.recht.recht.link = new Knoten<>("y");

		System.out.print("\nPreorder:");
		mitte.preOrder(mitte);

		System.out.print("\nInorder:");
		mitte.inOrder(mitte);

		System.out.print("\nPostorder:");
		mitte.postOrder(mitte);
	}

}
