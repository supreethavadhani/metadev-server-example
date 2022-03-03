package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of packetAssignment
 */ 
public class PacketAssignmentData extends SchemaData {

	protected PacketAssignmentData(final PacketAssignmentSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected PacketAssignmentData newInstance(final Object[] arr) {
		return new PacketAssignmentData((PacketAssignmentSchema) this.schema, arr);
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
	 * set value for seqNo
	 * @param value to be assigned to seqNo
	 */
	public void setSeqNo(long value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of seqNo
	 */
	public long getSeqNo(){
		return super.getLongValue(1);
	}

	/**
	 * set value for instituteId
	 * @param value to be assigned to instituteId
	 */
	public void setInstituteId(long value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of instituteId
	 */
	public long getInstituteId(){
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
	 * set value for assignedAt
	 * @param value to be assigned to assignedAt
	 */
	public void setAssignedAt(Instant value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of assignedAt
	 */
	public Instant getAssignedAt(){
		return super.getTimestampValue(5);
	}

	/**
	 * set value for returnedAt
	 * @param value to be assigned to returnedAt
	 */
	public void setReturnedAt(Instant value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of returnedAt
	 */
	public Instant getReturnedAt(){
		return super.getTimestampValue(6);
	}
}
