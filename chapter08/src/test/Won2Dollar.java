package test;

public class Won2Dollar extends Converter {
	
	
	//필드
	
	
	
	
	
	//생성자
	public Won2Dollar(double ratio) {
		super(ratio);
	}
		
	

	
	//메소드
	
	
	@Override
	protected double convert(double src) {
		
		return src / ratio ;
	}

	@Override
	protected String getSrcString() {
		
		return "원";
	}

	@Override
	protected String getDestString() {
		
		return "달러";
	}
	
	
	
	

}
