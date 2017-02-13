package org.immregistries.dqa.vxu.hl7;

/**
 * This class represents a phone number, and includes a type
 * 
 * @author Josh
 *
 */
public class PhoneNumber {

	private String number = "";
	private String telUse = "";// new CodedEntity(CodesetType.TELECOMMUNICATION_USE);
	private String telEquip = "";// new CodedEntity(CodesetType.TELECOMMUNICATION_EQUIPMENT);
	private String email = "";
	private String countryCode = "";
	private String areaCode = "";
	private String localNumber = "";
	private String extension = "";

	public PhoneNumber() {
		// default
	}

	public PhoneNumber(String phoneNumberString) {
		setNumber(phoneNumberString);
	}

	public PhoneNumber(String areaCode, String localNumber) {
		setAreaCode(areaCode);
		setLocalNumber(localNumber);
	}

	public String getNumber() {
		if (number == null || number.equals("")) {
			if (localNumber != null && !localNumber.equals("")) {
				StringBuilder sb = new StringBuilder();
				if (areaCode != null && !areaCode.equals("")) {
					sb.append("(");
					sb.append(areaCode);
					sb.append(")");
				}
				if (localNumber != null && !localNumber.equals("")) {
					if (localNumber.length() == 7) {
						sb.append(localNumber.substring(0, 3));
						sb.append("-");
						sb.append(localNumber.substring(3, 7));
					} else {
						sb.append(localNumber);
					}
				}
				return sb.toString();
			}
			return "";
		}
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
		if ((number != null && !number.equals(""))
				&& (localNumber == null || localNumber.equals(""))) {
			if (areaCode == null || areaCode.equals("")) {
				StringBuilder justDigits = new StringBuilder();
				for (char c : number.toCharArray()) {
					if (c >= '0' && c <= '9') {
						justDigits.append(c);
					}
				}
				if (justDigits.length() == 7) {
					this.localNumber = justDigits.toString();
				} else if (justDigits.length() == 10) {
					this.areaCode = justDigits.toString().substring(0, 3);
					this.localNumber = justDigits.toString().substring(3, 10);
				}
			}
		}
	}

	public String getTelUse() {
		return telUse;
	}

	public String getTelUseCode() {
		return telUse;
	}

	public void setTelUseCode(String telUseCode) {
		this.telUse = telUseCode;
	}

	public String getTelEquipCode() {
		return telEquip;
	}

	public String getTelEquip() {
		return telEquip;
	}

	public void setTelEquipCode(String telEquipCode) {
		this.telEquip = telEquipCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getLocalNumber() {
		return localNumber;
	}

	public void setLocalNumber(String localNumber) {
		this.localNumber = localNumber;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
}
