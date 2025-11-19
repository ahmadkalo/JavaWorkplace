
public class Mensch {

	public void reden() {
		System.out.println("Hallo");
	}

	public static void reden(Mensch mensch) {
		mensch.reden();
	}

	public static void main(String[] args) {

		Mensch delyar = new Mensch();
		Mensch ahmed = new Mensch() {
			public void reden() {
				System.out.println("Hallo Hurensohn");
			}
		};

		ahmed.reden();
		delyar.reden();

		reden(new Mensch() {
			public void reden() {
				System.out.println("Hallo Hurensohn ");
			}
		});

		Hund a = new Hund() {

			@Override
			public void bellen() {
				System.out.println("Haw Haw");
				
			}
			
		};

			
				a.bellen();
		}
		
	}



