package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * SysLoggingId generated by hbm2java
 */
public class SysLoggingId implements java.io.Serializable {

	private Date timestamp;
	private short uid;
	private Integer msgId;
	private String msgText;
	private String msgSource;
	private Integer errId;
	private String errText;

	public SysLoggingId() {
	}

	public SysLoggingId(Date timestamp, short uid) {
		this.timestamp = timestamp;
		this.uid = uid;
	}

	public SysLoggingId(Date timestamp, short uid, Integer msgId,
			String msgText, String msgSource, Integer errId, String errText) {
		this.timestamp = timestamp;
		this.uid = uid;
		this.msgId = msgId;
		this.msgText = msgText;
		this.msgSource = msgSource;
		this.errId = errId;
		this.errText = errText;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public short getUid() {
		return this.uid;
	}

	public void setUid(short uid) {
		this.uid = uid;
	}

	public Integer getMsgId() {
		return this.msgId;
	}

	public void setMsgId(Integer msgId) {
		this.msgId = msgId;
	}

	public String getMsgText() {
		return this.msgText;
	}

	public void setMsgText(String msgText) {
		this.msgText = msgText;
	}

	public String getMsgSource() {
		return this.msgSource;
	}

	public void setMsgSource(String msgSource) {
		this.msgSource = msgSource;
	}

	public Integer getErrId() {
		return this.errId;
	}

	public void setErrId(Integer errId) {
		this.errId = errId;
	}

	public String getErrText() {
		return this.errText;
	}

	public void setErrText(String errText) {
		this.errText = errText;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SysLoggingId))
			return false;
		SysLoggingId castOther = (SysLoggingId) other;

		return ((this.getTimestamp() == castOther.getTimestamp()) || (this
				.getTimestamp() != null && castOther.getTimestamp() != null && this
				.getTimestamp().equals(castOther.getTimestamp())))
				&& (this.getUid() == castOther.getUid())
				&& ((this.getMsgId() == castOther.getMsgId()) || (this
						.getMsgId() != null && castOther.getMsgId() != null && this
						.getMsgId().equals(castOther.getMsgId())))
				&& ((this.getMsgText() == castOther.getMsgText()) || (this
						.getMsgText() != null && castOther.getMsgText() != null && this
						.getMsgText().equals(castOther.getMsgText())))
				&& ((this.getMsgSource() == castOther.getMsgSource()) || (this
						.getMsgSource() != null
						&& castOther.getMsgSource() != null && this
						.getMsgSource().equals(castOther.getMsgSource())))
				&& ((this.getErrId() == castOther.getErrId()) || (this
						.getErrId() != null && castOther.getErrId() != null && this
						.getErrId().equals(castOther.getErrId())))
				&& ((this.getErrText() == castOther.getErrText()) || (this
						.getErrText() != null && castOther.getErrText() != null && this
						.getErrText().equals(castOther.getErrText())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTimestamp() == null ? 0 : this.getTimestamp().hashCode());
		result = 37 * result + this.getUid();
		result = 37 * result
				+ (getMsgId() == null ? 0 : this.getMsgId().hashCode());
		result = 37 * result
				+ (getMsgText() == null ? 0 : this.getMsgText().hashCode());
		result = 37 * result
				+ (getMsgSource() == null ? 0 : this.getMsgSource().hashCode());
		result = 37 * result
				+ (getErrId() == null ? 0 : this.getErrId().hashCode());
		result = 37 * result
				+ (getErrText() == null ? 0 : this.getErrText().hashCode());
		return result;
	}

}
