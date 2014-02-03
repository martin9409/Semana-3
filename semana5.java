import java.util.Scanner;
public class semana5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Que tal re fue en las notas ");
		Scanner mi_scanner=new Scanner(System.in);
		int num=mi_scanner.nextInt();
		//System.out.print("JUMM   :"+num);
		if (num <= 0)
		{
			System.out.print(" Te Felicito Hijo");
		}
		else {
			System.out.print("Poder de Dios ");
		}
	}
}
