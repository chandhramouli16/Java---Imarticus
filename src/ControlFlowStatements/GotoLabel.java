package ControlFlowStatements;

public class GotoLabel {

	public static void main(String[] args) {

		outer:
			for(int i=1;i<=5;i++) {
				inner:
					for(int j=1;j<=5;j++) {
						if(i==j) {
							System.out.println("Outer");
							continue outer;
						}
						else {
							System.out.println("Inner loop");
							continue inner;
						}
					}
			}
		
	}

}
