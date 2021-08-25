package jp.co.sample.emp_management.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class InsertAdministratorForm {
	/** 名前 */
	private String name;
	/** メールアドレス */
	@Size(min = 1, max = 127, message = "Eメールは1文字以上127文字以内で入力してください。")
	@Email(message = "Email形式が不正です。")
	private String mailAddress;
	/** パスワード */
	@Size(min = 1, max = 127, message = "パスワードは1文字以上127文字以内で入力してください。")
	private String password;
	/** 再入力パスワード */
	@NotBlank(message = "確認用パスワードが入力されていません。")
	@Size(min = 1, max = 127, message = "パスワードは1文字以上127文字以内で入力してください。")
	private String passwordCheck;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the mailAddress
	 */
	public String getMailAddress() {
		return mailAddress;
	}

	/**
	 * @param mailAddress the mailAddress to set
	 */
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @param the passwordCheck
	 */
	public String getPasswordCheck() {
		return passwordCheck;
	}

	/**
	 * @param passwordCheck the passwordCheck to set
	 */
	public void setPasswordCheck(String passwordCheck) {
		this.passwordCheck = passwordCheck;
	}

	// toString
	@Override
	public String toString() {
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ ", passwordCheck=" + passwordCheck + "]";
	}

}
