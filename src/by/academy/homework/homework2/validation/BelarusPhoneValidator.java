package by.academy.homework.homework2.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {
	private Pattern p = Pattern.compile("^\\+375 ?((29)|(33)|(44)) ?[\\d]{3}[ -]?[\\d]{2}[ -]?[\\d]{2}$");

	@Override
	public boolean validate(String vString) {
		Matcher m = p.matcher(vString);
		return m.find();
	}
}
