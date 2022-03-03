package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of approval
 */ 
public class ApprovalData extends SchemaData {

	protected ApprovalData(final ApprovalSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected ApprovalData newInstance(final Object[] arr) {
		return new ApprovalData((ApprovalSchema) this.schema, arr);
	}

	/**
	 * set value for approvalId
	 * @param value to be assigned to approvalId
	 */
	public void setApprovalId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of approvalId
	 */
	public long getApprovalId(){
		return super.getLongValue(0);
	}

	/**
	 * set value for instituteId
	 * @param value to be assigned to instituteId
	 */
	public void setInstituteId(long value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of instituteId
	 */
	public long getInstituteId(){
		return super.getLongValue(1);
	}

	/**
	 * set value for seasonId
	 * @param value to be assigned to seasonId
	 */
	public void setSeasonId(long value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of seasonId
	 */
	public long getSeasonId(){
		return super.getLongValue(2);
	}

	/**
	 * set value for requestType
	 * @param value to be assigned to requestType
	 */
	public void setRequestType(String value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of requestType
	 */
	public String getRequestType(){
		return super.getStringValue(3);
	}

	/**
	 * set value for internalRefId
	 * @param value to be assigned to internalRefId
	 */
	public void setInternalRefId(long value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of internalRefId
	 */
	public long getInternalRefId(){
		return super.getLongValue(4);
	}

	/**
	 * set value for refText
	 * @param value to be assigned to refText
	 */
	public void setRefText(String value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of refText
	 */
	public String getRefText(){
		return super.getStringValue(5);
	}

	/**
	 * set value for usn
	 * @param value to be assigned to usn
	 */
	public void setUsn(String value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of usn
	 */
	public String getUsn(){
		return super.getStringValue(6);
	}

	/**
	 * set value for name
	 * @param value to be assigned to name
	 */
	public void setName(String value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of name
	 */
	public String getName(){
		return super.getStringValue(7);
	}

	/**
	 * set value for narration
	 * @param value to be assigned to narration
	 */
	public void setNarration(String value){
		this.fieldValues[8] = value;
	}

	/**
	 * @return value of narration
	 */
	public String getNarration(){
		return super.getStringValue(8);
	}

	/**
	 * set value for oldValue
	 * @param value to be assigned to oldValue
	 */
	public void setOldValue(String value){
		this.fieldValues[9] = value;
	}

	/**
	 * @return value of oldValue
	 */
	public String getOldValue(){
		return super.getStringValue(9);
	}

	/**
	 * set value for newValue
	 * @param value to be assigned to newValue
	 */
	public void setNewValue(String value){
		this.fieldValues[10] = value;
	}

	/**
	 * @return value of newValue
	 */
	public String getNewValue(){
		return super.getStringValue(10);
	}

	/**
	 * set value for requestedByStaff
	 * @param value to be assigned to requestedByStaff
	 */
	public void setRequestedByStaff(long value){
		this.fieldValues[11] = value;
	}

	/**
	 * @return value of requestedByStaff
	 */
	public long getRequestedByStaff(){
		return super.getLongValue(11);
	}

	/**
	 * set value for requestedDate
	 * @param value to be assigned to requestedDate
	 */
	public void setRequestedDate(LocalDate value){
		this.fieldValues[12] = value;
	}

	/**
	 * @return value of requestedDate
	 */
	public LocalDate getRequestedDate(){
		return super.getDateValue(12);
	}

	/**
	 * set value for contactPerson
	 * @param value to be assigned to contactPerson
	 */
	public void setContactPerson(String value){
		this.fieldValues[13] = value;
	}

	/**
	 * @return value of contactPerson
	 */
	public String getContactPerson(){
		return super.getStringValue(13);
	}

	/**
	 * set value for contactPhone
	 * @param value to be assigned to contactPhone
	 */
	public void setContactPhone(String value){
		this.fieldValues[14] = value;
	}

	/**
	 * @return value of contactPhone
	 */
	public String getContactPhone(){
		return super.getStringValue(14);
	}

	/**
	 * set value for approvalStatus
	 * @param value to be assigned to approvalStatus
	 */
	public void setApprovalStatus(String value){
		this.fieldValues[15] = value;
	}

	/**
	 * @return value of approvalStatus
	 */
	public String getApprovalStatus(){
		return super.getStringValue(15);
	}

	/**
	 * set value for disposalRemarks
	 * @param value to be assigned to disposalRemarks
	 */
	public void setDisposalRemarks(String value){
		this.fieldValues[16] = value;
	}

	/**
	 * @return value of disposalRemarks
	 */
	public String getDisposalRemarks(){
		return super.getStringValue(16);
	}

	/**
	 * set value for disposedDate
	 * @param value to be assigned to disposedDate
	 */
	public void setDisposedDate(LocalDate value){
		this.fieldValues[17] = value;
	}

	/**
	 * @return value of disposedDate
	 */
	public LocalDate getDisposedDate(){
		return super.getDateValue(17);
	}

	/**
	 * set value for disposedByUser
	 * @param value to be assigned to disposedByUser
	 */
	public void setDisposedByUser(long value){
		this.fieldValues[18] = value;
	}

	/**
	 * @return value of disposedByUser
	 */
	public long getDisposedByUser(){
		return super.getLongValue(18);
	}

	/**
	 * set value for disposedByName
	 * @param value to be assigned to disposedByName
	 */
	public void setDisposedByName(String value){
		this.fieldValues[19] = value;
	}

	/**
	 * @return value of disposedByName
	 */
	public String getDisposedByName(){
		return super.getStringValue(19);
	}
}
