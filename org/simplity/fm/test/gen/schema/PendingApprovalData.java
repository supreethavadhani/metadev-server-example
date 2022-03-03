package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of pendingApproval
 */ 
public class PendingApprovalData extends SchemaData {

	protected PendingApprovalData(final PendingApprovalSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected PendingApprovalData newInstance(final Object[] arr) {
		return new PendingApprovalData((PendingApprovalSchema) this.schema, arr);
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
	 * set value for requestType
	 * @param value to be assigned to requestType
	 */
	public void setRequestType(String value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of requestType
	 */
	public String getRequestType(){
		return super.getStringValue(2);
	}

	/**
	 * set value for internalRefId
	 * @param value to be assigned to internalRefId
	 */
	public void setInternalRefId(long value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of internalRefId
	 */
	public long getInternalRefId(){
		return super.getLongValue(3);
	}

	/**
	 * set value for refText
	 * @param value to be assigned to refText
	 */
	public void setRefText(String value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of refText
	 */
	public String getRefText(){
		return super.getStringValue(4);
	}

	/**
	 * set value for usn
	 * @param value to be assigned to usn
	 */
	public void setUsn(String value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of usn
	 */
	public String getUsn(){
		return super.getStringValue(5);
	}

	/**
	 * set value for name
	 * @param value to be assigned to name
	 */
	public void setName(String value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of name
	 */
	public String getName(){
		return super.getStringValue(6);
	}

	/**
	 * set value for requestedDate
	 * @param value to be assigned to requestedDate
	 */
	public void setRequestedDate(LocalDate value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of requestedDate
	 */
	public LocalDate getRequestedDate(){
		return super.getDateValue(7);
	}

	/**
	 * set value for contactPerson
	 * @param value to be assigned to contactPerson
	 */
	public void setContactPerson(String value){
		this.fieldValues[8] = value;
	}

	/**
	 * @return value of contactPerson
	 */
	public String getContactPerson(){
		return super.getStringValue(8);
	}
}
