
class Auto{
	public static void main (String[] args) {
		
		int coinNum = args.length ;          //No.of coins
		int coinChk = 0 ;                    //one coin value
		int coinSum = 0 ;                    //Sum total amount
		
		for(int i = 0 ; i < coinNum ; i++){
			
			coinChk = Integer.parseInt(args[i]) ; //public static int parseInt(String s) throws NumberFormatException
			
			if( coinChk == 10 || coinChk == 50 || coinChk == 100 || coinChk == 500 ){ // if those accepted coins
				
			coinSum += coinChk ; // coinSum = coinSum + coinChk
				
			}else if( coinChk == 1 || coinChk == 5 ){   // check whether coin is 1yen or 5yen
				
			System.out.println("Warning! You can't use" + coinChk + "Yen coin");
	
			}else{   				
			System.out.println("Warning! You can't use" + coinChk + "Yen coin");

			}
		}
		
		System.out.println("Current Total amout is" + coinSum + "Yen");
		
		if (coinSum < 200 ){
				System.out.println("Total amount is not enough to buy");
			}

		
	}
}