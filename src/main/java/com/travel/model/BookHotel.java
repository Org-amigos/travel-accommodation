package com.travel.model;

import java.util.Date;

public class BookHotel {

	public Integer bookId;
	public Date fromDate;
	public Date toDate;
	public Integer userId;
	public Integer cityId;
	public Integer costPaid;
	public Integer roomsBooked;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public Integer getCostPaid() {
		return costPaid;
	}

	public void setCostPaid(Integer costPaid) {
		this.costPaid = costPaid;
	}

	public Integer getRoomsBooked() {
		return roomsBooked;
	}

	public void setRoomsBooked(Integer roomsBooked) {
		this.roomsBooked = roomsBooked;
	}
}
