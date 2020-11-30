package pac;

public interface R2 {
	static void lx2() {
		String boy_filePathString="img/nan.gif";
		String girl_filePathString="img/nv.gif";
		int [][]array2d= {{10,20,30},{40,50,60},{70,80,90}};
		for (int h = 0; h < array2d.length; h++) {
			for (int l = 0; l < array2d[0].length; l++) {
				System.out.print(array2d[h][l]+" ");
			}
			System.out.println("");
		}
		System.out.println(boy_filePathString);
		System.out.println(girl_filePathString);
	}
}
