package by.tut.accounttests.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class UserAccount {
	
    private String login;
    private String password;

	@Override
	public String toString() {
		return "UserAccount [login=" + login + "password=" + password + "]";
	}
}
