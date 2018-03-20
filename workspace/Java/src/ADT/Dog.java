package ADT;

class Dogs {
	String name = null;

	public void bark() {
		System.out.println("Bow bow");
	}

	public static void main(String... args) {
		Dogs[] mydogs = new Dogs[5];
		for (int i = 0; i < mydogs.length; i++) {
			mydogs[i] = new Dogs();
		}
		Dogs rex = new Dogs();
		rex.name = "Rex";
		System.out.println(rex.name);
		for (int i = 0; i < mydogs.length; i++) {
			mydogs[i].bark();

		}

	}
}