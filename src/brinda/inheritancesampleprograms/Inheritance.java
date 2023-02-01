package brinda.inheritancesampleprograms;

public class Inheritance {
	
	public static void main(String[] args) {

		Samsung s = new Samsung();
		Nokia n = new Nokia();
		Redmi r = new Redmi();
		
		
		s.setColour("blue");
		s.setCost(4000);
		s.setRAM("4GB");
		s.setSerial_num(789);
		s.setModel("5899S");
		
		n.setColour("Black");
		n.setCost(3000);
		n.setRAM("3GB");
		n.setSerial_num(123);
		n.setModel("ABC1123");
		
		r.setColour("Sliver");
		r.setCost(3500);
		r.setRAM("2GB");
	    r.setSerial_num(456);
	    r.setModel("GEF2600");
		
		
	
		System.out.println("samsung mobile colour:  "+ s.getColour());
		System.out.println("samsung mobile cost: "+ s.getCost());
		System.out.println("samsung mobile RAM size:  "+ s.getRAM());
		System.out.println("samsung mobile serial_num :  " +s.getSerial_num());
		System.out.println("samsung mobile mobile : "+s.getModel());
		System.out.println("");
		System.out.println("Nokia mobile colour:  "+ n.getColour());
		System.out.println("Nokia mobile cost : "+ n.getCost());
		System.out.println("Nokia mobile RAM size:  "+ n.getRAM());
		System.out.println("Nokia mobile serial_num:  "+ n.getSerial_num());
		System.out.println("Nokia mobile Model: "+ n.getModel());
		System.out.println("");
		System.out.println("Redmi mobile colour:  "+ r.getColour());
		System.out.println("Redmi mobile cost: "+ r.getCost());
		System.out.println("Redmi mobile RAm size:  "+ r.getRAM());
		System.out.println("Redmi mobile serial_num:  "+r.getSerial_num());
		System.out.println("Redmi mobile Model:  "+r.getModel());
		

		
		
		
		
	}

}
