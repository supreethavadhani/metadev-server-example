package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of codedPaperName
 */ 
public class CodedPaperNameData extends SchemaData {

	protected CodedPaperNameData(final CodedPaperNameSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected CodedPaperNameData newInstance(final Object[] arr) {
		return new CodedPaperNameData((CodedPaperNameSchema) this.schema, arr);
	}

	/**
	 * set value for paperCode
	 * @param value to be assigned to paperCode
	 */
	public void setPaperCode(String value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of paperCode
	 */
	public String getPaperCode(){
		return super.getStringValue(0);
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
	 * set value for subjectRegisterId
	 * @param value to be assigned to subjectRegisterId
	 */
	public void setSubjectRegisterId(long value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of subjectRegisterId
	 */
	public long getSubjectRegisterId(){
		return super.getLongValue(2);
	}

	/**
	 * set value for isMakeup
	 * @param value to be assigned to isMakeup
	 */
	public void setIsMakeup(boolean value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of isMakeup
	 */
	public boolean getIsMakeup(){
		return super.getBoolValue(3);
	}

	/**
	 * set value for valuationRound
	 * @param value to be assigned to valuationRound
	 */
	public void setValuationRound(long value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of valuationRound
	 */
	public long getValuationRound(){
		return super.getLongValue(4);
	}

	/**
	 * set value for packetCode
	 * @param value to be assigned to packetCode
	 */
	public void setPacketCode(String value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of packetCode
	 */
	public String getPacketCode(){
		return super.getStringValue(5);
	}

	/**
	 * set value for offeredSubjectId
	 * @param value to be assigned to offeredSubjectId
	 */
	public void setOfferedSubjectId(long value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of offeredSubjectId
	 */
	public long getOfferedSubjectId(){
		return super.getLongValue(6);
	}

	/**
	 * set value for studentId
	 * @param value to be assigned to studentId
	 */
	public void setStudentId(long value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of studentId
	 */
	public long getStudentId(){
		return super.getLongValue(7);
	}

	/**
	 * set value for name
	 * @param value to be assigned to name
	 */
	public void setName(String value){
		this.fieldValues[8] = value;
	}

	/**
	 * @return value of name
	 */
	public String getName(){
		return super.getStringValue(8);
	}

	/**
	 * set value for usn
	 * @param value to be assigned to usn
	 */
	public void setUsn(String value){
		this.fieldValues[9] = value;
	}

	/**
	 * @return value of usn
	 */
	public String getUsn(){
		return super.getStringValue(9);
	}
}
