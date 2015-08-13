package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

/**
 * MbSchichtTxtId generated by hbm2java
 */
public class MbSchichtTxtId implements java.io.Serializable {

	private int schImpId;
	private int schId;
	private short sprId;

	public MbSchichtTxtId() {
	}

	public MbSchichtTxtId(int schImpId, int schId, short sprId) {
		this.schImpId = schImpId;
		this.schId = schId;
		this.sprId = sprId;
	}

	public int getSchImpId() {
		return this.schImpId;
	}

	public void setSchImpId(int schImpId) {
		this.schImpId = schImpId;
	}

	public int getSchId() {
		return this.schId;
	}

	public void setSchId(int schId) {
		this.schId = schId;
	}

	public short getSprId() {
		return this.sprId;
	}

	public void setSprId(short sprId) {
		this.sprId = sprId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MbSchichtTxtId))
			return false;
		MbSchichtTxtId castOther = (MbSchichtTxtId) other;

		return (this.getSchImpId() == castOther.getSchImpId())
				&& (this.getSchId() == castOther.getSchId())
				&& (this.getSprId() == castOther.getSprId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSchImpId();
		result = 37 * result + this.getSchId();
		result = 37 * result + this.getSprId();
		return result;
	}

}