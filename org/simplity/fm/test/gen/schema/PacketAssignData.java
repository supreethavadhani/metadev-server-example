package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of packetAssign
 */ 
public class PacketAssignData extends SchemaData {

	protected PacketAssignData(final PacketAssignSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected PacketAssignData newInstance(final Object[] arr) {
		return new PacketAssignData((PacketAssignSchema) this.schema, arr);
	}

	/**
	 * set value for instituteId
	 * @param value to be assigned to instituteId
	 */
	public void setInstituteId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of instituteId
	 */
	public long getInstituteId(){
		return super.getLongValue(0);
	}

	/**
	 * set value for departmentId
	 * @param value to be assigned to departmentId
	 */
	public void setDepartmentId(long value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of departmentId
	 */
	public long getDepartmentId(){
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
	 * set value for evaluationId
	 * @param value to be assigned to evaluationId
	 */
	public void setEvaluationId(String value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of evaluationId
	 */
	public String getEvaluationId(){
		return super.getStringValue(3);
	}

	/**
	 * set value for evaluatorName
	 * @param value to be assigned to evaluatorName
	 */
	public void setEvaluatorName(String value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of evaluatorName
	 */
	public String getEvaluatorName(){
		return super.getStringValue(4);
	}

	/**
	 * set value for phoneNumber
	 * @param value to be assigned to phoneNumber
	 */
	public void setPhoneNumber(String value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of phoneNumber
	 */
	public String getPhoneNumber(){
		return super.getStringValue(5);
	}

	/**
	 * set value for packetId
	 * @param value to be assigned to packetId
	 */
	public void setPacketId(long value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of packetId
	 */
	public long getPacketId(){
		return super.getLongValue(6);
	}

	/**
	 * set value for packetName
	 * @param value to be assigned to packetName
	 */
	public void setPacketName(String value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of packetName
	 */
	public String getPacketName(){
		return super.getStringValue(7);
	}
}
