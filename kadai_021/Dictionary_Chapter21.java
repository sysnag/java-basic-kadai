package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	HashMap<String , String> word = new HashMap<String , String>();
	
	public Dictionary_Chapter21(){
		word.put("apple", "りんご");
		word.put("peach", "桃");
		word.put("banana", "バナナ");
		word.put("lemon", "レモン");
		word.put("pear", "梨");
		word.put("kiwi", "キウィ");
		word.put("strawberry", "いちご");
		word.put("grape", "ぶどう");
		word.put("muscat", "マスカット");
		word.put("cherry", "さくらんぼ");
	}
	
	public void search(String searchWord) {
		if(word.get(searchWord) != null ) {
			System.out.println(word.get(searchWord));
		}else {
			System.out.println("辞書に存在しない");
		}
		
	}
}
