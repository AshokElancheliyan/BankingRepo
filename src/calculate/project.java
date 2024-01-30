package calculate;

public class project extends calculate1 {

	public void sub(int s1, int s2) {
		System.out.println(s1 - s2);
	}

	public static void main(String[] args) {
		project P = new project();
		P.add(3, 9);
		P.sub(5, 3);
	}

}
