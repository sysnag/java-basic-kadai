package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		Jyanken_Chapter26 jyanken = new Jyanken_Chapter26();

		System.out.println("r,s,pで入力「r=(グー),s=(チョキ),p=(パー)」");
		System.out.println("---------");

		String playerInput = jyanken.getMyChoice();
		
		if (!jyanken.rsp.containsKey(playerInput)) {
			System.out.println("再度、「r,s,p」で入力してください");
			playerInput = jyanken.getMyChoice();
		}

		String playerHand = jyanken.rsp.get(playerInput);
		String dealerHand = jyanken.rsp.get(jyanken.getRandom());

		System.out.println("入力値：" + playerInput);
		System.out.println("自分の手：" + playerHand);
		System.out.println("相手の手：" + dealerHand);

		// 結果表示
		System.out.println(jyanken.playGame(playerInput));
	}

}
