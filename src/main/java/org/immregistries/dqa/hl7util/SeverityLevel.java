package org.immregistries.dqa.hl7util;

public enum SeverityLevel {

	/**
	 * Data needs to be fixed, and the message should be resubmitted.
	 */
	ERROR("E", "Error", "Rejected with Errors")
	/**
	 * Data needs to be fixed, but we can deal with it in this message. No need
	 * to resubmit.
	 */
	, WARN("W", "Warn", "Accepted with Warnings")
	/**
	 * This means an issue is acceptable, but we're not going to tell anyone
	 * about it, except maybe on a report.
	 */
	, ACCEPT("A", "Accept", "Accepted")
	/**
	 * This means an issues is acceptable, and we do want to tell people.
	 */
	, INFO("I", "Info", "Informational");

	private String severityCode = "";
	private String severityLabel = "";
	private String severityDescription = "";

	private SeverityLevel(String actionCode, String actionLabel,
			String actionDesc) {
		this.severityCode = actionCode;
		this.severityLabel = actionLabel;
		this.severityDescription = actionDesc;
	}
	
	public SeverityLevel findByCode(String code) {
		for (SeverityLevel s : SeverityLevel.values()) {
			if (s.getActionCode() == code) {
				return s;
			}
		}
		return null;
	}

	public String getActionLabel() {
		return this.severityLabel;
	}

	public String getActionCode() {
		return severityCode;
	}

	public String getActionDescription() {
		return this.severityDescription;
	}

}
