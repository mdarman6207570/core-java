package busdepo;

class BusDepo {
	public static void main(String[] args) {

		Driver hk = new Driver();
		hk.drive( new RedBus() );
		hk.drive( new Volvo() );
		//hk.drive( new SL() );
					
	}
}