package Exercicio9_1;

/**
 * 
 * @author João Victor Telles Gementi - RA:81616650 - Turma:SIN3AN-MCA
 * 			
 *
 */

public class Slot25 implements Slot {

	private Slot slot;

	public Slot25() {
	};

	@Override
	public double recebeMoeda(int m) {
		if (m == 25) {
			System.out.println("-- Recebeu R$0,25");
			return 0.25;
		}else {
			return this.slot.recebeMoeda(m);
		}
	}

	@Override
	public void setSlot(Slot s) {
		this.slot = s;
	}

}
