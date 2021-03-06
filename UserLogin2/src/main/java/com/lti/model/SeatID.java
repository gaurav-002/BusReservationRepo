package com.lti.model;

import java.io.Serializable;
import java.util.Date;

public class SeatID implements Serializable {

	private String seatId;
	private int busId;
	private String status;
	private Date busDepartureDate;
	
	
	public SeatID(){
		
	}
	
	public SeatID(String seatId, int busId, String status, Date busDepartureDate) {
		super();
		this.seatId = seatId;
		this.busId = busId;
		this.status = status;
		this.busDepartureDate = busDepartureDate;
	}

	public String getSeatId() {
		return seatId;
	}

	public void setSeatId(String seatId) {
		this.seatId = seatId;
	}

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getBusDepartureDate() {
		return busDepartureDate;
	}

	public void setBusDepartureDate(Date busDepartureDate) {
		this.busDepartureDate = busDepartureDate;
	}

	@Override
	public String toString() {
		return "SeatID [seatId=" + seatId + ", busId=" + busId + ", status=" + status + ", busDepartureDate="
				+ busDepartureDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((busDepartureDate == null) ? 0 : busDepartureDate.hashCode());
		result = prime * result + busId;
		result = prime * result + ((seatId == null) ? 0 : seatId.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SeatID other = (SeatID) obj;
		if (busDepartureDate == null) {
			if (other.busDepartureDate != null)
				return false;
		} else if (!busDepartureDate.equals(other.busDepartureDate))
			return false;
		if (busId != other.busId)
			return false;
		if (seatId == null) {
			if (other.seatId != null)
				return false;
		} else if (!seatId.equals(other.seatId))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	
	
	
}
