package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table (name="Library")


@Entity
public class BorrowRequest {

	
	@Id
    private int requestId;

    //  User-provided fields
	private String borrowerName;
    private String borrowerEmail;
    private String borrowerContact;

    private String itemType;        // book or magazine
    private String itemName;
    private String itemCategory;    // fiction, science, education, etc.
    private LocalDate borrowDate;

    // Explicitly set in service layer
    private LocalDate returnDeadline;
    private int finePerDay;
    private boolean returned;

    private int maxRenewalsAllowed;
    private int lateFineCap;
    private int reminderDaysBeforeDue;
    private boolean canBeRenewed;

    private boolean requiresDeposit;
    private int depositAmount;
    
    
    
    
    
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public String getBorrowerName() {
		return borrowerName;
	}
	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}
	public String getBorrowerEmail() {
		return borrowerEmail;
	}
	public void setBorrowerEmail(String borrowerEmail) {
		this.borrowerEmail = borrowerEmail;
	}
	public String getBorrowerContact() {
		return borrowerContact;
	}
	public void setBorrowerContact(String borrowerContact) {
		this.borrowerContact = borrowerContact;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemCategory() {
		return itemCategory;
	}
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}
	public LocalDate getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(LocalDate borrowDate) {
		this.borrowDate = borrowDate;
	}
	public LocalDate getReturnDeadline() {
		return returnDeadline;
	}
	public void setReturnDeadline(LocalDate returnDeadline) {
		this.returnDeadline = returnDeadline;
	}
	public int getFinePerDay() {
		return finePerDay;
	}
	public void setFinePerDay(int finePerDay) {
		this.finePerDay = finePerDay;
	}
	public boolean isReturned() {
		return returned;
	}
	public void setReturned(boolean returned) {
		this.returned = returned;
	}
	public int getMaxRenewalsAllowed() {
		return maxRenewalsAllowed;
	}
	public void setMaxRenewalsAllowed(int maxRenewalsAllowed) {
		this.maxRenewalsAllowed = maxRenewalsAllowed;
	}
	public int getLateFineCap() {
		return lateFineCap;
	}
	public void setLateFineCap(int lateFineCap) {
		this.lateFineCap = lateFineCap;
	}
	public int getReminderDaysBeforeDue() {
		return reminderDaysBeforeDue;
	}
	public void setReminderDaysBeforeDue(int reminderDaysBeforeDue) {
		this.reminderDaysBeforeDue = reminderDaysBeforeDue;
	}
	public boolean isCanBeRenewed() {
		return canBeRenewed;
	}
	public void setCanBeRenewed(boolean canBeRenewed) {
		this.canBeRenewed = canBeRenewed;
	}
	public boolean isRequiresDeposit() {
		return requiresDeposit;
	}
	public void setRequiresDeposit(boolean requiresDeposit) {
		this.requiresDeposit = requiresDeposit;
	}
	public int getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(int depositAmount) {
		this.depositAmount = depositAmount;
	}
    
    

 

}
