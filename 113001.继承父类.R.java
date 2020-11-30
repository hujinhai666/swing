package pac;

public class R {
	static void lx1() {
		String boy="img/body.gif";
		String girl="img/girl.gif";
		int [][]array2d= {{1,2,3},{4,5,6},{7,8,9}};
		for (int h = 0; h < array2d.length; h++) {
			for (int l = 0; l < array2d[0].length; l++) {
				System.out.print(array2d[h][l]+" ");
			}
			System.out.println("");
		}
		System.out.println(boy);
		System.out.println(girl);
	}
}

