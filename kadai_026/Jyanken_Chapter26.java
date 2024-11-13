package kadai_026;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {

	HashMap<String, String> rsp = new HashMap<String, String>();
	Integer dealerInt = (int) Math.floor(Math.random() * 3);
	String[] dealerHand = {"r", "s", "p"};
	Scanner scanner = new Scanner(System.in);

	public Jyanken_Chapter26() {
		rsp.put("r", "グー");
		rsp.put("s", "チョキ");
		rsp.put("p", "パー");
	}

	public String getMyChoice() {
		return scanner.next();
	}

	public String getRandom() {
		return dealerHand[dealerInt];
	}

	public String playGame(String playerHand) {
		String result;

		if (playerHand.equals(dealerHand[dealerInt])) {
			return "あいこです";
		}

		switch (playerHand) {
			case "r" -> result = switch (dealerHand[dealerInt]) {
				case "s" -> "自分の勝ちです";
				case "p" -> "自分の負けです";
				default -> "エラー";
			};
			case "s" -> result = switch (dealerHand[dealerInt]) {
				case "r" -> "自分の負けです";
				case "p" -> "自分の勝ちです";
				default -> "エラー";
			};
			case "p" -> result = switch (dealerHand[dealerInt]) {
				case "r" -> "自分の勝ちです";
				case "s" -> "自分の負けです";
				default -> "エラー";
			};
			default -> result = "エラー";
		}

		return result;
	}
}
