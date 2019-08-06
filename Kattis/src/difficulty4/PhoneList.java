package difficulty4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PhoneList {
	public static void main(String[] args) throws IOException {
//		long time = System.currentTimeMillis();
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(bi.readLine());
		for(int i = 0; i < cases; i++) {
			int numbers = Integer.parseInt(bi.readLine());
			List<String> phones = new ArrayList<String>();
			boolean consistent = true;
			for (int j = 0; j < numbers; j++) {
				phones.add(bi.readLine());
			}
			Collections.sort(phones);
			String lastPhone = phones.get(0);
			for (int j = 1; j < phones.size(); j++) {
				String phone = phones.get(j);
				if (lastPhone.length() <= phone.length() && lastPhone.equals(phone.substring(0, lastPhone.length()))) {
					consistent = false;
					break;
				}
				lastPhone = phone;
			}
			System.out.println(consistent ? "YES" : "NO");
//			System.out.println( (System.currentTimeMillis() - time) + "ms");
		}
	}
}
