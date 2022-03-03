package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of answerPacketDetail
 */ 
public class AnswerPacketDetailData extends SchemaData {

	protected AnswerPacketDetailData(final AnswerPacketDetailSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected AnswerPacketDetailData newInstance(final Object[] arr) {
		return new AnswerPacketDetailData((AnswerPacketDetailSchema) this.schema, arr);
	}

	/**
	 * set value for packetId
	 * @param value to be assigned to packetId
	 */
	public void setPacketId(String value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of packetId
	 */
	public String getPacketId(){
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
	 * set value for offeredSubjectId
	 * @param value to be assigned to offeredSubjectId
	 */
	public void setOfferedSubjectId(long value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of offeredSubjectId
	 */
	public long getOfferedSubjectId(){
		return super.getLongValue(2);
	}

	/**
	 * set value for evaluatorId
	 * @param value to be assigned to evaluatorId
	 */
	public void setEvaluatorId(long value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of evaluatorId
	 */
	public long getEvaluatorId(){
		return super.getLongValue(3);
	}

	/**
	 * set value for subjectName
	 * @param value to be assigned to subjectName
	 */
	public void setSubjectName(String value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of subjectName
	 */
	public String getSubjectName(){
		return super.getStringValue(4);
	}

	/**
	 * set value for name
	 * @param value to be assigned to name
	 */
	public void setName(String value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of name
	 */
	public String getName(){
		return super.getStringValue(5);
	}

	/**
	 * set value for phoneNumber
	 * @param value to be assigned to phoneNumber
	 */
	public void setPhoneNumber(String value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of phoneNumber
	 */
	public String getPhoneNumber(){
		return super.getStringValue(6);
	}

	/**
	 * set value for email
	 * @param value to be assigned to email
	 */
	public void setEmail(String value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of email
	 */
	public String getEmail(){
		return super.getStringValue(7);
	}
}
